package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dmpr0116 on 07.03.2017.
 */

@Controller
public class TestController {

    @RequestMapping("/")
    public String render(){
        System.out.println("lalala");
        return "test";
    }
}
