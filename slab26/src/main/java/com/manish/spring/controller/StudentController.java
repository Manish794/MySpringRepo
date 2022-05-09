package com.manish.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.manish.spring.domain.Student;
import com.manish.spring.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	public StudentController() {
		System.out.println("-- StudentController Def Cons");
	}

	@RequestMapping(value = "/getstudent", method = RequestMethod.GET)
	public String getStudent(ModelMap model) {
		System.out.println("/getStudent executed");
		model.put("ERROR", "No student found");
		return "home";
	}

	@RequestMapping(value = "/getstudent/{sid}", method = RequestMethod.GET)
	public ModelAndView searchStudent(@PathVariable("sid") String studId) {
		System.out.println("/searchStudent executed");
		Student st = studentService.searchStudent(studId);
		ModelAndView model = new ModelAndView();
		model.getModelMap().put("SID", st.getStudId());
		model.getModelMap().put("SNAME", st.getName());
		model.getModelMap().put("SEMAIL", st.getEmail());
		model.setViewName("home");
		return model;
	}

	@RequestMapping(value = "/getstudent1/{sid}", method = RequestMethod.GET)
	public String searchStudent1(ModelMap model, @PathVariable("sid") String studId) {
		System.out.println("/searchStudent executed");
		Student st = studentService.searchStudent(studId);
		model.put("SID", st.getStudId());
		model.put("SNAME", st.getName());
		model.put("SEMAIL", st.getEmail());
		return "home";
	}

}
