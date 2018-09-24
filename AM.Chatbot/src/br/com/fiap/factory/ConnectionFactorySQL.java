package br.com.fiap.factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import oracle.jdbc.pool.OracleDataSource;

public class ConnectionFactorySQL {

	private final DataSource dataSource;

	public ConnectionFactorySQL() throws SQLException {
		OracleDataSource pool = new OracleDataSource();
		pool.setURL("jdbc:oracle:thin:OPS$RM80054/310393@localhost:1521:xe");
		dataSource = pool;
	}

	public Connection getConnection() throws SQLException {
		Connection connection = dataSource.getConnection();
		return connection;
	}

}
