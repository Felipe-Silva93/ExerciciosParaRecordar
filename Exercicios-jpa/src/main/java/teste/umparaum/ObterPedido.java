package teste.umparaum;

import infra.DAO;
import modelo.basico.umpramuitosonetomany.ItemPedido2;
import modelo.basico.umpramuitosonetomany.Pedidos2;

public class ObterPedido {
	public static void main(String[] args) {
		
		DAO<Pedidos2> dao =new DAO<>(Pedidos2.class);
		
		Pedidos2 pedido = dao.obterPorID(2L);
		
		for(ItemPedido2 item :pedido.getItens()) {
			System.out.println(item.getQuantidade());
		}
		dao.fechar();
		
	}
	
	
}
