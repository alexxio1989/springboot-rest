package com.resttest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "documento")
@Getter
@Setter
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
    private Utente utente;

}