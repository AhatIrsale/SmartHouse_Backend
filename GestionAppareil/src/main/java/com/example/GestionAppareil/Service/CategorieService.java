package com.example.GestionAppareil.Service;

import com.example.GestionAppareil.Entities.Appareil;
import com.example.GestionAppareil.Entities.Categorie;
import com.example.GestionAppareil.dao.AppareilDao;
import com.example.GestionAppareil.dao.CategorieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategorieService  {
    public List<Categorie> findAll() {
        return categorieDao.findAll();
    }

    public Optional<Categorie> findById(Long aLong) {
        return categorieDao.findById(aLong);
    }

    public long Save(Categorie categorie)
   {
       if(categorie==null) return -1;
       else {
           categorieDao.save(categorie);
           return 1;
       }
   }

    public void deleteById(Long aLong) {
        categorieDao.deleteById(aLong);
    }

    public void deleteAll() {
        categorieDao.deleteAll();
    }

    @Autowired
    private CategorieDao categorieDao;
}
