package atividadesCanva;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		int A;
		int B;
		int C;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o número A: \n");
		A = ler.nextInt();

		System.out.println("Digite o número B: \n");
		B = ler.nextInt();

		System.out.println("Digite o número C: \n");
		C = ler.nextInt();

		if (A + B > C) {
			System.out.println("A Soma de A + B é Maior do que C");
		}
		if (A + B < C) {
			System.out.println("A Soma de A + B é Menor do que C");
			
		}
		if (A + B == C){
			System.out.println("A Soma de A + B é Igual a C");
		}

	}

}