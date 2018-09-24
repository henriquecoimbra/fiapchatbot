package br.com.fiap.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ibm.watson.developer_cloud.conversation.v1.Conversation;
import com.ibm.watson.developer_cloud.conversation.v1.model.Context;
import com.ibm.watson.developer_cloud.conversation.v1.model.InputData;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageResponse;

import br.com.fiap.bean.LastWatsonConnectionData;
import br.com.fiap.bean.Retorno;
import br.com.fiap.bo.WatsonBO;

@WebServlet("/WatsonConnection")
public class WatsonConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ArrayList<String> conversa = new ArrayList<String>();
	Context context = new Context();
	LastWatsonConnectionData data = new LastWatsonConnectionData(null, true, "");

	public WatsonConnection() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		MessageResponse resp = null;
		Retorno retorno = null;

		data = (LastWatsonConnectionData) session.getAttribute("lastMessage");
		if (data == null)
			data = new LastWatsonConnectionData(null, true, "");

		String pergunta = request.getParameter("minhapergunta");

		if (!data.lastMessageSucessful) {
			context = data.lastMessage.getContext();
		}

		resp = conversationAPI(pergunta, context);
		System.out.println(resp);
		context = resp.getContext();

		retorno = new WatsonBO().WatsonBrain(resp, pergunta);

		if (retorno.getIdRetorno() == 200) {
			data.setLastMessageSucessful(true);
			data.setLastMessage(resp);
			data.setLastResposta(resp.getOutput().getText().get(0));
		} else if (retorno.getIdRetorno() == 302) {
			data.setLastMessageSucessful(false);
			data.setLastMessage(new MessageResponse());
			data.setLastResposta(retorno.getJson());
		} else {
			data.setLastMessageSucessful(false);
			retorno.setJson(retorno.getJson(), data.lastResposta);
		}

		session.setAttribute("lastMessage", data);

		response.setContentType("application/json");
		response.getWriter().write(retorno.getJson());
	}

	public static MessageResponse conversationAPI(String input, Context context) {
		Conversation service = new Conversation("2017-02-03");
		service.setUsernameAndPassword("d0235bce-56b5-4dac-bd35-66f96876bedd", "OQqe3eokXEVz");
		InputData inputData = new InputData.Builder().text(input).build();

		String workspaceId = "6d11cccd-55f7-4d89-be3f-49cdd80e9bb2";
		MessageOptions options = new MessageOptions.Builder(workspaceId).input(inputData).context(context).build();
		MessageResponse response = service.message(options).execute();
		return response;
	}
}
