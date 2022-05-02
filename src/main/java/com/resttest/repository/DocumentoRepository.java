package com.resttest.repository;

import com.resttest.entity.Documento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentoRepository extends CrudRepository<Documento, Integer> {
}
