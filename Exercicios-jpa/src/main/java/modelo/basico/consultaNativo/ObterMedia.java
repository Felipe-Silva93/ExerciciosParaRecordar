package modelo.basico.consultaNativo;

import infra.DAO;

public class ObterMedia {

	public static void main(String[] args) {
		DAO<NotaFilme>dao = new DAO<>(NotaFilme.class);
		NotaFilme nota = dao.consultaUm("obterMedioGeralDosFilmes");
		
		System.out.println(nota.getMedia());
		dao.fechar();
		
	}

}
