package com.compuwork.team.thehackteam.gestor_app.model.entity;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "role", nullable = false)
	private String role;
			
	@Column(name = "firts_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name", nullable = false)
	private String lastName;
		
	@Column(name = "id_number", nullable = false, unique = true)
	private String idNumber;
	
	@Column(name = "date_of_birth", nullable = false)
	private String dateOfBirth;
	
	@Column(name = "sex", nullable = false)
	private String sex;
	
	@Column(name = "email", nullable = false, unique = true)
	private String email;
	
	@Column(name = "health_insurance", nullable = false)
	private String healthInsurance;
		
	@Column(name = "entry_date", nullable = false)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date entryDate;
	
	@Column(name = "salary", nullable = false)
	private Double salary;
	
	@OneToOne(mappedBy = "employee")
	private Address address;
	
	@ManyToOne
	@JoinColumn(name = "departament_id")
	private Departament departament;
	
	@OneToMany(mappedBy = "employee")
	private List<PerformanceReport> performanceReports;
		
	@Column(name = "phone_number", nullable = false)
	private String phoneNumber;	
}
	