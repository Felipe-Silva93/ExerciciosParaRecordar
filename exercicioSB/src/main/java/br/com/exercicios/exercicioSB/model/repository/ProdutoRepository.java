package br.com.exercicios.exercicioSB.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.exercicios.exercicioSB.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

	
}
