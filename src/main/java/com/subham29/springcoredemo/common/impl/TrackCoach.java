package com.subham29.springcoredemo.common.impl;

import com.subham29.springcoredemo.common.api.Coach;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

    TrackCoach() {
        System.out.println(getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "<h1>Run a hard 5K</h1>";
    }
}
