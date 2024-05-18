package com.emsi.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;

    @Column(unique = true)
    @Email
    private String email;

    private String adresse;

    @Pattern(regexp = "\\d{10}", message = "Le numéro de téléphone doit contenir uniquement des chiffres et avoir une longueur de 10 caractères")
    private String telephone;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Commande> commandes;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Requete> requetes;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Plainte> plaintes;
}
