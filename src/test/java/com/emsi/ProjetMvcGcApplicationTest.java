package com.emsi;

import com.emsi.models.Client;
import com.emsi.repositories.ClientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class ProjetMvcGcApplicationTest {

    @Autowired
    private ClientRepository clientRepository;

    @Test
    public void insertClient() {
        Client client = new Client();
        client.setNom("Doe");
        client.setPrenom("John");
        client.setEmail("john.doe@example.com");
        client.setAdresse("sla");
        client.setTelephone("00999909876");
        Client savedClient = clientRepository.save(client);
        System.out.println(savedClient);
    }

    @Test
    public void listAllClients() {
        Iterable<Client> clients = clientRepository.findAll();
        clients.forEach(System.out::println);
    }


}
