package com.osama.spring_aop.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Circle {

    private String name;

    public String getType(String a, String b){
        return a;
    }
}
