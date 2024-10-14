package com.compuwork.team.thehackteam.gestor_app.service;

import com.compuwork.team.thehackteam.gestor_app.model.entity.Goal;
import com.compuwork.team.thehackteam.gestor_app.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class GoalService {

    @Autowired
    private GoalRepository goalRepository;

    public List<Goal> getGoalsByPerformanceReportId(Long performanceReportId) {
        List<Goal> goals = new ArrayList<>();

        Goal goal1 = new Goal();
        goal1.setId(1L);
        goal1.setDescription("Aumentar las ventas en un 10%");
        goal1.setStatus("Pendiente");
        goal1.setDeadline(new Date(System.currentTimeMillis() + 7776000000L));

        Goal goal2 = new Goal();
        goal2.setId(2L);
        goal2.setDescription("Implementar nuevo sistema CRM");
        goal2.setStatus("Finalizado");
        goal2.setDeadline(new Date(System.currentTimeMillis() + 15552000000L));

        Goal goal3 = new Goal();
        goal3.setId(3L);
        goal3.setDescription("Mejorar la satisfacción del cliente en un 15%");
        goal3.setStatus("Iniciado");
        goal3.setDeadline(new Date(System.currentTimeMillis() + 31536000000L));

        Goal goal4 = new Goal();
        goal4.setId(4L);
        goal4.setDescription("Reducir los costos operativos en un 5%");
        goal4.setStatus("Finalizado");
        goal4.setDeadline(new Date(System.currentTimeMillis() + 15552000000L));

        Goal goal5 = new Goal();
        goal5.setId(5L);
        goal5.setDescription("Completar entrenamiento de liderazgo");
        goal5.setStatus("En desarrollo");
        goal5.setDeadline(new Date(System.currentTimeMillis() + 7776000000L));

        goals.add(goal1);
        goals.add(goal2);
        goals.add(goal3);
        goals.add(goal4);
        goals.add(goal5);

        return goals;
    }
}