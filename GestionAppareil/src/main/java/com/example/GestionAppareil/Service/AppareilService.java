package com.example.GestionAppareil.Service;

import com.example.GestionAppareil.Entities.Appareil;
import com.example.GestionAppareil.dao.AppareilDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppareilService {

    @Autowired
    private AppareilDao appareilDao;

    public List<Appareil> findAll() {
        return appareilDao.findAll();
    }

    public long save(Appareil appareil)
    {
        if(appareil==null)  return -1;
        else{
                appareilDao.save(appareil);
                return 1;
        }
    }



    public Optional<Appareil> findById(Long aLong) {
        return appareilDao.findById(aLong);
    }

    public void deleteById(Long aLong) {
        appareilDao.deleteById(aLong);
    }

    public void deleteAll() {
        appareilDao.deleteAll();
    }








}
