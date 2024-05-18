package com.emsi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.emsi.models.Client;
import com.emsi.repositories.*;

@Controller
public class AddClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/addclient")
    public String showAddClientForm(Model model) {
        model.addAttribute("client", new Client()); // Adjust the import
        return "addclient";
    }

    @PostMapping("/addclient")
    public String submitAddClientForm(@ModelAttribute Client client) {
        clientRepository.save(client);
        return "redirect:/clients";
    }
}
