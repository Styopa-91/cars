package com.project.dao;

import java.util.List;
import java.util.UUID;

public interface GenericDao <T>{
    Class<T> getClas();
    public List<T> all();
    T add(T t);
    void delete(UUID id);
    T edit(T t);
    public T getById(UUID id);

}
