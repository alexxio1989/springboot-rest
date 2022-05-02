package com.resttest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "recapito")
@Getter
@Setter
public class Recapito {

    @Id
    @Column(name = "idrecapito", nullable = false)
    private Integer id;

    @Column(name = "paese", length = 200)
    private String paese;

    @Column(name = "citta", length = 200)
    private String citta;

    @Column(name = "indirizzo", length = 200)
    private String indirizzo;

    @Column(name = "zip", length = 45)
    private String zip;

    @Column(name = "telefono1", length = 100)
    private String telefono1;

    @Column(name = "telefono2", length = 100)
    private String telefono2;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "utente_idutente", nullable = false)
    private Utente utente;

}