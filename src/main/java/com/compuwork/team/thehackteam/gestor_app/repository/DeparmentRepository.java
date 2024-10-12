package com.compuwork.team.thehackteam.gestor_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compuwork.team.thehackteam.gestor_app.model.entity.Department;

public interface DeparmentRepository extends JpaRepository<Department, Long> {
}
