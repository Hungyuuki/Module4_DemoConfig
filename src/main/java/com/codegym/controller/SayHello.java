package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SayHello {
    @GetMapping("/hello")
    public String hello(@RequestParam(required = false) String name, Model model){
        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("7Samurai")
    public String sevenSamurai(){
        return "7samurai";
    }


}
