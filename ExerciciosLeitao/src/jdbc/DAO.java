package jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Object;

public class DAO {
	
	Connection conexao;
	
	
	public int incluir(String sql,Object...objects atributos) {
		
	}
	
	private Connection getConexao() {	
		try {
			if(conexao != null && !conexao.isClosed()) {
				return conexao;
			}
		} catch (SQLException e) {

		}
		conexao = FabricaConexao.getConexao();
		return conexao;
	}
}
