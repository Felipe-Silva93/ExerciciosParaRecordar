package modelo.basico.muitosparamuitos;

import infra.DAO;

public class NovoFilmeAtor {

	public static void main(String[] args) {

		Filme filmeA = new Filme("startrek",4.5);
		Filme filmeB = new Filme("o Figitivo",8.5);

		
		
		Ator atorA = new Ator("jajajuju");
		Ator atorB = new Ator("aquele");
		
		filmeA.adicionarAtor(atorA);
		filmeA.adicionarAtor(atorB);
		filmeB.adicionarAtor(atorA);

		DAO<Filme> dao = new DAO<Filme>();
		dao.abriFechaIncluiTransaction(filmeA);

		
	}

}
