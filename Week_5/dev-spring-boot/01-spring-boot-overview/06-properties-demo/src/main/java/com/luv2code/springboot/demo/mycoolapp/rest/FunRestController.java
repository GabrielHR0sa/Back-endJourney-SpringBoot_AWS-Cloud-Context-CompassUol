package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //inject properties for coach.name and team.name ------------------

    //usando o @Value para inserir as propriedades personalizadas criadas
    // na aplication properties

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    //expose new endpoint for "teaminfo"

    @GetMapping("/teaminfo")
    public String geteTeamInfo() {
        return "Coach: " + coachName + ", Team name: " + teamName;
    }
    
    //-------------------------------------------------------------------

    // expose "/" that returns "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    //expose a new endpoint for "workout"

    //redireciona no browser ao digitar localhost:numero da porta/workout
    // executa o codigo abaixo
    @GetMapping("/workout")
    public String getDailyWorlout(){
        return "Run a hard 5k!";
    }

    //expose a new endpoint for "fortune"

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day";
    }
}
