package atividadesCanva;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

	/*Escreva um algoritmo em Java, que leia um número inteiro via teclado 
	 * e mostre na tela uma mensagem indicando se este número é par ou ímpar 
	 * e se o número é positivo ou negativo.
	 */

		Scanner ler = new Scanner(System.in);
		
		int n1;
		
		System.out.println("Insira um número");
		n1 = ler.nextInt();
		
		System.out.println("O número" + n1);
		
		if(n1 % 2 == 0) {
			System.out.println("é par");
		} else {
			System.out.println("é impar");
		}
		
		if(n1 >= 0) {
			System.out.println("e positivo!");
		} else{
			System.out.println("e negativo!");
		}
	}

}
