package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dmpr0116 on 07.03.2017.
 */

@Controller
//@RequestMapping("/tenants")
@RequestMapping("/")
public class TenantsController {

    @RequestMapping
    public String allCustomers(){
        return "tenants/all";
    }
}
