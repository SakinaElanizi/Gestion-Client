package com.emsi.controllers;

import com.emsi.models.Client;
import com.emsi.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


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

    @GetMapping(path = "/add-client")
    public String ajouterClient(Model model) {
        model.addAttribute("client", new Client());
        return "add-client";
    }

    @PostMapping("/addclient")
    public String addClient(@ModelAttribute Client client) {
        clientService.ajouterclient(client);
        return "redirect:/clients"; // Redirige vers la liste des clients après l'ajout
    }

    @GetMapping(path = "/home")
    public String hello(Model model) {
        model.addAttribute("message", "Hello World!");
        return "home"; // Suppose que vous avez une page 'home.html' pour afficher le message
    }

    @GetMapping("/client-detail/{id}")
    public String clientDetail(@PathVariable Long id, Model model) {
        Client client = clientService.getClientById(id);
        model.addAttribute("client", client);
        return "client-detail";
    }

    @PostMapping("/clients")
    public String submitClientDetails(@ModelAttribute Client client) {
        // Update client details in the database
        clientService.updateClient(client);
        // Redirect to the client detail page with the updated client ID
        return "redirect:/clients";
    }


}
