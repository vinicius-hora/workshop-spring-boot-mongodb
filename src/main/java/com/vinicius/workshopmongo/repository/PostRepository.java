package com.vinicius.workshopmongo.repository;


import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vinicius.workshopmongo.domain.Post;
import com.vinicius.workshopmongo.domain.User;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

	User save(Optional<User> newObj);

	

	



	
	
}
