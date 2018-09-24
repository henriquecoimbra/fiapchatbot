package br.com.fiap.bo;

import java.sql.SQLException;

import com.ibm.watson.developer_cloud.conversation.v1.model.MessageResponse;

import br.com.fiap.bean.Retorno;
import br.com.fiap.dao.SalaDAO;

public class SalaBO {

	Retorno retorno = null;
	static String json = "";

	public Retorno disponibilidadeData(MessageResponse resp, String pergunta) {

		String dateBooking = resp.getContext().get("dateBooking").toString();

		try {
			retorno = new SalaDAO().disponibilidadeData(resp, dateBooking);
		} catch (Exception e) {
			retorno = new Retorno(404, "Não existe salas disponíveis para essa data.", "");
		}

		retorno.setJson(SalaBO.JsonRetorno(retorno, resp, pergunta));

		return retorno;
	}

	public Retorno disponibilidadeCapacidade(MessageResponse resp, String pergunta) {

		String dateBooking = resp.getContext().get("dateBooking").toString();
		String numberPeople = resp.getContext().get("numberPeople").toString();

		try {
			retorno = new SalaDAO().disponibilidadeCapacidade(resp, dateBooking, numberPeople);
			if(retorno.getIdRetorno() == 404)
				retorno = new SalaDAO().disponibilidadeCapacidadeMax(resp, dateBooking, numberPeople);
		} catch (Exception e) {			
			
		}

		retorno.setJson(SalaBO.JsonRetorno(retorno, resp, pergunta));

		return retorno;
	}

	private static String JsonRetorno(Retorno jsonretorno, MessageResponse resp, String pergunta) {

		String resposta = "{ \"pergunta\": \"" + pergunta + "\", \"resposta\":  [\"" + "%s" + "\"]}";

		if (jsonretorno.getIdRetorno() == 200)
			json = String.format(resposta, resp.getOutput().getText().get(0));
		else
			json = String.format(
					"{ \"pergunta\": \"" + pergunta + "\", \"resposta\":  [\"" + "%s" + "\",\"" + "%s" + "\"]}",
					jsonretorno.getMsgRetorno(), "#lastMessageSucessful#");

		return json;
	}

}
