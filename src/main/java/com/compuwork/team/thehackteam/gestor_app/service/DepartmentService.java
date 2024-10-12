package com.compuwork.team.thehackteam.gestor_app.service;


import java.util.List;

import com.compuwork.team.thehackteam.gestor_app.model.entity.Department;

public interface DepartmentService {
	public List<Department> getDepartments();
	public Department getDepartmentById(Long id);
	public Department saveDepartment(Department department);
	public void deleteDepartment(Long id);
	public Department updateDepartment(Department department);
}
    