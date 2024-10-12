package com.compuwork.team.thehackteam.gestor_app.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Behavior {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(name = "score", nullable = false) // is float
	private float score;
	
	//realacion con el reporte de desempeño
	@ManyToOne
	@JoinColumn(name = "performance_report_id")
	private PerformanceReport performanceReport;
	
	
}
