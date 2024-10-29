package atividadesCanva;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float media;
		
		System.out.println("Digite a Nota 1: \n");
		nota1 = ler.nextFloat();

		System.out.println("Digite a Nota 2: \n");
		nota2 = ler.nextFloat();	

		System.out.println("Digite a Nota 3: \n");
		nota3 = ler.nextFloat();				
				
		System.out.println("Digite a Nota 4: \n");
		nota4 = ler.nextFloat();		
				
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Média: \n" + media);
				
		ler.close();

	}

}
