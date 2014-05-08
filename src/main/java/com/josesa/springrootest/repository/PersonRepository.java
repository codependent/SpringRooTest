package com.josesa.springrootest.repository;
import java.util.List;

import com.josesa.springrootest.entity.Person;

import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = Person.class)
public interface PersonRepository {
	
	public List<Person> findByName(String name);
}
