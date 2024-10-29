package com.iftm.start_example.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iftm.start_example.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, ObjectId>{
    
}
