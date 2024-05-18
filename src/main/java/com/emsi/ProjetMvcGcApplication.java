package com.emsi;

import com.emsi.models.Client;
import com.emsi.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjetMvcGcApplication {

    public static void main(String[] args) {

        SpringApplication.run(ProjetMvcGcApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ClientRepository clientRepository){
        return args -> {
            clientRepository.save(Client.builder()
                    .nom("hamid")
                    .prenom("hamidou")
                    .build());
            clientRepository.save(Client.builder()
                    .nom("chafik")
                    .prenom("chafikou")
                    .build());
        };
    }
}
