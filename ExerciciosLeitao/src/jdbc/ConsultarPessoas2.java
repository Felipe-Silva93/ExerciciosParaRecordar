package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {

	public static void main(String[] args)throws SQLException{
		Scanner entrada = new Scanner(System.in);
	
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas where nome like ?";
		
		System.out.println("entre com um nome:");
		String valor =entrada.nextLine();
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1,"%"+valor+"%");
		ResultSet resultado =stmt.executeQuery();
		
		List<Pessoa>pessoa = new ArrayList<>();
		
		while(resultado.next()) {//next retorna um boolean e passa para  proximo elemento e assim por diante
			int codigo = resultado.getInt("codigo");//passando o nome da coluna e pegando a partir do nome ou pode também pegar por indice
			String nome =resultado.getString("nome");
			pessoa.add(new Pessoa(codigo, nome));
		}
		
		for(Pessoa p: pessoa ) {
			System.out.println(p.getCodigo()+ " ==> "+p.getNome());
		}
		
		stmt.close();
		conexao.close();
		entrada.close();;

		}
}
