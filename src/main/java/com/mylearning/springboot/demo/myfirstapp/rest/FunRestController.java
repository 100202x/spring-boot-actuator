package com.mylearning.springboot.demo.myfirstapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //expose '/' rest controller that return Hello world

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/workout")
    public String getDailyWorkOut() {
        return "Run 5k Daily!";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Get Daily Fortune!";
    }

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Team name is "+teamName+" And coach is "+coachName;
    }

}
