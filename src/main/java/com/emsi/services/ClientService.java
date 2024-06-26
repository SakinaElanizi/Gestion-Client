package com.emsi.services;

import com.emsi.models.Client;
import com.emsi.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    private final ClientRepository clientRepository;
    public void ajouterclient (Client client){
        clientRepository.save(client);
    }
    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Iterable<Client> getAllClients() {
        return clientRepository.findAll();
    }
}
