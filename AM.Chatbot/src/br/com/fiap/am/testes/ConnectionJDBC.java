package br.com.fiap.am.testes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.factory.ConnectionFactorySQL;

public class ConnectionJDBC {

	public static void main(String[] args) throws SQLException {
		String sql = "SELECT * FROM DEMO_USERS WHERE USER_NAME = ?";
		try (Connection con = new ConnectionFactorySQL().getConnection();
				PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, "asda");
			try (ResultSet result = ps.executeQuery()) {
				while (result.next()) {
					System.out.print(result.getString("USER_NAME") + " ");
					System.out.println(result.getDate("CREATED_ON"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
