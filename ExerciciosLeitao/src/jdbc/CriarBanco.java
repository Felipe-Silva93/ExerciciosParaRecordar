package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws SQLException{

		/*final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		final String usuario = "felipe";
		final String senha = "root";
		
		Connection conexao = DriverManager.getConnection(url,usuario,senha);*/
		
		Connection conexao = FabricaConexao.getConexao();
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");//criando banco com nome curso_java
		
		System.out.println("banco criado com sucesso");
		conexao.close();
	}

}
