package org.example.repository;

import org.example.entity.User;

import java.util.List;

public class UserRepository implements BaseRepository<User> {

    @Override
    public User add(User element) {
        return null;
    }

    @Override
    public boolean delete(User element) {
        return false;
    }

    @Override
    public User update(User element) {
        return null;
    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public List<User> findByName(String name) {
        return null;
    }
}
