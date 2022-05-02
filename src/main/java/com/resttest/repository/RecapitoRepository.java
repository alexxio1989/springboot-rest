package com.resttest.repository;

import com.resttest.entity.Recapito;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecapitoRepository  extends CrudRepository<Recapito, Integer> {
}
