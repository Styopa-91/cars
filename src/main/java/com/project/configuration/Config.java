package com.project.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;


import javax.sql.DataSource;
import java.util.Properties;

@ComponentScan(basePackages = "com.project")
@EnableTransactionManagement
@Configuration
@PropertySource(value = {"classpath:application.properties"})
public class Config {
    @Autowired
    private Environment environment;

        @Bean
        public LocalSessionFactoryBean sessionFactory() {
            LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
            sessionFactory.setDataSource(dataSource());
            sessionFactory.setPackagesToScan("com.project.model");
            sessionFactory.setHibernateProperties(hibernateProperties());
            return sessionFactory;
        }

        @Bean
        public DataSource dataSource() {
            DriverManagerDataSource dataSource = new DriverManagerDataSource();
            dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driver-class-name"));
            dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
            dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
            dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
            return dataSource;
        }

        private Properties hibernateProperties() {
            Properties properties = new Properties();
            properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
            properties.setProperty("hibernate.hbm2ddl.auto", environment.getRequiredProperty("hibernate.hbm2ddl.auto"));
            properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show-sql"));
            properties.put("hibernate.format_sql", "true");
            return properties;
        }

        @Bean
//        @Autowired
        public HibernateTransactionManager transactionManager() {
            HibernateTransactionManager txManager = new HibernateTransactionManager();
            txManager.setSessionFactory(sessionFactory().getObject());
            return txManager;
        }


    }



