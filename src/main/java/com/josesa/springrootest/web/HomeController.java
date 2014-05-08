package com.josesa.springrootest.web;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.josesa.springrootest.entity.Person;
import com.josesa.springrootest.entity.Project;
import com.josesa.springrootest.repository.ProjectRepository.ProjectSpecification;
import com.josesa.springrootest.service.PersonService;
import com.josesa.springrootest.service.ProjectService;

@RequestMapping("/home/**")
@Controller
public class HomeController {

	@Autowired
	private PersonService personService;
	@Autowired
	private ProjectService projectService;
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping
    public String index() {
    	List<Person> people = personService.findAllPeople();
    	logger.info("{}",people);
    	
    	List<Person> pinas = personService.findAllPinas();
    	logger.info("{}",pinas);
    	
    	List<Project> spec = projectService.findAll(ProjectSpecification.isNameInList("piña"));
    	logger.info("{}",spec);
    	
    	spec = projectService.findAll(ProjectSpecification.fullProjectInfo((long)1));
    	logger.info("Project owner: {}",spec.get(0).getOwner().getName());
    	for (Person person : spec.get(0).getParticipants()) {
    		logger.info("Project participant: {}",person.getName());
		}
    	
        return "home/index";
    }
}
