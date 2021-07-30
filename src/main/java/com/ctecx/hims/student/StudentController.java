package com.ctecx.hims.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentService studetservice;

	@GetMapping()
	public String studentForm(Model model) {
		Student student = new Student();

		model.addAttribute("students", student);

		return "list";
	}
	
	
	@GetMapping("/add")
	public String studentlist(Model model) {
		Student student = new Student();

		model.addAttribute("students", student);

		return "addStudent";
	}


	@PostMapping("/save")
	public String saveStudents(Student student) {

		studetservice.saveStudent(student);

		return "redirect:/";
	}

}
