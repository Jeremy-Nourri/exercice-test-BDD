package org.example.repository;

import org.example.entity.User;

import java.util.List;

public interface BaseRepository <T>{
   T add(T element);
    boolean delete(T element);
    T update(T element);
    T findById(int id);
    List<T> findByName(String name);
}
