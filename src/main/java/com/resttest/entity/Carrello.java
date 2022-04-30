package com.resttest.entity;

import javax.persistence.*;

@Entity
@Table(name = "carrello")
public class Carrello {
    @EmbeddedId
    private CarrelloId id;

    @MapsId("utenteIdutente")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "utente_idutente", nullable = false)
    private Utente utenteIdutente;

    @MapsId("prodottoIdprodotto")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "prodotto_idprodotto", nullable = false)
    private Prodotto prodottoIdprodotto;

    @Column(name = "qnt")
    private Integer qnt;

    public CarrelloId getId() {
        return id;
    }

    public void setId(CarrelloId id) {
        this.id = id;
    }

    public Utente getUtenteIdutente() {
        return utenteIdutente;
    }

    public void setUtenteIdutente(Utente utenteIdutente) {
        this.utenteIdutente = utenteIdutente;
    }

    public Prodotto getProdottoIdprodotto() {
        return prodottoIdprodotto;
    }

    public void setProdottoIdprodotto(Prodotto prodottoIdprodotto) {
        this.prodottoIdprodotto = prodottoIdprodotto;
    }

    public Integer getQnt() {
        return qnt;
    }

    public void setQnt(Integer qnt) {
        this.qnt = qnt;
    }

}