package com.in.web.controller;

import com.in.web.entity.User;
import com.in.web.exception.UserNotFoundException;
import com.in.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

@RestController
public class UserController {

    @Autowired
    private MessageSource messageSource;
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable(name = "id") int id){
        User user = userService.getUserById(id);
        if(user == null){
            throw new UserNotFoundException("No user found for the ID : "+ id);
        }

        return user;
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @RequestMapping("/helloWorld")
    public String helloWorld(@RequestHeader(name = "Accept-Language", required = false) Locale locale){
        return messageSource.getMessage("messages.goodmorning", null, locale);
    }
}
