package com.example.GestionAppareil.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Categorie {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String label;
        private String description;
        @JsonIgnore
        @OneToMany(targetEntity = Appareil.class , mappedBy = "categorie",fetch = FetchType.LAZY)
        private List<Appareil> appareils;

        public Categorie(Long id, String label, List<Appareil> appareils) {
                this.id = id;
                this.label = label;
                this.appareils = appareils;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
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

        public List<Appareil> getAppareils() {
                return appareils;
        }

        public void setAppareils(List<Appareil> appareils) {
                this.appareils = appareils;
        }

        public Categorie() {
        }
}
