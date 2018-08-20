package br.com.fiap.am.model;

public class SalaReuniao {
	private long cdSala;
	private int numero;
	private int capacidade;
	
	public SalaReuniao() {
		super();
	}
	public SalaReuniao(long cdSala, int numero, int capacidade) {
		super();
		this.cdSala = cdSala;
		this.numero = numero;
		this.capacidade = capacidade;
	}
	public long getCdSala() {
		return cdSala;
	}
	public void setCdSala(long cdSala) {
		this.cdSala = cdSala;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
}
