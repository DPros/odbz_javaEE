package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dmpr0116 on 07.03.2017.
 */

@Controller
//@RequestMapping("/")
public class MainPageController {

    @RequestMapping
    public String render() {
        return "main";
    }
}
