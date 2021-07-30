package com.ctecx.hims.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentrepository;
	public void saveStudent(Student student) {
		
		studentrepository.save(student);
	}
	
	public List<Student> studentRecords(){
		
		return (List<Student>) studentrepository.findAll();
	}

}
