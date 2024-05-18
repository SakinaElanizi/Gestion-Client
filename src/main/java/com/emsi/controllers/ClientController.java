package com.emsi.controllers;

import com.emsi.models.Client;
import com.emsi.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/clients")
    public String listClients(Model model) {
        Iterable<Client> clients = clientService.getAllClients();
        if (clients != null) {
            model.addAttribute("clients", clients);
        }
        return "clients";
    }
    @GetMapping(path = "/home")
    @ResponseBody
    public String hello(){
        return "Hello World!";
    }
}
