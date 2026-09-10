package com.example.springbootuiapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "");
        return "index";
    }

    @PostMapping("/greet")
    public String greet(@RequestParam(name = "name", required = false, defaultValue = "") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("greeting", name.isBlank() ? null : "Hello, " + name + "!");
        return "index";
    }

}
