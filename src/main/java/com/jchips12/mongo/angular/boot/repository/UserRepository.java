package com.jchips12.mongo.angular.boot.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jchips12.mongo.angular.boot.entity.User;

public interface UserRepository extends MongoRepository<User, String> {

    public User findByFirstName(String firstName);

    public List<User> findByLastName(String lastName);
    
}
