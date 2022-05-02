package com.resttest.controller;

import com.resttest.entity.Utente;
import com.resttest.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    UtenteService utenteService;

    @GetMapping("/signin")
    public boolean signin(@RequestBody Utente utente) {
        return utenteService.save(utente);
    }
}
