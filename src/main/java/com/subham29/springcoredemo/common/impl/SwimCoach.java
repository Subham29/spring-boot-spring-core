package com.subham29.springcoredemo.common.impl;

import com.subham29.springcoredemo.common.api.Coach;

public class SwimCoach implements Coach {
    public SwimCoach() {
        System.out.println("SwimCoach.SwimCoach");
    }
    @Override
    public String getDailyWorkout() {
        return "<h1>Swim 1000 metres as Warmup</h1>";
    }
}
