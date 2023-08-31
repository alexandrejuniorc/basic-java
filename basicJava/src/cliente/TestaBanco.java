package cliente;

import contas.Conta;

public class TestaBanco {

	public static void main(String[] args) {
		Cliente ale = new Cliente();
		ale.nome = "Ale";
		ale.CPF = "1.1.1.1";
		ale.profissao = "dev";

		Conta contaDoAle = new Conta();
		contaDoAle.deposita(100);

		contaDoAle.titular = ale;
		System.out.println(contaDoAle.titular.CPF);
	}

}
