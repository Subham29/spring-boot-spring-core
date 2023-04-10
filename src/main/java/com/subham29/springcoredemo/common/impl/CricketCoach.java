package com.subham29.springcoredemo.common.impl;

import com.subham29.springcoredemo.common.api.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CricketCoach implements Coach {
    CricketCoach() {
        System.out.println(getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "<h1>Run around Cricket ground 20 times</h1>";
    }
    
    @PostConstruct
    public void doStartupStuff() {
        System.out.println("Starting Up");
    }
    
    @PreDestroy
    public void doCleanupStuff() {
        System.out.println("\"Cleaning Up\" = " + "Cleaning Up");
    }
}
