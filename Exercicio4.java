package atividadesCanva;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double n1 = 5.0;
		double n2 = 6.0;
		double n3 = 7.0;
		double n4 = 8.0;
		double diferenca_1;
		double diferenca_2;

		diferenca_1 = (n1 * n2) - (n3 * n4);
		diferenca_2 = (n1 + n2) * (n3 - n4);

		System.out.println("Diferença (primeiro cenário): \n" + diferenca_1);
		System.out.println("Diferença (segundo cenário): \n" + diferenca_2);

		ler.close();
	}
}
