package org.example.banbanh_be.service;

import java.util.Optional;

public interface IGenerateService <T>{
    Iterable<T> findAll();

    Optional<T> findById(int id);

    T save(T t);
    void delete(int id);
}
