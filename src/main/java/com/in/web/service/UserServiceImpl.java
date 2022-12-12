package com.in.web.service;

import com.in.web.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Override
    public List<User> getAllUser() {
        return getUserList();
    }

    @Override
    public User getUserById(int id) {
        List<User> userList = getUserList();
        for (User user : userList) {
            if(user.getId() == id){
            return user;
            }
        }
        return null;
    }

    @Override
    public User createUser(User user) {
        List<User> userList = getUserList();
        userList.add(user);
        return user;
    }

    private static List<User> getUserList() {
        List<User> userList = new ArrayList<>();
        User user = new User(1,"ram",12);
        User user1 = new User(2,"shyam",13);
        User user2 = new User(3,"laxman",14);
        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        return userList;
    }
}
