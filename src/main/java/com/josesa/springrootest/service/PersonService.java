package com.josesa.springrootest.service;
import java.util.List;

import org.springframework.roo.addon.layers.service.RooService;

import com.josesa.springrootest.entity.Person;

@RooService(domainTypes = { com.josesa.springrootest.entity.Person.class })
public interface PersonService {
	
	List<Person> findAllPinas();
	
}
