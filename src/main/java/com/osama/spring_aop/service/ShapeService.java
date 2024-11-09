package com.osama.spring_aop.service;

import com.osama.spring_aop.model.Circle;
import com.osama.spring_aop.model.Triangle;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Getter
@Setter
@Service
public class ShapeService {

    private Circle circle;
    private Triangle triangle;

    public String getWhat(){
        return "WHAAT";
    }
}
