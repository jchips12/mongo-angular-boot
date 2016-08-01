package com.jchips12.mongo.angular.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jchips12.mongo.angular.boot.entity.User;
import com.jchips12.mongo.angular.boot.repository.UserRepository;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByFirstName(String firstName) {
        return userRepository.findByFirstName(firstName);
    }

    @Override
    public List<User> findByLastName(String lastName) {
        return userRepository.findByLastName(lastName);
    }

}
