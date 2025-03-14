package com.example.nutrition.service;

import com.example.nutrition.model.Aliment;
import com.example.nutrition.repository.AlimentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlimentService {
    @Autowired
    private AlimentRepository alimentRepository;

    public Optional<Aliment> getAlimentById(String id) {
        return alimentRepository.findById(id);
    }

    public Optional<Aliment> getAlimentByNom(String nom) {
        return alimentRepository.findByNom(nom);
    }

    public List<Aliment> getAllAliments() {
        return alimentRepository.findAll();
    }
}
