package contas;

import cliente.Cliente;

// saldo, agência, número e titular
public class Conta extends Cliente {

	private double saldo;
	int agencia;
	int numero;
	public Cliente titular;

	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("Não há saldo suficiente, saque negado!");
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			System.out.println("Não há saldo suficiente, transferência negada!");
			return false;
		}

	}

}
