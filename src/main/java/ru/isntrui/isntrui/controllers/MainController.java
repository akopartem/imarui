package ru.isntrui.isntrui.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/")
    public String get(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }
}
