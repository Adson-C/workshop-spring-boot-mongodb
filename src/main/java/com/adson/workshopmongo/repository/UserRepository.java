package com.adson.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.adson.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}
