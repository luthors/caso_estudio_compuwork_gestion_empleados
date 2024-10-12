package com.compuwork.team.thehackteam.gestor_app.service;

import com.compuwork.team.thehackteam.gestor_app.model.entity.Department;
import com.compuwork.team.thehackteam.gestor_app.model.entity.Employee;
import com.compuwork.team.thehackteam.gestor_app.repository.DeparmentRepository;
import com.compuwork.team.thehackteam.gestor_app.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl  implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;
    
    @Autowired
    private DeparmentRepository departmentRepository;

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Employee saveEmployee(Employee employee, Long idDepartment) {
		Department department = departmentRepository.findById(idDepartment).orElse(null);
		if (department == null) {
			throw new RuntimeException("Department not found");
		}
		employee.setDepartment(department);
		return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getEmployeesByDepartment(Long departmentId) {
        return employeeRepository.findByDepartmentId(departmentId);
    }
}
