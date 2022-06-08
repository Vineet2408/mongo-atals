package com.atlas.mongo.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.atlas.mongo.demo.model.User;

public interface UserRepository extends MongoRepository<User, String>{

}
