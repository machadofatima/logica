package atividadesCanva;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String cargo = "", nome = "";
		double salario, novo_salario, reajuste = 0.0;
		int codigo;

		System.out.println("Digite o nome do colaborador: ");
		nome = ler.nextLine();

		System.out.println("Digite o salário do colaborador: ");
		salario = ler.nextDouble();

		System.out.print("Digite o código do cargo:\n");
		System.out.println("--Digite 1 para Gerente");
		System.out.println("--Digite 2 para Vendedor");
		System.out.println("--Digite 3 para Supervisor");
		System.out.println("--Digite 4 para Motorista");
		System.out.println("--Digite 5 para Estoquista");
		System.out.println("--Digite 6 para Técnico em TI");

		codigo = ler.nextInt();

		switch (codigo) {

		case 1:
			cargo = "Gerente";
			reajuste = 0.10;
			break;

		case 2:
			cargo = "Vendedor";
			reajuste = 0.07;
			break;

		case 3:
			cargo = "Supervisor";
			reajuste = 0.09;
			break;

		case 4:
			cargo = "Motorista";
			reajuste = 0.06;
			break;

		case 5:
			cargo = "Estoquista";
			reajuste = 0.05;
			break;

		case 6:
			cargo = "Técnico em TI";
			reajuste = 0.08;
			break;

		default:
			System.out.println("Código inválido.");
			ler.close();
			return;
		}

		novo_salario = salario + (reajuste * salario);

		System.out.printf("Nome: %s\n", nome);
		System.out.printf("Cargo: %s\n", cargo);
		System.out.printf("Salário anterior: R$ %.2f\n", salario);
		System.out.printf("Reajuste: %.0f%%\n", reajuste * 100);
		System.out.printf("Novo salário: R$ %.2f\n", novo_salario);

		ler.close();
	}
}
