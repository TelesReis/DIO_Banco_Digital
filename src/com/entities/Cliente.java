package com.entities;

public class Cliente {
	private String nome;
	private String CPF;

	public Cliente() {
	}

	public Cliente(String CPF, String nome) {
		this.nome = nome;
		this.CPF = CPF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
}
