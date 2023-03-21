package br.com.exercicios.exercicioSB.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.exercicios.exercicioSB.model.entities.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

	
}
