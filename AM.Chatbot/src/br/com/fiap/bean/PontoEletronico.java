package br.com.fiap.bean;

import java.util.Date;

public class PontoEletronico {
	private long cdPontoEletronico;
	private Date dtMarcacao;
	private Date dtSaida;
	private Date dtEntrada;
	private double saldo;
	
	public PontoEletronico() {
		super();	
	}
	public PontoEletronico(long cdPontoEletronico, Date dtMarcacao, Date dtSaida, Date dtEntrada, double saldo) {
		super();
		this.cdPontoEletronico = cdPontoEletronico;
		this.dtMarcacao = dtMarcacao;
		this.dtSaida = dtSaida;
		this.dtEntrada = dtEntrada;
		this.saldo = saldo;
	}
	public long getCdPontoEletronico() {
		return cdPontoEletronico;
	}
	public void setCdPontoEletronico(long cdPontoEletronico) {
		this.cdPontoEletronico = cdPontoEletronico;
	}
	public Date getDtMarcacao() {
		return dtMarcacao;
	}
	public void setDtMarcacao(Date dtMarcacao) {
		this.dtMarcacao = dtMarcacao;
	}
	public Date getDtSaida() {
		return dtSaida;
	}
	public void setDtSaida(Date dtSaida) {
		this.dtSaida = dtSaida;
	}
	public Date getDtEntrada() {
		return dtEntrada;
	}
	public void setDtEntrada(Date dtEntrada) {
		this.dtEntrada = dtEntrada;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}	
}
