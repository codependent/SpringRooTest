package com.josesa.springrootest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.josesa.springrootest.entity.Person;
import com.josesa.springrootest.repository.PersonRepository;

public class PersonServiceImpl implements PersonService {

	@Autowired
    PersonRepository personRepository;
	
	@Override
	public List<Person> findAllPinas() {
		return personRepository.findByName("piña");
	}

}
