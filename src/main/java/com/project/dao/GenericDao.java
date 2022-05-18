package com.project.dao;

import java.util.List;
import java.util.UUID;

public interface GenericDao <T>{
    Class<T> getClas();
    public List<T> all();
    void add(T t);
    void delete(T t);
    void edit(T t);
    public T getById(UUID id);

}
