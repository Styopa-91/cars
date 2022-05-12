package com.project.dao;

import com.project.model.Car;

import java.util.List;
import java.util.UUID;

public interface GenericDao <T>{
    void add(T t);
    void delete(T t);
    void edit(T t);

}
