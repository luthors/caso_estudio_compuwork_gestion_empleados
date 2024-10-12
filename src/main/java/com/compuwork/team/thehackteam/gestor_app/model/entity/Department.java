package com.compuwork.team.thehackteam.gestor_app.model.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;


@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Department {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name", nullable = false)
	private String name;

	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Employee> employees;

	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "phone_number", nullable = false)
	private String phoneNumber;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
