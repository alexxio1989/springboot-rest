package com.resttest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "carrello")
@Getter
@Setter
public class Carrello {

    @EmbeddedId
    private CarrelloId id;

    @MapsId("idutente")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "utente_idutente", nullable = false)
    private Utente utente;

    @MapsId("idprodotto")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "prodotto_idprodotto", nullable = false)
    private Prodotto prodotto;

    @Column(name = "qnt")
    private Integer qnt;

}