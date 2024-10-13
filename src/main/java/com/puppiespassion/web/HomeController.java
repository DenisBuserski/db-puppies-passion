package com.puppiespassion.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homeNoPath() {
        return "home.html";
    }

    @GetMapping("/home")
    public String home() {
        return "home.html";
    }

    @GetMapping("/about")
    public String aboutUs() {
        return "static-pages/about.html";
    }

    @GetMapping("/contacts")
    public String contactUs() {
        return "static-pages/contacts.html";
    }

    @GetMapping("/faq")
    public String faq() {
        return "static-pages/faq.html";
    }

    @GetMapping("/refund")
    public String refund() {
        return "static-pages/refund.html";
    }
}
