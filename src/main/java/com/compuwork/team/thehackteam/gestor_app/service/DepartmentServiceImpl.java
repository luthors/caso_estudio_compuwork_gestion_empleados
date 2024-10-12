package com.compuwork.team.thehackteam.gestor_app.service;

import com.compuwork.team.thehackteam.gestor_app.model.entity.Department;
import com.compuwork.team.thehackteam.gestor_app.repository.DeparmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl  implements DepartmentService{
	@Autowired
	private DeparmentRepository departmentRepository;

	@Override
	public List<Department> getDepartments() {
		return departmentRepository.findAll();
	}

	@Override
	public Department getDepartmentById(Long id) {
		return departmentRepository.findById(id).get();
	}

	@Override
	public Department saveDepartment(Department department) {
		return departmentRepository.save(null);
	}

	@Override
	public void deleteDepartment(Long id) {
		departmentRepository.deleteById(id);
	}

	@Override
	public Department updateDepartment(Department department) {
		return departmentRepository.save(department);
	}
	
	
	
		
}

    