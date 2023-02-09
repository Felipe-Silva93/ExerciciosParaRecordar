package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {

	public static void main(String[] args) throws SQLException {

		Connection conection = FabricaConexao.getConexao();
		
		String sql = "CREATE TABLE IF NOT EXISTS pessoas("
				+ "codigo INT AUTO_INCREMENT PRIMARY KEY,"
				+ "nome VARCHAR(80) NOT NULL"
				+ ")";
		
		Statement stmt = conection.createStatement();//Statement NÃO É UMA FORRMA SEGURA POIS É POSSIVEL SOBRER ATAQUE SQL INJECTION HACKER
		stmt.execute(sql);
		
		
		System.out.println("tabela criada, funfou!!");
		conection.close();
	}

}
