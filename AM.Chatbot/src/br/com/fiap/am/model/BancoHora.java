package br.com.fiap.am.model;

import java.util.Date;

public class BancoHora {
	private long cdBancoHora;
	private Date dtFechamento;
	private double saldo;
	private Usuario cdUsuario;
	
	public BancoHora() {
		super();
	}
	public BancoHora(long cdBancoHora, Date dtFechamento, double saldo, Usuario cdUsuario) {
		super();
		this.cdBancoHora = cdBancoHora;
		this.dtFechamento = dtFechamento;
		this.saldo = saldo;
		this.cdUsuario = cdUsuario;
	}
	public long getCdBancoHora() {
		return cdBancoHora;
	}
	public void setCdBancoHora(long cdBancoHora) {
		this.cdBancoHora = cdBancoHora;
	}
	public Date getDtFechamento() {
		return dtFechamento;
	}
	public void setDtFechamento(Date dtFechamento) {
		this.dtFechamento = dtFechamento;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Usuario getCdUsuario() {
		return cdUsuario;
	}
	public void setCdUsuario(Usuario cdUsuario) {
		this.cdUsuario = cdUsuario;
	}	
}
