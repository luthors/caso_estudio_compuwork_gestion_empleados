package com.compuwork.team.thehackteam.gestor_app;

import com.compuwork.team.thehackteam.gestor_app.model.entity.Department;
import com.compuwork.team.thehackteam.gestor_app.model.entity.Employee;
import com.compuwork.team.thehackteam.gestor_app.model.entity.PermanentEmployee;
import com.compuwork.team.thehackteam.gestor_app.repository.DeparmentRepository;
import com.compuwork.team.thehackteam.gestor_app.repository.EmployeeRepository;
import com.compuwork.team.thehackteam.gestor_app.service.EmployeeService;

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
	
	@Autowired
	private DeparmentRepository departmentRepository;
	
	@Autowired
	private EmployeeService employeeService;

	@Override
	public void run(String... args) throws Exception {
				
	}
}