package com.subham29.springcoredemo.common.impl;

import com.subham29.springcoredemo.common.api.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "<h1>Do 40 home Runs</h1>";
    }
}
