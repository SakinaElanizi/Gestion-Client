package com.emsi.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String adresse;
    private String telephone;
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Commande> commandes;
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Requete> requetes;
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Plainte> plaintes;

}
