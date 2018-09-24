package br.com.fiap.bo;

import br.com.fiap.bean.Retorno;
import br.com.fiap.bean.Usuario;
import br.com.fiap.dao.UsuarioDAO;

public class UsuarioBO {

	public static boolean login(Usuario usuario) {

		Retorno ret = (Retorno) new UsuarioDAO().buscarUsuario(usuario);

		if (ret.getIdRetorno() == 200) {
			return true;
		} else {
			return false;
		}

	}

}
