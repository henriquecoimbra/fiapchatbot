package br.com.fiap.bean;

import com.ibm.watson.developer_cloud.conversation.v1.model.MessageResponse;

public class LastWatsonConnectionData {
	public MessageResponse lastMessage;
	public boolean lastMessageSucessful;
	public String lastResposta;

	public LastWatsonConnectionData(MessageResponse lastMessage, boolean lastMessageSucessful, String lastResposta) {
		this.lastMessage = lastMessage;
		this.lastMessageSucessful = lastMessageSucessful;
		this.lastResposta = lastResposta;
	}

	public MessageResponse getLastMessage() {
		return lastMessage;
	}

	public void setLastMessage(MessageResponse lastMessage) {
		this.lastMessage = lastMessage;
	}

	public boolean isLastMessageSucessful() {
		return lastMessageSucessful;
	}

	public void setLastMessageSucessful(boolean lastMessageSucessful) {
		this.lastMessageSucessful = lastMessageSucessful;
	}

	public String getLastResposta() {
		return lastResposta;
	}

	public void setLastResposta(String lastResposta) {
		this.lastResposta = lastResposta;
	}
}