package com.anirban.product.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anirban.product.bindings.PersonType;
import com.anirban.product.repositories.PersonRepository;

@Service
public class PersonService {

	@Autowired
	PersonRepository personRepository;

	public Optional<PersonType> findById(String id) {
		Optional<PersonType> person = personRepository.findById(id);
		return person;
	}

	public List<PersonType> findAll() {
		
		List<PersonType> persons = personRepository.findAll(); 
		return persons;
	}

	public String save(PersonType person) {
		
		PersonType result= personRepository.save(person);
		return result.getFirstName();
	}
	
	
}
