package com.example.nutrition.controller;

import com.example.nutrition.model.Aliment;
import com.example.nutrition.service.AlimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/aliment") // Base de l'URL
public class AlimentController {
    @Autowired
    private AlimentService alimentService;

    // Endpoint GET /aliment/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Aliment> getAlimentById(@PathVariable String id) {
        System.out.println("Recherche de l'aliment avec ID: " + id);
        Optional<Aliment> aliment = alimentService.getAlimentById(id);
        if (aliment.isPresent()) {
            System.out.println("Aliment trouvé: " + aliment.get().getNom());
            return ResponseEntity.ok(aliment.get());
        } else {
            System.out.println("Aucun aliment trouvé avec cet ID");
            return ResponseEntity.notFound().build();
        }
    }

    // Endpoint GET /aliment/nom/{nom}
    @GetMapping("/nom/{nom}")
    public ResponseEntity<Aliment> getAlimentByNom(@PathVariable String nom) {
        Optional<Aliment> aliment = alimentService.getAlimentByNom(nom);
        return aliment.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
