package com.adson.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.adson.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
