package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Update {

	public static void main(String[] args) throws SQLException{
		Scanner entrada = new Scanner(System.in);
	
		
		Connection conexao = FabricaConexao.getConexao();
		
		System.out.println("entre com o codigo");
		int codigo =entrada.nextInt();
		String buscar = "select codigo, nome from pessoas  where codigo = ?";
		String alterar = "update pessoas set nome = ? where codigo = ?";

		PreparedStatement stmt = conexao.prepareStatement(buscar);
		stmt.setInt(1,codigo);
		
		ResultSet resultado =stmt.executeQuery();
		
		//List<Pessoa>pessoa = new ArrayList<>();
		
		if(resultado.next()) {//next retorna um boolean e passa para  proximo elemento e assim por diante
			Pessoa p = new Pessoa(resultado.getInt(1),resultado.getString(2));
			System.out.println("nome é "+p.getNome());
			entrada.nextLine();
			System.out.println("informe um novo nome: ");
			String novoNome=entrada.nextLine();
			
			stmt.close();
			stmt = conexao.prepareStatement(alterar);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();
			
			System.out.println("pessoa alterada com sucesso");
		}else {
			
			System.out.println("pessoa não encontrada ");
		
		}
		
		
		stmt.close();
		conexao.close();
		entrada.close();
		
	}

}
