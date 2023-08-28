package testeConversao;

public class Conversao {

	public static void main(String[] args) {
		double salario = 2700.50;
		int valor = (int) salario;
		System.out.println("valor: " + valor);
		
		float pontoFlutuante = (float) 3.14;
		System.out.println("pontoFlutuante: " + pontoFlutuante);
		
		int valor2 = 20000000;
		System.out.println("valor2: " + valor2);
		
		long numeroGrande = 1231232132132132132L;
		System.out.println("numeroGrande: " + numeroGrande);
		
		short numeroPequeno = 1231;
		System.out.println("numeroPequeno: " + numeroPequeno);
		
		byte b = 127;
		System.out.println("b: " + b);
	}

}
