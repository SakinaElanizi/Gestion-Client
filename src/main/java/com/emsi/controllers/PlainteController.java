package com.emsi.controllers;

import com.emsi.models.Client;
import com.emsi.models.Plainte;
import com.emsi.services.PlainteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
@RequestMapping("/plainte")
public class PlainteController {

    @Autowired
    private PlainteService plainteService;

    // Handler method to display the list of complaints
    @GetMapping(path = "/listplainte")
    public String getAllPlaintes(Model model) {
        List<Plainte> plaintes = plainteService.getAllPlaintes();
        model.addAttribute("plaintes", plaintes);
        return "listplainte"; // Thymeleaf template name for the list of complaints
    }

    // Handler method to show the form to add a new complaint
    @GetMapping(path = "/addplainte")
    public String showAddPlainteForm(Model model) {
        model.addAttribute("plainte", new Plainte());
        return "addplainte"; // Thymeleaf template name for the add complaint form
    }

    // Handler method to process the form submission for adding a new complaint
    @PostMapping("/addplainte")
    public String addPlainte(@ModelAttribute Plainte plainte) {
        plainteService.savePlainte(plainte);
        return "redirect:/listplainte"; // Redirect to the list of complaints after adding
    }
}
