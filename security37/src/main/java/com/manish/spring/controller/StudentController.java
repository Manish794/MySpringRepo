package com.manish.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.manish.spring.domain.Response;
import com.manish.spring.domain.Student;
import com.manish.spring.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	public StudentController() {
		System.out.println("-- StudentController Def Cons --");
	}

	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Response<List<Student>> getAllStudent() {
		System.out.println("-- StudentController.getAllStudent --");
		return studentService.getAllStudent();
	}

	@GetMapping(value = "/sid/{stId}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Response<Student> getById(@PathVariable("stId") String sid) {
		System.out.println("-- StudentController.getAllStudent --");
		return studentService.getStudentById(sid);
	}

	@GetMapping(value = "/email/{semail}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public Response<Student> getByEmail(@PathVariable("semail") String email) {
		System.out.println("-- StudentController.getAllStudent --");
		return studentService.getStudentByEmail(email);
	}

	@GetMapping(value = "/phone", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Response<List<Student>> getByPhone(@RequestParam("sphone") long phone) {
		System.out.println("-- StudentController.getByPhone --");
		return studentService.getStudentByPhone(phone);
	}

	@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Response<Student> addStudent(@RequestBody Student stud) {
		System.out.println("-- StudentController.addStudent --");
		return studentService.addStudent(stud);
	}

	@PutMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Response<Student> updateStudent(@RequestBody Student stud) {
		System.out.println("-- StudentController.updateStudent --");
		return studentService.updateStudent(stud);
	}

	@DeleteMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Response<Boolean> deleteAllStudent() {
		System.out.println("-- StudentController.deleteAllStudent --");
		return studentService.deleteAllStudent();
	}

	@DeleteMapping(value = "/sid/{stId}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public Response<Boolean> deleteStudentById(@PathVariable("stId") String sid) {
		System.out.println("-- StudentController.deleteStudentById --");
		return studentService.deleteStudentById(sid);
	}

}
