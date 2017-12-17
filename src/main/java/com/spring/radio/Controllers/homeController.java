package com.spring.radio.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {

    @GetMapping("/index")
    public String homePage(){
        return "Index-RadioPage";
    }

}
