package com.luv2code.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springcoredemo.common.Coach;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach myCoach;

    //@Qualifier define qual dos Coachs será chamado
    //deve ser utilizado a sintax abaixo com a primeira letra minuscula
    @Autowired
    public DemoController(@Qualifier("baseballCoach") Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDeilyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
