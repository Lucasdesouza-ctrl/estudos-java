package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ClientBank;

public class BankApp {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		ClientBank cliente = new ClientBank();
		int numeroConta;
		double saldo;
		String nome;
		int decisao;
		System.out.println("Seja bem-vindo");
		System.out.print("Digite o número da sua conta:");
		numeroConta = scan.nextInt();
		cliente.setNumeroConta(numeroConta);
		System.out.println("Digite seu nome: ");
		nome = scan.next();
		cliente.setNome(nome);
		System.out.println("Deseja fazer um depósito ? \n 1- Sim  2- Não");
		decisao = scan.nextInt();
		if (decisao == 1) {
			System.out.println("Quanto deseja depositar ?");
			saldo = scan.nextDouble();
			cliente.setSaldo(saldo);

		}
		int index = 0;
		while (index == 0) {
			System.out.println();
			System.out.println();
			System.out.printf("Nome: %s, Número da conta: %d, Saldo:%.2f%n", cliente.getNome(),
					cliente.getNumeroConta(), cliente.getSaldo());
			System.out.println();
			System.out.println();
			double valor;
			System.out.println("O que deseja fazer agora ? \n 1- Depositar  2- Sacar  3- Sair");
			decisao = scan.nextInt();
			switch (decisao) {
			case 1:
				System.out.println("Quanto deseja depositar ?");
				valor = scan.nextDouble();
				cliente.depositar(valor);
				break;
			case 2:
				System.out.println("Quanto deseja sacar ?");
				valor = scan.nextDouble();
				cliente.sacar(valor);
				break;
			case 3:
				index = 1;
				break;
			default:
				System.out.println("Opção indisponivel.");
				break;
			}

		}
		System.out.println("Até logo !");
		scan.close();
	}

}
