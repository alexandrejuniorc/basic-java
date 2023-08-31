package contas;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoAle = new Conta();

		contaDoAle.deposita(100);
		contaDoAle.deposita(70);
		System.out.println(contaDoAle.getSaldo());

		contaDoAle.saca(30);
		System.out.println(contaDoAle.getSaldo());

		contaDoAle.saca(200);
		System.out.println("O saldo do ale antes da transferência é: " + contaDoAle.getSaldo());

		Conta contaDaMaria = new Conta();
		contaDaMaria.deposita(1000);
		System.out.println("O saldo da maria antes da transferência é: " + contaDaMaria.getSaldo());

		contaDaMaria.transfere(300, contaDoAle);
		System.out.println("O saldo da maria depois da transferência é: " + contaDaMaria.getSaldo());
		System.out.println("O saldo do ale depois da transferência é: " + contaDoAle.getSaldo());
	}

}
