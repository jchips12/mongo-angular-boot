package com.jchips12.mongo.angular.boot.service;

import java.util.List;

import com.jchips12.mongo.angular.boot.entity.User;

public interface UserService {

    User findByFirstName(String firstName);

    List<User> findByLastName(String lastName);

}
