package br.com.fiap.am.model;

import java.util.Date;

public class Usuario {
	private long cdUsuario;
	private String senha;
	private String nome;
	private String cpf;
	private String email;
	private String celular;
	private Date dtNascimento;
	private Date dtEntradaEmpresa;
	private double salario;
	private Departamento cdDepartamento;
	private PontoEletronico cdPontoEletronico;
	
	public Usuario() {
		super();
	}
	public Usuario(long cdUsuario, String senha, String nome, String cpf, String email, String celular,
			Date dtNascimento, Date dtEntradaEmpresa, double salario, Departamento cdDepartamento,
			PontoEletronico cdPontoEletronico) {
		super();
		this.cdUsuario = cdUsuario;
		this.senha = senha;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.celular = celular;
		this.dtNascimento = dtNascimento;
		this.dtEntradaEmpresa = dtEntradaEmpresa;
		this.salario = salario;
		this.cdDepartamento = cdDepartamento;
		this.cdPontoEletronico = cdPontoEletronico;
	}
	public long getCdUsuario() {
		return cdUsuario;
	}
	public void setCdUsuario(long cdUsuario) {
		this.cdUsuario = cdUsuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public Date getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public Date getDtEntradaEmpresa() {
		return dtEntradaEmpresa;
	}
	public void setDtEntradaEmpresa(Date dtEntradaEmpresa) {
		this.dtEntradaEmpresa = dtEntradaEmpresa;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Departamento getCdDepartamento() {
		return cdDepartamento;
	}
	public void setCdDepartamento(Departamento cdDepartamento) {
		this.cdDepartamento = cdDepartamento;
	}
	public PontoEletronico getCdPontoEletronico() {
		return cdPontoEletronico;
	}
	public void setCdPontoEletronico(PontoEletronico cdPontoEletronico) {
		this.cdPontoEletronico = cdPontoEletronico;
	}	
}
