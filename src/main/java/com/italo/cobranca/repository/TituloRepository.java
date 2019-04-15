package com.italo.cobranca.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.italo.cobranca.model.Titulo;

@Repository
@Transactional
public interface TituloRepository extends CrudRepository<Titulo, Long>{

	

}
