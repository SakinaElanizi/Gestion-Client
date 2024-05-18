package com.emsi;

import com.emsi.models.Client;
import com.emsi.models.Gestionnaire;
import com.emsi.repositories.ClientRepository;
import com.emsi.repositories.GestionnaireRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class ProjetMvcGcApplication {

    public static void main(String[] args) {

        SpringApplication.run(ProjetMvcGcApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ClientRepository clientRepository, GestionnaireRepository gestionnaireRepository){
        return args -> {
            clientRepository.save(Client.builder()
                    .nom("elanizi")
                    .prenom("sakina")
                    .email("elanizisakina@gmail.com")
                    .adresse("sale")
                    .telephone("0656588150")
                    .build());

            clientRepository.save(Client.builder()
                    .nom("Goubi")
                    .prenom("wijdane")
                    .email("goubi@gmail.com")
                    .adresse("sale")
                    .telephone("0656588150")
                    .build());

            gestionnaireRepository.save(Gestionnaire.builder()
                    .nom("Admin")
                    .prenom("User")
                    .username("admin")
                    .password("admin123")
                    .build());


        };
    }
}
