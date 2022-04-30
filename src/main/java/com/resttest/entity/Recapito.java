package com.resttest.entity;

import javax.persistence.*;

@Entity
@Table(name = "recapito")
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
    private Utente utenteIdutente;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPaese() {
        return paese;
    }

    public void setPaese(String paese) {
        this.paese = paese;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public Utente getUtenteIdutente() {
        return utenteIdutente;
    }

    public void setUtenteIdutente(Utente utenteIdutente) {
        this.utenteIdutente = utenteIdutente;
    }

}