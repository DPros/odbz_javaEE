package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.TemplateEngine;

import java.util.Locale;

/**
 * Created by dmpr0116 on 07.03.2017.
 */

@Controller
@RequestMapping("/tenants")
public class TenantsController {

    @Autowired
    MessageSource messageSource;

    @Autowired
    TemplateEngine templateEngine;

    @RequestMapping
    public String allCustomers(Model model) {
        String s = messageSource.getMessage("all.tenants", null, Locale.getDefault());
        model.addAttribute("list", new int[]{1, 2, 3, 4});
        return "tenants/all";
    }
}
