package com.spring.mongodbPractice.repository;

import com.spring.mongodbPractice.collections.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends MongoRepository<Person,String> {
}
