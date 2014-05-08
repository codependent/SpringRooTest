package com.josesa.springrootest.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.josesa.springrootest.entity.Project;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;

@RequestMapping("/projects")
@Controller
@RooWebScaffold(path = "projects", formBackingObject = Project.class)
public class ProjectController {
}
