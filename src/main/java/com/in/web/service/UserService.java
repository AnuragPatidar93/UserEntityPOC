package com.in.web.service;

import com.in.web.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();

    User getUserById(int id);

    User createUser(User user);
}
