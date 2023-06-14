package com.spring.ATdevProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.ATdevProject.entity.ATstudent;
import com.spring.ATdevProject.service.ATservice;

@RestController
@RequestMapping("/stud")
public class Controller {
	@Autowired
	ATservice atservice;
	private ATstudent stud;
	
	@GetMapping("/stud")
	public List<ATstudent> GetAllStudent() {
		List<ATstudent>list=atservice.GetAllStudent();
		return list;
	}
	
	@PostMapping("/student")
	public ATstudent Insertstud(@RequestBody ATstudent stud) {
		ATstudent newstudent=atservice.Insertstud(stud);
		return newstudent;
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<ATstudent> UpdateStudent(@RequestBody ATstudent studentinfo, @PathVariable Integer id) {
		ATstudent newstudent=atservice.UpdateStudent(id , studentinfo);
		return ResponseEntity.ok(newstudent);
	}

	@DeleteMapping("/stude/{id}")
	public String deleteStudent(@PathVariable Integer id) {
		ATstudent studen=atservice.deleteStudent(id);
		return "Student Info Deleted Successfully...";
		
	}
	@GetMapping("/stu/{id}")
	public ResponseEntity<ATstudent> getById(@PathVariable Integer id) {
		ATstudent stud=atservice.getById(id);
		return ResponseEntity.ok(stud);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
