package br.com.fiap.am.model;

import java.util.Date;

public class Feriado {
	private long cdFeriado;
	private String nmFeriado;
	private Date dtFeriado;
	
	public Feriado() {
		super();
	}
	public Feriado(long cdFeriado, String nmFeriado, Date dtFeriado) {
		super();
		this.cdFeriado = cdFeriado;
		this.nmFeriado = nmFeriado;
		this.dtFeriado = dtFeriado;
	}
	public long getCdFeriado() {
		return cdFeriado;
	}
	public void setCdFeriado(long cdFeriado) {
		this.cdFeriado = cdFeriado;
	}
	public String getNmFeriado() {
		return nmFeriado;
	}
	public void setNmFeriado(String nmFeriado) {
		this.nmFeriado = nmFeriado;
	}
	public Date getDtFeriado() {
		return dtFeriado;
	}
	public void setDtFeriado(Date dtFeriado) {
		this.dtFeriado = dtFeriado;
	}
}
