package contas;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoAle = new Conta();

		contaDoAle.saldo += 100;
		contaDoAle.deposita(70);
		System.out.println(contaDoAle.saldo);

		contaDoAle.saca(30);
		System.out.println(contaDoAle.saldo);

		contaDoAle.saca(200);
		System.out.println(contaDoAle.saldo);

	}

}
