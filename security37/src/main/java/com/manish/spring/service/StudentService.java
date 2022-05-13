package com.manish.spring.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.manish.spring.domain.Response;
import com.manish.spring.domain.ResponseStatus;
import com.manish.spring.domain.Student;

@Service
public class StudentService {

	private HashMap<String, Student> map = new HashMap<>();

	public StudentService() {
		System.out.println("-- StudentService Def Cons --");
	}

	public Response<List<Student>> getAllStudent() {
		System.out.println("-- StudentService.getAllStudent --");
		Response<List<Student>> response = new Response<>();
		response.setData(new ArrayList<>(map.values()));
		return response;
	}

	public Response<Student> addStudent(Student stud) {
		System.out.println("-- StudentService.addStudent --");
		Response<Student> response = new Response<>();
		if (map.containsKey(stud.getSid())) {
			response.setStatus(ResponseStatus.ERROR);
			response.setErrorMessage("Id Already Exists " + stud.getSid());
		} else {
			if (map.values().stream().anyMatch(st -> st.getEmail().equals(stud.getEmail()))) {
				response.setStatus(ResponseStatus.ERROR);
				response.setErrorMessage("Email Already Exists " + stud.getEmail());
			} else {
				map.put(stud.getSid(), stud);
				response.setData(stud);
			}
		}
		return response;
	}

	public Response<Student> updateStudent(Student stud) {
		System.out.println("-- StudentService.updateStudent --");
		Response<Student> response = new Response<>();
		if (map.containsKey(stud.getSid())) {
			map.put(stud.getSid(), stud);
			response.setData(stud);
		} else {
			response.setStatus(ResponseStatus.ERROR);
			response.setErrorMessage("No Record Found " + stud.getSid());
		}
		return response;
	}

	public Response<Boolean> deleteAllStudent() {
		System.out.println("-- StudentService.deleteAllStudent --");
		Response<Boolean> response = new Response<>();
		map.clear();
		response.setData(true);
		return response;
	}
	
	
	public Response<Boolean> deleteStudentById(String sid) {
		System.out.println("-- StudentService.deleteStudentById --");
		Response<Boolean> response = new Response<>();
		if (map.containsKey(sid)) {
			map.remove(sid);
			response.setData(true);
		} else {
			response.setData(false);
			response.setStatus(ResponseStatus.ERROR);
			response.setErrorMessage("No Record Found " + sid);
		}
		return response;
	}
	
	public Response<Student> getStudentById(String sid) {
		System.out.println("-- StudentService.getStudentById --");
		Response<Student> response = new Response<>();
		if (map.containsKey(sid)) {
			response.setData(map.get(sid));			
		} else {
			response.setStatus(ResponseStatus.ERROR);
			response.setErrorMessage("No Record Found " + sid);
		}
		return response;
	}
	
	public Response<Student> getStudentByEmail(String email) {
		System.out.println("-- StudentService.getStudentById --");
		Response<Student> response = new Response<>();
		Optional<Student> opStud = map.values().stream().filter(st -> st.getEmail().equals(email)).findAny();
		if(opStud.isPresent()) {
			response.setData(opStud.get());	
		} else {
			response.setStatus(ResponseStatus.ERROR);
			response.setErrorMessage("No Record found " + email);
		}
		return response;
	}
	
	public Response<List<Student>> getStudentByPhone(long phone) {
		System.out.println("-- StudentService.getStudentByPhone --");
		Response<List<Student>> response = new Response<>();
		if(map.values().stream().anyMatch(st -> st.getPhone() == phone)) {
			List<Student> studs = map.values().stream().filter(st -> st.getPhone() == phone).collect(Collectors.toList());
			response.setData(studs);	
		} else {
			response.setStatus(ResponseStatus.ERROR);
			response.setErrorMessage("No Record found " + phone);
		}
		return response;
	}
	
}
