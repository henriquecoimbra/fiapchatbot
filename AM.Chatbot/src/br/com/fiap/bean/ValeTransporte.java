package br.com.fiap.bean;

public class ValeTransporte extends Cartao {
	private long cdVt;
	private String nmValeTransporte;
	
	public ValeTransporte() {
		super();
	}
	public ValeTransporte(long cdVt, String nmValeTransporte) {
		super();
		this.cdVt = cdVt;
		this.nmValeTransporte = nmValeTransporte;
	}
	public long getCdVt() {
		return cdVt;
	}
	public void setCdVt(long cdVt) {
		this.cdVt = cdVt;
	}
	public String getNmValeTransporte() {
		return nmValeTransporte;
	}
	public void setNmValeTransporte(String nmValeTransporte) {
		this.nmValeTransporte = nmValeTransporte;
	}
}
