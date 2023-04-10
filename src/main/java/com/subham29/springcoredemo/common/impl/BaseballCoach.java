package com.subham29.springcoredemo.common.impl;

import com.subham29.springcoredemo.common.api.Coach;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    BaseballCoach() {
        System.out.println(getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "<h1>Do 40 home Runs</h1>";
    }
}
