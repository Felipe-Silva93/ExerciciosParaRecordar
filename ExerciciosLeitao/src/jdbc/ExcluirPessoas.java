package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoas {

	public static void main(String[] args) throws SQLException{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digita um valor: ");
		int codigo = entrada.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();
		String sql =" delete from pessoas where codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		if(stmt.executeUpdate()>0){//retorna a quantidade de linhas afetadas
			
			System.out.println("pessoa excluida");
		}else {
			System.out.println("nada foi feito");
		}
		
		entrada.close();
		conexao.close();
		
		
				
	}

}
