package com.compuwork.team.thehackteam.gestor_app.service;

import com.compuwork.team.thehackteam.gestor_app.model.entity.Employee;
import java.util.List;

public interface EmployeeService {
    public List<Employee> getEmployees();
    public Employee getEmployeeById(Long id);
    public Employee saveEmployee(Employee employee, Long idDepartment);
    public void deleteEmployee(Long id);
    public Employee updateEmployee(Employee employee);
    public List<Employee> getEmployeesByDepartment(Long departmentId);

}
