package modelo.basico.umpramuitos;

import infra.DAO;

public class ObterPedidos {

	public static void main(String[] args) {

		DAO<Pedidos>dao = new DAO<>(Pedidos.class);
		
		Pedidos pedido = dao.obterPorID(1L);
		
		for(ItemPedido item : pedido.getItens() ) {
			System.out.println(item.getQuantidade());
			
			
		}
		
		dao.fechar();
	}

}
