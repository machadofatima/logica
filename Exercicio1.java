package atividadesCanva;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		float salario;
		float abono;
		float novo_salario;

		System.out.println("Digite o salario: \n");

		salario = ler.nextFloat();

		System.out.println("Digite o abono: \n");

		abono = ler.nextFloat();

		novo_salario = salario + abono;
		
		System.out.println("Novo salário: \n" + novo_salario);

		ler.close();


	}

}
