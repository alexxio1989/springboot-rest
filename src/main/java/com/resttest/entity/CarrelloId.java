package com.resttest.entity;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CarrelloId implements Serializable {
    private static final long serialVersionUID = 3890247293482283558L;
    @Column(name = "utente_idutente", nullable = false)
    private Integer utenteIdutente;

    @Column(name = "prodotto_idprodotto", nullable = false)
    private Integer prodottoIdprodotto;

    public Integer getUtenteIdutente() {
        return utenteIdutente;
    }

    public void setUtenteIdutente(Integer utenteIdutente) {
        this.utenteIdutente = utenteIdutente;
    }

    public Integer getProdottoIdprodotto() {
        return prodottoIdprodotto;
    }

    public void setProdottoIdprodotto(Integer prodottoIdprodotto) {
        this.prodottoIdprodotto = prodottoIdprodotto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CarrelloId entity = (CarrelloId) o;
        return Objects.equals(this.utenteIdutente, entity.utenteIdutente) &&
                Objects.equals(this.prodottoIdprodotto, entity.prodottoIdprodotto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(utenteIdutente, prodottoIdprodotto);
    }

}