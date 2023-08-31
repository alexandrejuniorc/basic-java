package contas;

// saldo, agência, número e titular
public class Conta {

	double saldo;
	int agencia;
	int numero;	
	String titular;

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
}
