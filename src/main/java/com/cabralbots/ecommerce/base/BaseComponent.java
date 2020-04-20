package com.cabralbots.ecommerce.base;

import io.swagger.models.Model;

import java.util.List;
import java.util.Optional;

public abstract class BaseComponent<T> {
    public abstract void Save(T t);
    public abstract List<T> GetList();
    public abstract List<T> GetListByID(T t);
    public abstract void Delete(T t);
    public abstract Optional<T> GetById(T t);
}
