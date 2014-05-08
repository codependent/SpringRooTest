// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.josesa.springrootest.service;

import com.josesa.springrootest.entity.Person;
import com.josesa.springrootest.service.PersonServiceImpl;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

privileged aspect PersonServiceImpl_Roo_Service {
    
    declare @type: PersonServiceImpl: @Service;
    
    declare @type: PersonServiceImpl: @Transactional;
    
    public long PersonServiceImpl.countAllPeople() {
        return personRepository.count();
    }
    
    public void PersonServiceImpl.deletePerson(Person person) {
        personRepository.delete(person);
    }
    
    public Person PersonServiceImpl.findPerson(Long id) {
        return personRepository.findOne(id);
    }
    
    public List<Person> PersonServiceImpl.findAllPeople() {
        return personRepository.findAll();
    }
    
    public List<Person> PersonServiceImpl.findPersonEntries(int firstResult, int maxResults) {
        return personRepository.findAll(new org.springframework.data.domain.PageRequest(firstResult / maxResults, maxResults)).getContent();
    }
    
    public void PersonServiceImpl.savePerson(Person person) {
        personRepository.save(person);
    }
    
    public Person PersonServiceImpl.updatePerson(Person person) {
        return personRepository.save(person);
    }
    
}