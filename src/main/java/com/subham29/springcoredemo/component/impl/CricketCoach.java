package com.subham29.springcoredemo.component.impl;

import com.subham29.springcoredemo.component.api.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "<h1>Run around Cricket ground!!!</h1>";
    }
}
