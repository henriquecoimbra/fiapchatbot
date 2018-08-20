package br.com.fiap.am.model;

import java.util.Date;

public class Cartao {
	private int cdCartao;
	private String nome;
	private Date dtEmissao;
	private Date dtValidade;
	private int cdInstituicao;
	private Usuario cdUsuario;
	
	public Cartao() {
		super();
	}
	public Cartao(int cdCartao, String nome, Date dtEmissao, Date dtValidade, int cdInstituicao, Usuario cdUsuario) {
		super();
		this.cdCartao = cdCartao;
		this.nome = nome;
		this.dtEmissao = dtEmissao;
		this.dtValidade = dtValidade;
		this.cdInstituicao = cdInstituicao;
		this.cdUsuario = cdUsuario;
	}
	public long getCdCartao() {
		return cdCartao;
	}
	public void setCdCartao(int cdCartao) {
		this.cdCartao = cdCartao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDtEmissao() {
		return dtEmissao;
	}
	public void setDtEmissao(Date dtEmissao) {
		this.dtEmissao = dtEmissao;
	}
	public Date getDtValidade() {
		return dtValidade;
	}
	public void setDtValidade(Date dtValidade) {
		this.dtValidade = dtValidade;
	}
	public int getCdInstituicao() {
		return cdInstituicao;
	}
	public void setCdInstituicao(int cdInstituicao) {
		this.cdInstituicao = cdInstituicao;
	}
	public Usuario getCdUsuario() {
		return cdUsuario;
	}
	public void setCdUsuario(Usuario cdUsuario) {
		this.cdUsuario = cdUsuario;
	}
}
