package com.entities;

public class ContaCorrente extends Conta{
	// Conta Corrente
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		System.out.println("|||||| Extrato - Conta Corrente ||||||");
		super.imprimirAtributos();
	}
	
}
