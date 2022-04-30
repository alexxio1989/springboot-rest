package com.resttest.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "documento")
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddocumento", nullable = false)
    private Integer id;

    @Column(name = "tipologia", length = 200)
    private String tipologia;

    @Column(name = "scadenza")
    private LocalDate scadenza;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "utente_idutente", nullable = false)
    private Utente utenteIdutente;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public LocalDate getScadenza() {
        return scadenza;
    }

    public void setScadenza(LocalDate scadenza) {
        this.scadenza = scadenza;
    }

    public Utente getUtenteIdutente() {
        return utenteIdutente;
    }

    public void setUtenteIdutente(Utente utenteIdutente) {
        this.utenteIdutente = utenteIdutente;
    }

}