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
		System.out.println("O saldo do ale antes da transferência é: " + contaDoAle.saldo);

		Conta contaDaMaria = new Conta();
		contaDaMaria.deposita(1000);
		System.out.println("O saldo da maria antes da transferência é: " + contaDaMaria.saldo);

		contaDaMaria.transfere(300, contaDoAle);
		System.out.println("O saldo da maria depois da transferência é: " + contaDaMaria.saldo);
		System.out.println("O saldo do ale depois da transferência é: " + contaDoAle.saldo);
	}

}
