package com.josesa.springrootest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;

import com.josesa.springrootest.entity.Project;
import com.josesa.springrootest.repository.ProjectRepository;

public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	public List<Project> findAll(Specification<Project> spec){
		return projectRepository.findAll(spec);
	}
	
}
