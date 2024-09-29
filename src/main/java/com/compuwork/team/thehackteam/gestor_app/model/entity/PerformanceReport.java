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
public class PerformanceReport {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
	// un reporte de desempeño tiene una fecha de creación
	
	@Column(name = "creation_date", nullable = false)
	private Date creationDate;
	
	// un reporte de desempeño tiene una lista de objetivos que se deben cumplir, esta es una relacion
	// de uno a muchos con la entidad Goal que se encarga de almacenar los objetivos
	
	@OneToMany(mappedBy = "performanceReport")
	private List<Goal> goals;
	
	// un reporte de desempeño tiene una lista de comentarios que se deben cumplir, esta es una relacion
	// de uno a muchos con la entidad Comment que se encarga de almacenar los comentarios
	
	@OneToMany(mappedBy = "performanceReport")
	private List<Comment> comments;
	
	
	
	
	
	
	
	
	
}
