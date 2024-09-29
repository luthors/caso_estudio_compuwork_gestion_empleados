package com.compuwork.team.thehackteam.gestor_app.model.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TemporaryEmployee")
@PrimaryKeyJoinColumn(name = "id")
public class TemporaryEmployee extends Employee{		
	@Column(name = "contract_end_date", nullable = false)
	private Date contractEndDate;
}
