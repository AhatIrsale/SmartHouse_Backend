package com.example.GestionAppareil.Entities;

import jakarta.persistence.*;

@Entity
public class Appareil {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String label;
    private String Description;
    private String Status;
    @ManyToOne
    private Categorie categorie;


    public Appareil(Long id, String label, String description, String status, Categorie categorie) {
        this.id = id;
        this.label = label;
        Description = description;
        Status = status;
        this.categorie = categorie;
    }

    public Appareil() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
}
