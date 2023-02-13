package teste.umparaum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento2 {
	public static void main(String[] args) {
	
		Assento assento = new Assento("16C");
		Cliente cliente = new Cliente ("ana",assento);
		
		DAO<Object>dao = new DAO<>();
		
		dao.abrirTransaction()
		   .incluirTransaction(assento)
		   .fecharTransaction()
		   .fechar();
	}
}
