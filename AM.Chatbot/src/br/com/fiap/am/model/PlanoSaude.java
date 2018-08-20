package br.com.fiap.am.model;

public class PlanoSaude extends Cartao {
	private long cdPlanoSaude;
	private String nmPlanoSaude;
	private String seguradora;
	
	public PlanoSaude() {
		super();
	}
	public PlanoSaude(long cdPlanoSaude, String nmPlanoSaude, String seguradora) {
		super();
		this.cdPlanoSaude = cdPlanoSaude;
		this.nmPlanoSaude = nmPlanoSaude;
		this.seguradora = seguradora;
	}
	public long getCdPlanoSaude() {
		return cdPlanoSaude;
	}
	public void setCdPlanoSaude(long cdPlanoSaude) {
		this.cdPlanoSaude = cdPlanoSaude;
	}
	public String getNmPlanoSaude() {
		return nmPlanoSaude;
	}
	public void setNmPlanoSaude(String nmPlanoSaude) {
		this.nmPlanoSaude = nmPlanoSaude;
	}
	public String getSeguradora() {
		return seguradora;
	}
	public void setSeguradora(String seguradora) {
		this.seguradora = seguradora;
	}
}
