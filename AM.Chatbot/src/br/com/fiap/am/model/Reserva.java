package br.com.fiap.am.model;

import java.util.Date;

public class Reserva {
	private SalaReuniao cdSala;
	private Date dtReserva;
	private Date dtSaida;
	private Usuario cdUsuario;
	
	public Reserva() {
		super();
	}
	public Reserva(SalaReuniao cdSala, Date dtReserva, Date dtSaida, Usuario cdUsuario) {
		super();
		this.cdSala = cdSala;
		this.dtReserva = dtReserva;
		this.dtSaida = dtSaida;
		this.cdUsuario = cdUsuario;
	}
	public SalaReuniao getCdSala() {
		return cdSala;
	}
	public void setCdSala(SalaReuniao cdSala) {
		this.cdSala = cdSala;
	}
	public Date getDtReserva() {
		return dtReserva;
	}
	public void setDtReserva(Date dtReserva) {
		this.dtReserva = dtReserva;
	}
	public Date getDtSaida() {
		return dtSaida;
	}
	public void setDtSaida(Date dtSaida) {
		this.dtSaida = dtSaida;
	}
	public Usuario getCdUsuario() {
		return cdUsuario;
	}
	public void setCdUsuario(Usuario cdUsuario) {
		this.cdUsuario = cdUsuario;
	}
}
