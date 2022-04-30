package com.resttest.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "prodotto")
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

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

}