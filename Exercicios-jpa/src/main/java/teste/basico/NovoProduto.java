package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {

		DAO<Produto> dao = new DAO<>(Produto.class);//se for fazer alguma consulta é nessesario passa parametros caso contrario não precisa
	
		Produto produto = new Produto( "Tela",7000.45);
	//	dao.abrirTransaction().incluirTransaction(produto).fecharTransaction().fechar();
	
// outra maneira
		
		dao.abriFechaIncluiTransaction(produto).fechar();
	}

}
