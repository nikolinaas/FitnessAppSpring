package org.unibl.etf.ip.fitnessappspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/helloworld")
    public String hllo(){
        return "heloooooooooo";
    }

}
