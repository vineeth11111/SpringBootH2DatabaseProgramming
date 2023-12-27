package com.csgroup.hyd.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csgroup.hyd.model.Student;
import com.csgroup.hyd.repo.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentTestRunner implements CommandLineRunner{

	private @Autowired StudentRepository studentRepo;
	@Override
	public void run(String... args) throws Exception {
		//Create
		studentRepo.save(new Student("azeez", "CSE", 10000.00));
	    studentRepo.save(new Student("sumanth", "Mining", 75000.00));
		studentRepo.save(new Student("sunil", "Mining", 15000.00));
		studentRepo.save(new Student("mohan", "Mining", 10000.00));
		studentRepo.save(new Student("manoj", "CSE", 35000.00));
		studentRepo.save(new Student("vineeth", "CSE", 35000.00));
		// Read Using H2 Console.
		//Update
		studentRepo.save(new Student(6, "vineeth", "CSE", 35000.00));
		studentRepo.save(new Student(4, "mohan", "Mining", 10000.00));
		
		//Delete
		//studentRepo.deleteById(1);
	}

	
	
}
