package com.subham29.springcoredemo.controller;

import com.subham29.springcoredemo.common.api.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

    @Autowired
    DemoController(@Qualifier("cricketCoach") Coach theCoach) {
        System.out.println(getClass().getSimpleName());
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkOut() {
        return myCoach.getDailyWorkout();
    }
}
