package com.kata.SpringbootPart1.fakeRepo;

import com.kata.SpringbootPart1.model.User;
import com.kata.SpringbootPart1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FakeRepoImplementation {
    @Autowired
    UserService userService;
    @RequestMapping (value = "/user", method = RequestMethod.POST)
    public ResponseEntity<Object> addUser(@RequestBody User user){
        userService.addUser(user);
        return  new ResponseEntity<>("User added successfully",HttpStatus.CREATED);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable ("id") String id){
        userService.removeUser(Long.parseLong(id));
        return  new ResponseEntity<>("User deleted successfully",HttpStatus.OK);
    }
    @RequestMapping(value = "/user")
    public ResponseEntity<Object> getUser(){
        return  new ResponseEntity<>(userService.getUser(), HttpStatus.OK);
    }
}
