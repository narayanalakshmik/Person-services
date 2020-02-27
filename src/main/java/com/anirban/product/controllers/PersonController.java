package com.anirban.product.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anirban.product.bindings.PersonType;
import com.anirban.product.repositories.PersonRepository;
import com.anirban.product.services.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	@GetMapping("/persons/{id}")
	public Optional<PersonType> readPerson(@PathVariable("id") String id) {
		
		return personService.findById(id);
	}
	
	@GetMapping("/persons")
	public List<PersonType> readPersons() {
		
		List<PersonType> persons = personService.findAll();
		
		return persons;
		
	}
	
	@PostMapping("/persons/{id}")
	public String insertPerson(@RequestBody PersonType person, @PathVariable("id") int id) {
		String firstName = personService.save(person);
		return firstName + " record inserted";
	}
}
