package com.compuwork.team.thehackteam.gestor_app.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "permanent_employee")
@PrimaryKeyJoinColumn(name = "id")
public class PermanentEmployee extends Employee{
	@Column(name = "benefits")
	private String benefits;
	
	@Column(name = "contract_type")
	private String contractType;
	
	@Column(name = "seniority")
	private String seniority;

	public PermanentEmployee() {
		super();
	}
	
	public PermanentEmployee(String benefits, String contractType, String seniority) {
		super();
		this.benefits = benefits;
		this.contractType = contractType;
		this.seniority = seniority;
	}
	
	public String getBenefits() {
		return benefits;
	}

	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getSeniority() {
		return seniority;
	}

	public void setSeniority(String seniority) {
		this.seniority = seniority;
	}		
	
	
}
