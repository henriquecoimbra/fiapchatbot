package br.com.fiap.am.testes;

import br.com.fiap.am.jdbc.ConnectionPoolOracle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionJDBC {

	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionPoolOracle().getConnection();
		Statement statement = connection.createStatement();
		statement.execute("SELECT * FROM t_a14_autor");
		ResultSet resultSet = statement.getResultSet();
		
		while (resultSet.next()) {
			System.out.println(resultSet.getString("NM_AUTOR"));
		}
		
		resultSet.close();
		statement.close();
		connection.close();
	}
}
