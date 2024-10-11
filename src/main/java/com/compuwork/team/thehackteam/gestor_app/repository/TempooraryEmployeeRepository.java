package com.compuwork.team.thehackteam.gestor_app.repository;

import com.compuwork.team.thehackteam.gestor_app.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TempooraryEmployeeRepository extends JpaRepository<Employee, Long> {
    
}
