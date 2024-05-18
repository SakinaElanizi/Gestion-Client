/*package com.emsi.services;

import com.emsi.models.Gestionnaire;
import com.emsi.repositories.GestionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class GestionnaireService {

    private final GestionnaireRepository gestionnaireRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public GestionnaireService(GestionnaireRepository gestionnaireRepository, PasswordEncoder passwordEncoder) {
        this.gestionnaireRepository = gestionnaireRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Gestionnaire saveGestionnaire(Gestionnaire gestionnaire) {
        gestionnaire.setPassword(passwordEncoder.encode(gestionnaire.getPassword()));
        return gestionnaireRepository.save(gestionnaire);
    }

    public Gestionnaire findByUsername(String username) {
        return gestionnaireRepository.findByUsername(username);
    }

    public Iterable<Gestionnaire> getAllGestionnaires() {
        return gestionnaireRepository.findAll();
    }
}
*/