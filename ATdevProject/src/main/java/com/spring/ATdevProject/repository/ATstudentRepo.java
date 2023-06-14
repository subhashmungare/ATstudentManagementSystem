package com.spring.ATdevProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.ATdevProject.entity.ATstudent;
@Repository
public interface ATstudentRepo extends JpaRepository<ATstudent, Integer> {

}
