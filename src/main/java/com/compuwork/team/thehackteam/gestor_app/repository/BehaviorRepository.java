package com.compuwork.team.thehackteam.gestor_app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.compuwork.team.thehackteam.gestor_app.model.entity.Behavior;

@Repository
public interface BehaviorRepository extends JpaRepository<Behavior, Long> {
    List<Behavior> findByPerformanceReportId(Long performanceReportId);
}