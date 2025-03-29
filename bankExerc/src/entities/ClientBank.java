package entities;

public class ClientBank {
	private int numeroConta;
	private String nome;
	private double saldo;

	public ClientBank() {

	}

	public ClientBank(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;

	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		if (valor <= 0) {
			System.out.println("Valor inválido.");
		} else {
			this.saldo += valor;
		}
	}

	public void sacar(double valor) {
		if (this.saldo - valor >= 5.00) {
			this.saldo -= valor + 5.00;
		} else if (saldo < valor) {
			System.out.println("Saque indiponivel: Saldo insuficiente.");
		}else if(valor <= 0) {
			System.out.println("Valor inválido.");
		}
		else {
			System.out.println("Saque indiponivel: Saldo não cobre a tarifa de saque.");
		}
	}

}
