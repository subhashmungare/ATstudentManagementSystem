package com.spring.ATdevProject.service;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.spring.ATdevProject.entity.ATstudent;
import com.spring.ATdevProject.exception.ResourceNotFoundException;
import com.spring.ATdevProject.repository.ATstudentRepo;

@Service
public class ATservice {
	@Autowired
	ATstudentRepo atrepo;
	
	public List<ATstudent> GetAllStudent() {
		return atrepo.findAll();
	}

	public ATstudent Insertstud(ATstudent stud) {
		ATstudent newstudent=atrepo.save(stud);
		return newstudent;
	}

	public ATstudent UpdateStudent(Integer id, ATstudent studentinfo) {
		
		ATstudent newstudent=atrepo.findById(id).
				orElseThrow(()-> new ResourceNotFoundException("Student not found with id"+id));
		newstudent.setContactNum(studentinfo.getContactNum());
		newstudent.setDepartment(studentinfo.getDepartment());
		newstudent.setEmailid(studentinfo.getEmailid());
		newstudent.setStudentName(studentinfo.getStudentName());
		return atrepo.save(newstudent);
		
		
	}
	
	public ATstudent deleteStudent(Integer id) {
		ATstudent student=atrepo.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Student not found with id"+id));
	atrepo.delete(student);
	return student;
	}

	public ATstudent getById(Integer id) {
		ATstudent stud=atrepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Id will be not available"+ id));
		return stud;
	}

	
	

	



	
	
	
}
