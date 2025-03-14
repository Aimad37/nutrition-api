package com.example.nutrition.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "aliments") // ou le nom de votre collection réelle
public class Aliment {
    @Id
    private String id;
    private String nom;
    private double calories;
    private double lipides;
    private double glucides;
    private double proteines;

    // Constructeur par défaut (nécessaire pour Spring Data)
    public Aliment() {
    }

    // Constructeur avec tous les champs
    public Aliment(String id, String nom, double calories, double lipides, double glucides, double proteines) {
        this.id = id;
        this.nom = nom;
        this.calories = calories;
        this.lipides = lipides;
        this.glucides = glucides;
        this.proteines = proteines;
    }

    // Getters et setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getLipides() {
        return lipides;
    }

    public void setLipides(double lipides) {
        this.lipides = lipides;
    }

    public double getGlucides() {
        return glucides;
    }

    public void setGlucides(double glucides) {
        this.glucides = glucides;
    }

    public double getProteines() {
        return proteines;
    }

    public void setProteines(double proteines) {
        this.proteines = proteines;
    }

    @Override
    public String toString() {
        return "Aliment{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", calories=" + calories +
                ", lipides=" + lipides +
                ", glucides=" + glucides +
                ", proteines=" + proteines +
                '}';
    }
}