package com.resttest.entity;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "utente")
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

    @OneToMany(mappedBy = "utenteIdutente")
    private Set<Documento> documenti = new LinkedHashSet<>();

    @OneToMany(mappedBy = "utenteIdutente")
    private Set<Recapito> recapiti = new LinkedHashSet<>();

    @OneToMany(mappedBy = "utenteIdutente")
    private Set<Carrello> prodottiCarrello = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Documento> getDocumenti() {
        return documenti;
    }

    public void setDocumenti(Set<Documento> documenti) {
        this.documenti = documenti;
    }

    public Set<Recapito> getRecapiti() {
        return recapiti;
    }

    public void setRecapiti(Set<Recapito> recapiti) {
        this.recapiti = recapiti;
    }

    public Set<Carrello> getProdottiCarrello() {
        return prodottiCarrello;
    }

    public void setProdottiCarrello(Set<Carrello> prodottiCarrello) {
        this.prodottiCarrello = prodottiCarrello;
    }

}