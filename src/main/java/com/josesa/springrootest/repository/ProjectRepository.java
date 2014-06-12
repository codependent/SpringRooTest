package com.josesa.springrootest.repository;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

import com.josesa.springrootest.entity.Person;
import com.josesa.springrootest.entity.Person_;
import com.josesa.springrootest.entity.Project;
import com.josesa.springrootest.entity.Project_;

@RooJpaRepository(domainType = Project.class)
public interface ProjectRepository extends JpaSpecificationExecutor<Project>{
	
	/**
	 * Aproximación pura de Spring Data JPA, es necesario generar Specifications donde se pueden
	 * customizar los joins y fetches {@link ProjectSpecification}. También permite pasar {@link Pageable}
	 */
	List<Project> findAll(Specification<Project> spec);
	
	public class ProjectSpecification{
		public static Specification<Project> isNameInList(final String ... names) {
			return new Specification<Project>() {
				@SuppressWarnings("unchecked")
				public Predicate toPredicate(Root<Project> root,
						CriteriaQuery<?> query, CriteriaBuilder builder) {
					Join<Project, Person> people = (Join<Project, Person>)root.fetch(Project_.owner, JoinType.LEFT);
					return people.get(Person_.name).in((Object[])names);
				}
			};
		}
		
		public static Specification<Project> fullProjectInfo(final Long projectId) {
			return new Specification<Project>() {
				@SuppressWarnings({ "unused", "unchecked" })
				public Predicate toPredicate(Root<Project> root,
						CriteriaQuery<?> query, CriteriaBuilder builder) {
					//Joins para evitar subqueries
					Join<Project, Person> people = (Join<Project, Person>)root.fetch(Project_.owner, JoinType.LEFT);
					Join<Project, Person> participants = (Join<Project, Person>)root.fetch(Project_.participants, JoinType.LEFT);
					Predicate pred = builder.equal(root.get(Project_.id), projectId);
					return pred;
				}
			};
		}
	}
	
}
