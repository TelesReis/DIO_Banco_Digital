package com.entities;

public class ContaPoupanca extends Conta {
	// Conta Poupan�a
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		System.out.println("|||||| Extrato - Conta Poupanca ||||||");
		super.imprimirAtributos();
	}
	
}
