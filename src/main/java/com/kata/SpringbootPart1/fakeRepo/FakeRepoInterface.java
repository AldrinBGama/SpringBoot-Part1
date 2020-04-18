package com.kata.SpringbootPart1.fakeRepo;

import com.kata.SpringbootPart1.model.User;

public interface FakeRepoInterface<T> {
    public T insertUser(User user);

    public T findUserById(long id);

    public T deleteUser(long id);
}

