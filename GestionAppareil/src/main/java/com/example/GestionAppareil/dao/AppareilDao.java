package com.example.GestionAppareil.dao;

import com.example.GestionAppareil.Entities.Appareil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppareilDao extends JpaRepository<Appareil,Long> {
}
