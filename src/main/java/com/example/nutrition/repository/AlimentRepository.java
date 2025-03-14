package com.example.nutrition.repository;

import com.example.nutrition.model.Aliment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface AlimentRepository extends MongoRepository<Aliment, String> {
    Optional<Aliment> findByNom(String nom); // Recherche par nom
}