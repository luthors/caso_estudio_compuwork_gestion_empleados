package com.compuwork.team.thehackteam.gestor_app.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "permanent_employee")
@PrimaryKeyJoinColumn(name = "id")
public class PermanentEmployee extends Employee{
	@Column(name = "benefits", nullable = false)
	private String benefits;
	
	@Column(name = "contract_type", nullable = false)
	private String contractType;
	
	@Column(name = "seniority", nullable = false)
	private String seniority;		
}
