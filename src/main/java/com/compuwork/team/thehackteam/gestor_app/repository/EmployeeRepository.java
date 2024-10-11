package com.compuwork.team.thehackteam.gestor_app.repository;

import com.compuwork.team.thehackteam.gestor_app.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //crear la consulta para buscar por findByDepartmentId
    public List<Employee> findByDepartmentId(Long departmentId);
}
