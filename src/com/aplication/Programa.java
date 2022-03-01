package com.aplication;

import java.util.Locale;
import java.util.Scanner;

import com.entities.Cliente;
import com.entities.ContaCorrente;
import com.entities.ContaPoupanca;

public class Programa {
	
	static Scanner scan = new Scanner(System.in);
	
	public static Integer lerOpcao() {
		Integer opcao = null;
	    do {
	      try {
	        opcao = Integer.parseInt(scan.nextLine());
	      } catch (Exception ex) {
	        System.out.println("Opção inválida!!!");
	      }
	    } while (opcao == null);
	    return opcao;
	  }

	  public static Double lerValor() {
	    Double valor = null;
	    do {
	      try {
	        valor = Double.parseDouble(scan.nextLine());
	      } catch (Exception ex) {
	        System.out.println("Opção inválida!!!");
	      }
	    } while (valor == null);
	    return valor;
	  }
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Integer opcao = 0;
		Cliente cliente = new Cliente();
		System.out.print("Informe seu nome: ");
		cliente.setNome(scan.nextLine());
		System.out.print("Informe seu CPF: ");
		cliente.setCPF(scan.nextLine());
		ContaCorrente cc = new ContaCorrente(cliente);
		ContaPoupanca cp = new ContaPoupanca(cliente);
		cp.imprimirExtrato();
		cp.verificarSaldo();
		cc.imprimirExtrato();
		cc.verificarSaldo();
		System.out.println("Seja bem vindo ao seu banco digital!");
		
		do {
			System.out.println("~~~~~~~~~ MENU ~~~~~~~~~");
			System.out.println("1........Consultar saldo");
			System.out.println("2..............Depositar");
			System.out.println("3..................Sacar");
			System.out.println("4.............Transferir");
			System.out.println("5...................Sair");
			System.out.println();
			opcao = lerOpcao();
			switch(opcao) {
			case 1:
				System.out.println("De qual conta deseja consultar o saldo?");
				System.out.println("1........Conta Poupança");
				System.out.println("2........Conta Corrente");
				int opcaoConta = lerOpcao();
		        if (opcaoConta == 1){
		          cp.verificarSaldo();
		        }
		        else if (opcaoConta == 2) {
		          cc.verificarSaldo();
		        }
				break;
			case 2:
				System.out.println("Em qual conta deseja depositar?");
				System.out.println("1........Conta Poupança");
				System.out.println("2........Conta Corrente");
				opcaoConta = lerOpcao();
				System.out.print("Qual o valor de deposito:");
				if (opcaoConta == 1) {
					cp.depositar(lerValor());
				}
				else if (opcaoConta == 2) {
					cc.depositar(lerValor());
				}
				break;
			case 3:
				System.out.println("De qual conta deseja sacar?");
				System.out.println("1........Conta Poupança");
				System.out.println("2........Conta Corrente");
				opcaoConta = lerOpcao();
				System.out.print("Qual o valor de saque:");
				if (opcaoConta == 1) {
					cp.sacar(lerValor());
				}
				else if (opcaoConta == 2) {
					cc.sacar(lerValor());
				}
				break;
			case 4:
				System.out.println("De qual conta deseja transferir?");
				System.out.println("1........Conta Poupança");
				System.out.println("2........Conta Corrente");
				opcaoConta = lerOpcao();
				System.out.print("Qual o valor de transferência:");
				if (opcaoConta == 1) {
					cp.transferir(lerValor(), cc);
				}
				else if (opcaoConta == 2) {
					cc.transferir(lerValor(), cp);
				}
				break;
			case 5:
				System.out.println("Programa finalizado!");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		} while (opcao != 5);
		
		scan.close();

	}

}
