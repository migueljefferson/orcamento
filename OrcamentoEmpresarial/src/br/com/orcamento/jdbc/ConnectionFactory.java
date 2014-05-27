// Professor Florencio Queiroz (www.educaremacao.com.br)
//======================================================
// Vamos utilizar uma classe para gerar as nossas conexões.
// Para conectar ao banco basta instanciar um objeto da classe Connection
// e puxar uma conexão com "Connection connection = new ConnectionFactory().getConnection();"

package br.com.orcamento.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		try {
			// carga do driver
			Class.forName("com.mysql.jdbc.Driver"); 
			return DriverManager
					.getConnection("jdbc:mysql://localhost/orcamento","root","root");
		} catch (SQLException | ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
}
