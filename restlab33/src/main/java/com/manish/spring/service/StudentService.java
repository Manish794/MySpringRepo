package com.manish.spring.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.manish.spring.domain.Response;
import com.manish.spring.domain.Student;

@Service
public class StudentService {

	private HashMap<String, Student> map = new HashMap<>();

	public StudentService() {
		System.out.println("-- StudentService Def Cons --");
	}

	public Response getAllStudent() {
		System.out.println("-- StudentService.getAllStudent --");
		Response response = new Response();
		response.setStudents(new ArrayList<>(map.values()));
		return response;
	}

	public Response addStudent(Student stud) {
		System.out.println("-- StudentService.addStudent --");
		Response response = new Response();
		if (map.containsKey(stud.getSid())) {
			response.setStatus("ERROR");
			response.setErrorMessage("Id Already Exists " + stud.getSid());
		} else {
			if (map.values().stream().anyMatch(st -> st.getEmail().equals(stud.getEmail()))) {
				response.setStatus("ERROR");
				response.setErrorMessage("Email Already Exists " + stud.getEmail());
			} else {
				map.put(stud.getSid(), stud);
				response.setStudent(stud);
			}
		}
		return response;
	}

	public Response updateStudent(Student stud) {
		System.out.println("-- StudentService.updateStudent --");
		Response response = new Response();
		if (map.containsKey(stud.getSid())) {
			map.put(stud.getSid(), stud);
			response.setStudent(stud);
		} else {
			response.setStatus("ERROR");
			response.setErrorMessage("No Record Found " + stud.getSid());
		}
		return response;
	}

	public Response deleteAllStudent() {
		System.out.println("-- StudentService.deleteAllStudent --");
		Response response = new Response();
		map.clear();
		return response;
	}
	
	
	public Response deleteStudentById(String sid) {
		System.out.println("-- StudentService.deleteStudentById --");
		Response response = new Response();
		if (map.containsKey(sid)) {
			map.remove(sid);			
		} else {
			response.setStatus("ERROR");
			response.setErrorMessage("No Record Found " + sid);
		}
		return response;
	}
	
	public Response getStudentById(String sid) {
		System.out.println("-- StudentService.getStudentById --");
		Response response = new Response();
		if (map.containsKey(sid)) {
			response.setStudent(map.get(sid));			
		} else {
			response.setStatus("ERROR");
			response.setErrorMessage("No Record Found " + sid);
		}
		return response;
	}
	
	public Response getStudentByEmail(String email) {
		System.out.println("-- StudentService.getStudentById --");
		Response response = new Response();
		Optional<Student> opStud = map.values().stream().filter(st -> st.getEmail().equals(email)).findAny();
		if(opStud.isPresent()) {
			response.setStudent(opStud.get());	
		} else {
			response.setStatus("ERROR");
			response.setErrorMessage("No Record found " + email);
		}
		return response;
	}
	
	public Response getStudentByPhone(long phone) {
		System.out.println("-- StudentService.getStudentByPhone --");
		Response response = new Response();
		Optional<Student> opStud = map.values().stream().filter(st -> st.getPhone() == phone).findAny();
		if(opStud.isPresent()) {
			response.setStudent(opStud.get());	
		} else {
			response.setStatus("ERROR");
			response.setErrorMessage("No Record found " + phone);
		}
		return response;
	}
	
}
