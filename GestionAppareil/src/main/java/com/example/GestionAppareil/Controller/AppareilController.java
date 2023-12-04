package com.example.GestionAppareil.Controller;

import com.example.GestionAppareil.Entities.Appareil;
import com.example.GestionAppareil.Service.AppareilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Appareil")
public class AppareilController {

    @Autowired
    private AppareilService appareilService;

    @GetMapping("/appareils")

    public List<Appareil> findAll() {
        return appareilService.findAll();
    }

    @PostMapping("")
    public long save(@RequestBody Appareil appareil) {
        return appareilService.save(appareil);
    }

    @GetMapping("id/{id}")
    public Optional<Appareil> findById(@PathVariable Long id) {
        return appareilService.findById(id);
    }

    @DeleteMapping("id/{id}")
    public void deleteById(@PathVariable Long id) {
        appareilService.deleteById(id);
    }

    @DeleteMapping("/delete")
    public void deleteAll() {
        appareilService.deleteAll();
    }
}
