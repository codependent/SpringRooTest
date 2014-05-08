package com.josesa.springrootest.entity;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaEntity
@RooJson
@Entity
@Access(AccessType.FIELD)
@SuppressWarnings("serial")
public class Project implements Serializable {

    /**
     */
    private String name;

    /**
     */
    @ManyToOne
    private Person owner;
    
    @OneToMany(mappedBy="project", fetch=FetchType.LAZY)
    private List<Person> participants;
}
