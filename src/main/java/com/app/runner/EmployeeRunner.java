package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Employee;
import com.app.repositrory.EmployeeRepository;


@Component
public class EmployeeRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		
		repo.save(new Employee(1,"C",5.5,101));
		repo.save(new Employee(2,"D",6.6,102));
		repo.save(new Employee(3,"E",7.5,103));
		
	}

}
