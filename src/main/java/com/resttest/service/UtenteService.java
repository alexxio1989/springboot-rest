package com.resttest.service;

import com.resttest.entity.Utente;
import com.resttest.repository.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UtenteService {

    @Autowired
    private UtenteRepository utenteRepository;

    public boolean save(Utente utente){
        try {
            utenteRepository.save(utente);
            return true;
        } catch (DataAccessException e){
            return false;
        }
    }

    public Utente get(Utente utente){
        try {
            Optional<Utente> byId = utenteRepository.findById(utente.getId());
            return byId.get();
        } catch (DataAccessException e){
            return null;
        }
    }
}
