package variaveis;

public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 20;
		int quantidadePessoa = 1;
		boolean acompanhado = quantidadePessoa >= 2;

		if (quantidadePessoa >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		System.out.println("Valor de acompanhado é: " + acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("Você pode comprar bebidas!");
		} else {
			System.out.println("Você não pode comprar bebidas!");
		}

	}
}
