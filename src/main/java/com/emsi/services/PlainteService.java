package com.emsi.services;

import com.emsi.models.Plainte;
import com.emsi.repositories.PlainteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlainteService {

    @Autowired
    private PlainteRepository plainteRepository;

    public List<Plainte> getAllPlaintes() {
        return plainteRepository.findAll();
    }

    public void savePlainte(Plainte plainte) {
        plainteRepository.save(plainte);
    }
}
