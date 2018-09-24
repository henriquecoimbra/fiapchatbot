package br.com.fiap.bean;

public class Departamento {
	private long cdDepartamento;
	private String nmDepartamento;
	private String tipoDepartamento;
	
	public Departamento() {
		super();
	}
	public Departamento(long cdDepartamento, String nmDepartamento, String tipoDepartamento) {
		super();
		this.cdDepartamento = cdDepartamento;
		this.nmDepartamento = nmDepartamento;
		this.tipoDepartamento = tipoDepartamento;
	}
	public long getCdDepartamento() {
		return cdDepartamento;
	}
	public void setCdDepartamento(long cdDepartamento) {
		this.cdDepartamento = cdDepartamento;
	}
	public String getNmDepartamento() {
		return nmDepartamento;
	}
	public void setNmDepartamento(String nmDepartamento) {
		this.nmDepartamento = nmDepartamento;
	}
	public String getTipoDepartamento() {
		return tipoDepartamento;
	}
	public void setTipoDepartamento(String tipoDepartamento) {
		this.tipoDepartamento = tipoDepartamento;
	}
}
