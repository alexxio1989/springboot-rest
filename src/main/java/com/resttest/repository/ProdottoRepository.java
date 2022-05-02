package com.resttest.repository;

import com.resttest.entity.Prodotto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdottoRepository  extends CrudRepository<Prodotto, Integer> {
}
