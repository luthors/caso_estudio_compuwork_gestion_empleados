package com.compuwork.team.thehackteam.gestor_app.model.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Goal {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "performance_report_id")
	private PerformanceReport performanceReport;
	
	@Column(name = "description", nullable = false)
	private String description;
	
	@Column(name = "status", nullable = false)
	private String status;
	
	@Column(name = "deadline", nullable = false)
	private Date deadline;
	
}
