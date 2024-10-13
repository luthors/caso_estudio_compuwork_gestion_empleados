package com.compuwork.team.thehackteam.gestor_app.repository;

import com.compuwork.team.thehackteam.gestor_app.model.entity.Goal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoalRepository extends JpaRepository<Goal, Long> {
    List<Goal> findByPerformanceReportId(Long performanceReportId);
}