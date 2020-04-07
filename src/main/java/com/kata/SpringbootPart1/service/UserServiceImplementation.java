package com.kata.SpringbootPart1.service;

import com.kata.SpringbootPart1.model.User;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImplementation implements UserService {
    private static Map<String, User> fakeRepo= new HashMap<>();
    static {
        User user = new User(1,"Herry","Potter");

        fakeRepo.put(String.valueOf(user.getId()), user);
    }
    @Override
    public void addUser(User user) {
        fakeRepo.put(String.valueOf(user.getId()),user);
    }

    @Override
    public void removeUser(long id) {
        fakeRepo.remove(id);
    }

    @Override
    public Collection<User> getUser() {
        return fakeRepo.values();
    }
}
