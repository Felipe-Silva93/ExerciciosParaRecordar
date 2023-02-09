package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas1 {
	
	public static void main(String[] args)throws SQLException{
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas";
		
		
		Statement stmt = conexao.createStatement();
		
		ResultSet resultado =stmt.executeQuery(sql);
		
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

		}
	
}
