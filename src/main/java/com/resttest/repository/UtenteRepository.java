package com.resttest.repository;

import com.resttest.entity.Utente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteRepository  extends CrudRepository<Utente, Integer > {
}
