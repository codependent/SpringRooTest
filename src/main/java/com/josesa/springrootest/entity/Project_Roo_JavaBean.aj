// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.josesa.springrootest.entity;

import com.josesa.springrootest.entity.Person;
import com.josesa.springrootest.entity.Project;
import java.util.List;

privileged aspect Project_Roo_JavaBean {
    
    public String Project.getName() {
        return this.name;
    }
    
    public void Project.setName(String name) {
        this.name = name;
    }
    
    public Person Project.getOwner() {
        return this.owner;
    }
    
    public void Project.setOwner(Person owner) {
        this.owner = owner;
    }
    
    public List<Person> Project.getParticipants() {
        return this.participants;
    }
    
    public void Project.setParticipants(List<Person> participants) {
        this.participants = participants;
    }
    
}