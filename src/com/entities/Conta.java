package com.entities;

public abstract class Conta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIA = 1;
	
	protected int agencia;
	protected int conta;
	protected Double saldo = 0.00;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.conta = SEQUENCIA++;
		this.cliente = cliente;
	}

	public Conta(int agencia, int conta, double saldo) {
		this.agencia = agencia;
		this.conta = conta;
	}
	public int getAgencia() {
		return agencia;
	}
	public int getConta() {
		return conta;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void sacar(double valor) {
		this.saldo -= valor; 
	}
	public void depositar(double valor) {
		this.saldo += valor;
	}
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	public void verificarSaldo() {
		System.out.printf("Saldo = %.2f%n", this.saldo);
	}
	protected void imprimirAtributos() {
		System.out.printf("Cliente = %s%n", this.cliente.getNome());
		System.out.printf("Agencia = %d%n", this.agencia);
		System.out.printf("Conta = %d%n", this.conta);
	}
}
