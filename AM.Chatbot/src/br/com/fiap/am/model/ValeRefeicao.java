package br.com.fiap.am.model;

public class ValeRefeicao extends Cartao {
	private long cdVr;
	private String nmInstituicaoVr;
	
	public ValeRefeicao() {
		super();
	}
	public ValeRefeicao(long cdVr, String nmInstituicaoVr) {
		super();
		this.cdVr = cdVr;
		this.nmInstituicaoVr = nmInstituicaoVr;
	}
	public long getCdVr() {
		return cdVr;
	}
	public void setCdVr(long cdVr) {
		this.cdVr = cdVr;
	}
	public String getNmInstituicaoVr() {
		return nmInstituicaoVr;
	}
	public void setNmInstituicaoVr(String nmInstituicaoVr) {
		this.nmInstituicaoVr = nmInstituicaoVr;
	}
}
