package com.subham29.springcoredemo.common.impl;

import com.subham29.springcoredemo.common.api.Coach;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    TennisCoach() {
        System.out.println(getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "<h1>Practice your backhand</h1>";
    }
}
