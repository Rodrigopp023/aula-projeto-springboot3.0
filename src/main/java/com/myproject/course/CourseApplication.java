package com.myproject.course;

import com.myproject.course.entities.Employee;
import com.myproject.course.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApplication implements CommandLineRunner {

	@Autowired
	private SalaryService salaryService;

	public static void main(String[] args) {
		SpringApplication.run(CourseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee("Maria", 4000.0);
		System.out.println(salaryService.netSalary(employee));
	}
}
