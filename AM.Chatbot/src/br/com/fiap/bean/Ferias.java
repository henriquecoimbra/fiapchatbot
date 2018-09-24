package br.com.fiap.bean;

import java.util.Date;

public class Ferias {
	private long cdFerias;
	private Date dtSaida;
	private Date dtRetorno;
	private Date dtSolicitada;
	private Usuario cdUsuario;
	
	public Ferias() {
		super();
	}
	public Ferias(long cdFerias, Date dtSaida, Date dtRetorno, Date dtSolicitada, Usuario cdUsuario) {
		super();
		this.cdFerias = cdFerias;
		this.dtSaida = dtSaida;
		this.dtRetorno = dtRetorno;
		this.dtSolicitada = dtSolicitada;
		this.cdUsuario = cdUsuario;
	}
	public long getCdFerias() {
		return cdFerias;
	}
	public void setCdFerias(long cdFerias) {
		this.cdFerias = cdFerias;
	}
	public Date getDtSaida() {
		return dtSaida;
	}
	public void setDtSaida(Date dtSaida) {
		this.dtSaida = dtSaida;
	}
	public Date getDtRetorno() {
		return dtRetorno;
	}
	public void setDtRetorno(Date dtRetorno) {
		this.dtRetorno = dtRetorno;
	}
	public Date getDtSolicitada() {
		return dtSolicitada;
	}
	public void setDtSolicitada(Date dtSolicitada) {
		this.dtSolicitada = dtSolicitada;
	}
	public Usuario getCdUsuario() {
		return cdUsuario;
	}
	public void setCdUsuario(Usuario cdUsuario) {
		this.cdUsuario = cdUsuario;
	}
}
