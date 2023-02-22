package modelo.basico.muitosparamuitos;

import infra.DAO;

public class NovoTioSobrinho {

	public static void main(String[] args) {

		Tio tio1 = new Tio("maria");
		Tio tio2 = new Tio("joao");
		
		Sobrinho sobrinho1 = new Sobrinho("davi");
		Sobrinho sobrinho2 = new Sobrinho("ana");
		
		tio1.getSobrinhos().add(sobrinho1);
		sobrinho1.getTio().add(tio1);
		
		tio1.getSobrinhos().add(sobrinho2);
		sobrinho2.getTio().add(tio1);
		
		tio2.getSobrinhos().add(sobrinho2);
		sobrinho2.getTio().add(tio2);
		
		tio2.getSobrinhos().add(sobrinho1);
		sobrinho1.getTio().add(tio2);
		
		DAO<Object>dao = new DAO<>();
		dao.abrirTransaction()
		.incluirTransaction(tio1)
		.incluirTransaction(tio2)
		.incluirTransaction(sobrinho1)
		.incluirTransaction(sobrinho2)
		.fecharTransaction()
		.fechar();
	}
	

}
