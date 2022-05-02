package com.resttest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "prodotto")
@Getter
@Setter
public class Prodotto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idprodotto", nullable = false)
    private Integer id;

    @Column(name = "nome", length = 200)
    private String nome;

    @Column(name = "prezzo", precision = 8, scale = 3)
    private BigDecimal prezzo;

    @Column(name = "descrizione", length = 200)
    private String descrizione;

}