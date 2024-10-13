package com.compuwork.team.thehackteam.gestor_app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.compuwork.team.thehackteam.gestor_app.model.entity.Behavior;
import com.compuwork.team.thehackteam.gestor_app.repository.BehaviorRepository;

@Service
public class BehaviorService {

  @Autowired
    private BehaviorRepository behaviorRepository;

    // public List<Behavior> getBehaviorsByPerformanceReportId(Long performanceReportId) {
    //     return behaviorRepository.findByPerformanceReportId(performanceReportId);
    // }

    public List<Behavior> getBehaviorsByPerformanceReportId(Long performanceReportId) {
      List<Behavior> behaviors = new ArrayList<>();

      Behavior behavior1 = new Behavior();
      behavior1.setId(1L);
      behavior1.setName("Trabajo en equipo");
      behavior1.setScore(4.5f);

      Behavior behavior2 = new Behavior();
      behavior2.setId(2L);
      behavior2.setName("Comunicación");
      behavior2.setScore(3.8f);

      Behavior behavior3 = new Behavior();
      behavior3.setId(3L);
      behavior3.setName("Resolución de problemas");
      behavior3.setScore(4.2f);

      Behavior behavior4 = new Behavior();
      behavior4.setId(4L);
      behavior4.setName("Puntualidad");
      behavior4.setScore(4.7f);

      Behavior behavior5 = new Behavior();
      behavior5.setId(5L);
      behavior5.setName("Iniciativa");
      behavior5.setScore(3.9f);

      behaviors.add(behavior1);
      behaviors.add(behavior2);
      behaviors.add(behavior3);
      behaviors.add(behavior4);
      behaviors.add(behavior5);

      return behaviors;
  }
}

