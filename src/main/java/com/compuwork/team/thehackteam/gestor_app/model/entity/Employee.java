package com.compuwork.team.thehackteam.gestor_app.model.entity;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
import lombok.*;

//@Getter
//@Setter
//@AllArgsConstructor
//@RequiredArgsConstructor
//@NoArgsConstructor
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
	@JoinColumn(name = "department_id")
	@JsonBackReference
	private Department department;

	@OneToMany(mappedBy = "employee")
	private List<PerformanceReport> performanceReports;
		
	@Column(name = "phone_number", nullable = false)
	private String phoneNumber;


	
	
	
	
	/**
	 * 
	 */
	public Employee() {
		super();
	}

	/**
	 * @param id
	 * @param role
	 * @param firstName
	 * @param lastName
	 * @param idNumber
	 * @param dateOfBirth
	 * @param sex
	 * @param email
	 * @param healthInsurance
	 * @param entryDate
	 * @param salary
	 * @param address
	 * @param department
	 * @param performanceReports
	 * @param phoneNumber
	 */
	public Employee(Long id, String role, String firstName, String lastName, String idNumber, String dateOfBirth,
			String sex, String email, String healthInsurance, Date entryDate, Double salary, Address address,
			Department department, List<PerformanceReport> performanceReports, String phoneNumber) {
		super();
		this.id = id;
		this.role = role;
		this.firstName = firstName;  //
		this.lastName = lastName;  //
		this.idNumber = idNumber;//
		this.dateOfBirth = dateOfBirth;//
		this.sex = sex;
		this.email = email;
		this.healthInsurance = healthInsurance;
		this.entryDate = entryDate;
		this.salary = salary;
		this.address = address;
		this.department = department;
		this.performanceReports = performanceReports;
		this.phoneNumber = phoneNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHealthInsurance() {
		return healthInsurance;
	}

	public void setHealthInsurance(String healthInsurance) {
		this.healthInsurance = healthInsurance;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<PerformanceReport> getPerformanceReports() {
		return performanceReports;
	}

	public void setPerformanceReports(List<PerformanceReport> performanceReports) {
		this.performanceReports = performanceReports;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	
	
	
}

	