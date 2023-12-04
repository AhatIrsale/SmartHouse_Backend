package com.example.GestionAppareil.Controller;

import com.example.GestionAppareil.Entities.Categorie;
import com.example.GestionAppareil.Service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CategorieController {

    @Autowired
    CategorieService categorieService;
    @GetMapping("/catergories")
    public List<Categorie> findAll() {
        return categorieService.findAll();
    }

    @GetMapping("/id/{id}")
    public Optional<Categorie> findById(@PathVariable  Long id) {
        return categorieService.findById(id);
    }

    @PostMapping("/save")
    public long Save(@RequestBody Categorie categorie) {
        return categorieService.Save(categorie);
    }

    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable Long id) {
        categorieService.deleteById(id);
    }

    @DeleteMapping("/delete")
    public void deleteAll() {
        categorieService.deleteAll();
    }






}
