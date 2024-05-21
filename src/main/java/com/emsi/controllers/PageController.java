package com.emsi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/call")
    public String callPage() {
        return "call"; // Return the Thymeleaf template name for the call page
    }

    @GetMapping("/email")
    public String emailPage() {
        return "email"; // Return the Thymeleaf template name for the email page
    }

    @GetMapping("/meeting")
    public String meetingPage() {
        return "meeting"; // Return the Thymeleaf template name for the meeting page
    }

    @GetMapping("/chat")
    public String chatPage() {
        return "chat"; // Return the Thymeleaf template name for the chat page
    }

    /*@GetMapping("/home")
    public String homePage() {
        return "home"; // Returns the home.html template
    }*/

    @GetMapping("/interaction")
    public String contactPage() {
        return "interaction"; // Returns the contact.html template
    }


    @GetMapping("/home")
    public String hello(Model model) {
        model.addAttribute("message", "Hello World!");
        return "home"; // Suppose que vous avez une page 'home.html' pour afficher le message
    }
}
