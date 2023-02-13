package teste.umparaum;

import infra.DAO;
import modelo.umpraum.Cliente;

public class ObterClienteId {

	public static void main(String[] args) {

		DAO<Cliente>dao = new DAO <>(Cliente.class);
		
		Cliente cliente = dao.obterPorID(1L);
		
		System.out.println(cliente.getAssento().getNome());
		
		dao.fechar();
	}

}
