package com.subham29.springcoredemo.config;

import com.subham29.springcoredemo.common.api.Coach;
import com.subham29.springcoredemo.common.impl.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
