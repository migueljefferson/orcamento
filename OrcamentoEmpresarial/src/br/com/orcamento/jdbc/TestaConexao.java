// Uma classe para testar se conseguimos conectar

package br.com.orcamento.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conex�o Aberta");
		connection.close();

	}

}
