package br.com.encomendaDeBolos.model;

import java.util.Date;

public class Cliente {
	private int codigo;
	private String nome;
	private String telefone;
	private Endereco endereco;
	private Date dataNasc;
	
	public Cliente(int codigo, String nome, String telefone, Endereco endereco, Date dataNasc) {
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.dataNasc = dataNasc;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

}
