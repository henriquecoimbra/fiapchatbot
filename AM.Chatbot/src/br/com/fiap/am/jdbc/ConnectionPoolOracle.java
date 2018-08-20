package br.com.fiap.am.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import oracle.jdbc.pool.OracleDataSource;

public class ConnectionPoolOracle {

	private final DataSource dataSource;

	public ConnectionPoolOracle() throws SQLException {
		OracleDataSource pool = new OracleDataSource();
		pool.setURL("jdbc:oracle:thin:RM80054/310393@oracle.fiap.com.br:1521:orcl");
		dataSource = pool;
	}

	public Connection getConnection() throws SQLException {
		Connection connection = dataSource.getConnection();
		return connection;
	}

}
