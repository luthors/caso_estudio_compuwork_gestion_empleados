package com.compuwork.team.thehackteam.gestor_app;

import com.compuwork.team.thehackteam.gestor_app.model.entity.Employee;
import com.compuwork.team.thehackteam.gestor_app.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

@SpringBootApplication
public class GestorEmpleadosApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(GestorEmpleadosApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		/*Employee employee = new Employee();
		employee.setRole("Software Developer");
		employee.setSalary(1000d);
		employee.setFirstName("Johwn");
		employee.setLastName("Doe");
		employee.setEmail("jhon_doe3w@mail.com");
		employee.setPhoneNumber("1234567890");
		employee.setDateOfBirth("01/01/1990");
		employee.setEntryDate(Date.valueOf("2021-01-01"));
		employee.setHealthInsurance("AXA");

		employee.setIdNumber("123452367890");
		employee.setSex("M");

		employeeRepository.save(employee);
*/
	}
}