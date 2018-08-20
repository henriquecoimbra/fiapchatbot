package br.com.fiap.am.model;

import java.util.Date;

public class Arquivo {
	private long cdArquivo;
	private String nmArquivo;
	private String url;
	private Date dtCriacao;
	private Usuario cdUsuario;
	
	public Arquivo() {
		super();
	}
	public Arquivo(long cdArquivo, String nmArquivo, String url, Date dtCriacao, Usuario cdUsuario) {
		super();
		this.cdArquivo = cdArquivo;
		this.nmArquivo = nmArquivo;
		this.url = url;
		this.dtCriacao = dtCriacao;
		this.cdUsuario = cdUsuario;
	}
	public long getCdArquivo() {
		return cdArquivo;
	}
	public void setCdArquivo(long cdArquivo) {
		this.cdArquivo = cdArquivo;
	}
	public String getNmArquivo() {
		return nmArquivo;
	}
	public void setNmArquivo(String nmArquivo) {
		this.nmArquivo = nmArquivo;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Date getDtCriacao() {
		return dtCriacao;
	}
	public void setDtCriacao(Date dtCriacao) {
		this.dtCriacao = dtCriacao;
	}
	public Usuario getCdUsuario() {
		return cdUsuario;
	}
	public void setCdUsuario(Usuario cdUsuario) {
		this.cdUsuario = cdUsuario;
	}
}
