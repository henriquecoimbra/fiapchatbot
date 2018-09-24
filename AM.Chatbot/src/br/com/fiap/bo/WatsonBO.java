package br.com.fiap.bo;

import com.ibm.watson.developer_cloud.conversation.v1.model.MessageResponse;

import br.com.fiap.bean.Retorno;

public class WatsonBO {

	public Retorno WatsonBrain(MessageResponse resp, String pergunta) {

		String intent = "";
		boolean giveUp = false;
		Retorno retorno = new Retorno(200, "", "");
		String json = "";

		if (resp.getContext().get("step") != null)
			intent = resp.getContext().get("step").toString();

		if (resp.getContext().get("giveUp") != null) {
			giveUp = Boolean.parseBoolean(resp.getContext().get("giveUp").toString());
		}

		if (giveUp) {
			retorno.setIdRetorno(302);
			json = String.format("{ \"pergunta\": \"" + pergunta + "\", \"resposta\":  [\"" + "%s" + "\"]}",
					"Tudo bem, se quiser alguma coisa só falar ;)");
		} else {
			switch (intent) {
			case "reserva2":
				retorno = new SalaBO().disponibilidadeData(resp, pergunta);
				break;
			case "reserva3":
				retorno = new SalaBO().disponibilidadeCapacidade(resp, pergunta);
				break;
			default:
				json = String.format("{ \"pergunta\": \"" + pergunta + "\", \"resposta\":  [\"" + "%s" + "\"]}",
						resp.getOutput().getText().get(0));
				retorno.setJson(json);
				break;
			}
		}

		return retorno;

	}

}
