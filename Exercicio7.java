package atividadesCanva;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		/*
		 * Para doar sangue é necessário ter entre 18 e 69 anos de idade. Pessoas com
		 * idade entre 60 e 69 anos, só podem doar se não for a sua primeira doação.
		 * Escreva um Algoritmo em Java que obtenha via teclado o nome do doador
		 * (String), a idade (inteiro) do doador e se é a primeira doação (boolean). De
		 * acordo com as Regras para a doação, mostre na tela se o doador está Apto ou
		 * Não Apto para doar sangue.
		 */

		String nome;
		int idade;
		boolean primeiraDoacao;

		Scanner ler = new Scanner(System.in);

		System.out.println("Insira seu nome: \n");
		nome = ler.nextLine();

		System.out.println("\nOlá, " + nome + "! É a sua primeira doação? \n");
		primeiraDoacao = ler.nextBoolean();

		System.out.println("\nInsira sua idade: \n");
		idade = ler.nextInt();

		if (idade < 18 || idade > 69 || (idade >= 60 && primeiraDoacao)) {
			System.out.println(nome + " não está apto(a) para doar sangue!");
		} else {
			System.out.println(nome + " está apto(a) para doar sangue!");
		}
		
		ler.close();

	}

}
