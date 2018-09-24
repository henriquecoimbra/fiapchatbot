package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.bean.Retorno;
import br.com.fiap.bean.Usuario;
import br.com.fiap.factory.ConnectionFactorySQL;

public class UsuarioDAO {

	public UsuarioDAO() {

	}

	public Retorno buscarUsuario(Usuario usuario) {

		List<Object> list = new ArrayList<Object>();
		Retorno retorno = new Retorno();

		String sql = "SELECT * FROM T_USUARIO WHERE Email = ? AND Senha = ?";
		try (Connection con = new ConnectionFactorySQL().getConnection();
				PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, usuario.getEmail());
			ps.setString(2, usuario.getSenha());
			try (ResultSet result = ps.executeQuery()) {
				while (result.next()) {
					retorno.setIdRetorno(200);
					retorno.setMsgRetorno("Login realizado com sucesso.");
					Usuario us = new Usuario(result.getString("Email"), result.getString("Senha"));
					list.add(us);
				}
				retorno.setObjRetorno(list);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return retorno;
	}
}
