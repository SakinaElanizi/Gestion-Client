package com.emsi.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;


@Controller
@RequestMapping("/interaction")
public class InteractionController {

    @GetMapping("/interaction")
    public String showInteractionForm() {
        return "interaction"; // This should match the name of your Thymeleaf template
    }

    @PostMapping("/chooseInteraction")
    public String chooseInteraction(@RequestParam("interactionType") String interactionType){
        switch (interactionType) {
            case "call":
                return "redirect:/call"; // Redirect to the call page
            case "email":
                return "redirect:/email"; // Redirect to the email page
            case "meeting":
                return "redirect:/meeting"; // Redirect to the meeting page
            case "chat":
                return "redirect:/chat"; // Redirect to the chat page
            default:
                return "redirect:/interaction"; // Redirect to the interaction page if the type is invalid
        }
    }
}
