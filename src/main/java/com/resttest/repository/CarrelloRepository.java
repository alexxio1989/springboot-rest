package com.resttest.repository;

import com.resttest.entity.Carrello;
import com.resttest.entity.CarrelloId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrelloRepository extends CrudRepository<Carrello, CarrelloId> {
}
