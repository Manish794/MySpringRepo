package com.manish.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.manish.spring.domain.Response;
import com.manish.spring.domain.Student;
import com.manish.spring.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	public StudentController() {
		System.out.println("-- StudentController Def Cons --");
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Response getAllStudent() {
		System.out.println("-- StudentController.getAllStudent --");
		return studentService.getAllStudent();
	}
	
	@ResponseBody
	@RequestMapping(value="/sid/{stId}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Response getById(@PathVariable("stId") String sid) {
		System.out.println("-- StudentController.getAllStudent --");
		return studentService.getStudentById(sid);
	}
	
	@ResponseBody
	@RequestMapping(value="/email/{semail}",method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Response getByEmail(@PathVariable("semail") String email) {
		System.out.println("-- StudentController.getAllStudent --");
		return studentService.getStudentByEmail(email);
	}
	
	@ResponseBody
	@RequestMapping(value="/phone", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Response getByPhone(@RequestParam("sphone") long phone) {
		System.out.println("-- StudentController.getByPhone --");
		return studentService.getStudentByPhone(phone);
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST, 
		produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, 
		consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Response addStudent(@RequestBody Student stud) {
		System.out.println("-- StudentController.addStudent --");
		return studentService.addStudent(stud);
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.PUT, 
		produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, 
		consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE} )
	public Response updateStudent(@RequestBody Student stud) {
		System.out.println("-- StudentController.updateStudent --");
		return studentService.updateStudent(stud);
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.DELETE, 
		produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Response deleteAllStudent() {
		System.out.println("-- StudentController.deleteAllStudent --");
		return studentService.deleteAllStudent();
	}
		
	@ResponseBody
	@RequestMapping(value="/sid/{stId}", method = RequestMethod.DELETE, 
		produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Response deleteStudentById(@PathVariable("stId") String sid) {
		System.out.println("-- StudentController.deleteStudentById --");
		return studentService.deleteStudentById(sid);
	}

}
