package com.kata.SpringbootPart1.service;

import com.kata.SpringbootPart1.model.User;

import java.util.Collection;

public interface UserService {
    void addUser(User user);
    void removeUser(long id);
    public abstract Collection<User> getUser();
}
