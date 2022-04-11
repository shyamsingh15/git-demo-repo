package com.example.springboot;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    @RequestMapping("/home")
     public String getAns(){
        return "Hii i m shyam";
    }
}