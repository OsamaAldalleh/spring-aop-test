package com.osama.spring_aop;

import com.osama.spring_aop.service.ShapeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopApplication {

    private static ShapeService shapeService;

    public SpringAopApplication(ShapeService shapeService) {
        SpringAopApplication.shapeService = shapeService;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringAopApplication.class, args);
        System.out.println(shapeService.getCircle().getName());
    }

}
