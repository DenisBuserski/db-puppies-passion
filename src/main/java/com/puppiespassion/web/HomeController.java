package com.puppiespassion.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "home.html";
    }

    @GetMapping("/")
    public String homeNoPath() {
        return "home.html";
    }
}
