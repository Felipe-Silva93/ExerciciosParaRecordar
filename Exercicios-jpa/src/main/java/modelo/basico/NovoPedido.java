package modelo.basico;

import infra.DAO;
import modelo.basico.umpramuitos.ItemPedido;
import modelo.basico.umpramuitos.Pedidos;

public class NovoPedido {

	public static void main(String[] args) {

		DAO<Object>dao = new DAO<>();
		
		Pedidos pedido = new Pedidos();
		Produto produto = new Produto("carro",3000.99);
		ItemPedido item = new ItemPedido(pedido,produto,10);
		
		dao.abrirTransaction().incluirTransaction(pedido)
		.incluirTransaction(produto)
		.incluirTransaction(item)
		.fecharTransaction().fechar();
			
	}

}
