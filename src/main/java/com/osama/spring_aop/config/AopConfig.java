package com.osama.spring_aop.config;

import com.osama.spring_aop.model.Circle;
import com.osama.spring_aop.model.Triangle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

@Configuration
public class AopConfig {

    @Bean
    Circle circle() {
        return new Circle("Circle name");
    }

    @Bean
    Triangle triangle() {
        return new Triangle("Triangle name");
    }
}
