package com.appwithspring.demo1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("details")
public String details(Model model){
    model.addAttribute("title","Hola mundo");
    model.addAttribute("name", "Briseyda");
    model.addAttribute("lastname", "Villasana");
    return"details";
}


}
