package com.rakib.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/", "/home"})
    public String showHome(Model model) {
        model.addAttribute("Welcometxt", "Welcomne to the Spring Security");
        return "home";
    }

    @GetMapping(value = "/hello")
    public String helloUser() {
        return "helloUser";
    }

    @GetMapping(value = "/login")
    public String loginUser(){
        return "login";
    }

}
