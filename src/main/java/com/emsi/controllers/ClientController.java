package com.emsi.controllers;

import com.emsi.models.Client;
import com.emsi.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping("/ajouterclient")
    public String ajouterClient(Model model){
        model.addAttribute("client",new Client());
        return "addclient";
    }

    @PostMapping("/addclient")
    public ResponseEntity<String> addClient(@RequestBody Client client) {
        System.out.println(client);
        clientService.ajouterclient(client);
        return ResponseEntity.ok("Client ajouté avec succès !");
    }
    @GetMapping(path = "/home")
    @ResponseBody
    public String hello(){
        return "Hello World!";
    }
}
