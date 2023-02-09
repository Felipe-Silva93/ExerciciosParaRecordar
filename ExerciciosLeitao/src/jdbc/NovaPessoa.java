package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

	public static void main(String[] args)throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("iforme seu nome: ");
		String nome = entrada.nextLine();
		
		Connection connection = FabricaConexao.getConexao();

		String sql ="INSERT INTO pessoas(nome) VALUES (?)";
		PreparedStatement stmt = connection.prepareStatement(sql);//forma segura de inserir dados na tabela PreparedStatement
		stmt.setString(1, nome);//1, nome permite pegar o primeiro parametro(?) com numero 1 e avariavel que contem o nome
		
		stmt.execute();
		
		System.out.println("pessoa incluida com sucesso mlk bom");

		entrada.close();
		
	}

}
