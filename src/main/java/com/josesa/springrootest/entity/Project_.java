package com.josesa.springrootest.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Project.class)
public abstract class Project_ {

	public static volatile SingularAttribute<Project, Integer> id;
	public static volatile SingularAttribute<Project, String> name;
	public static volatile SingularAttribute<Project, Person> owner;
	public static volatile ListAttribute<Project, Person> participants;

}

