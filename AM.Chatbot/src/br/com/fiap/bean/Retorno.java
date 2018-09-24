package br.com.fiap.bean;

import java.util.ArrayList;
import java.util.List;

public class Retorno {
	private int idRetorno;
	private String msgRetorno;
	private String json;
	private ArrayList<Object> objRetorno;

	public Retorno() {
		super();
	}

	public Retorno(int idRetorno, String msgRetorno, ArrayList<Object> objRetorno) {
		super();
		this.idRetorno = idRetorno;
		this.msgRetorno = msgRetorno;
		this.objRetorno = objRetorno;
	}

	public Retorno(int idRetorno, String msgRetorno, String json) {
		super();
		this.idRetorno = idRetorno;
		this.msgRetorno = msgRetorno;
		this.setJson(json);
	}

	public int getIdRetorno() {
		return idRetorno;
	}

	public String getMsgRetorno() {
		return msgRetorno;
	}

	public Object getObjRetorno() {
		return objRetorno;
	}

	public void setIdRetorno(int idRetorno) {
		this.idRetorno = idRetorno;
	}

	public void setMsgRetorno(String msgRetorno) {
		this.msgRetorno = msgRetorno;
	}

	public void setObjRetorno(List<Object> list) {
		this.objRetorno = (ArrayList<Object>) list;
	}

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}
	
	public void setJson(String json, String resposta) {
		this.json = json.replace("#lastMessageSucessful#", resposta);
	}
	
	

}
