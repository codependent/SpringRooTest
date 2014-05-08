package com.josesa.springrootest.service;
import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.roo.addon.layers.service.RooService;

import com.josesa.springrootest.entity.Project;

@RooService(domainTypes = { com.josesa.springrootest.entity.Project.class })
public interface ProjectService {
	
	List<Project> findAll(Specification<Project> spec);
}
