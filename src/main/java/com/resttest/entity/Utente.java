package com.resttest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "utente")
@Getter
@Setter
public class Utente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idutente", nullable = false)
    private Integer id;

    @Column(name = "nome", length = 200)
    private String nome;

    @Column(name = "cognome", length = 200)
    private String cognome;

    @Column(name = "email", length = 200)
    private String email;

    @Column(name = "password", length = 200)
    private String password;

    @OneToMany(mappedBy = "utente")
    private List<Documento> documenti = new ArrayList<>();

    @OneToMany(mappedBy = "utente")
    private List<Recapito> recapiti = new ArrayList<>();

    @OneToMany(mappedBy = "utente")
    private List<Carrello> prodottiCarrello = new ArrayList<>();

}