package com.anirban.product.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.anirban.product.bindings.PersonType;

public interface PersonRepository extends MongoRepository<PersonType, String>{

}
