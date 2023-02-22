package modelo.basico.consulta;

import java.util.List;

import infra.DAO;
import modelo.basico.muitosparamuitos.Ator;
import modelo.basico.muitosparamuitos.Filme;

public class ObterFilmes {

	public static void main(String[] args) {

		DAO<Filme>dao = new DAO<>(Filme.class);
		List<Filme>filmes = dao.consulta("filmesNotaMaiorQue", "nota",2.5);
		
		for(Filme filme: filmes) {
			System.out.println(filme.getNome()
					+" => " +filme.getNota());
			
			for(Ator ator : filme.getAtores()) {
				System.out.println(ator.getNome());
			}
		}
	}

}
