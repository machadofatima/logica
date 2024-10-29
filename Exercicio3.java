package atividadesCanva;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		float salario_bruto;
		float adicional_noturno;
		float horas_extras;
		float descontos;
		float salario_liquido;
		
		System.out.println("Digite o Salario Bruto: \n");
		salario_bruto = ler.nextFloat();

		System.out.println("Digite o Adicional Noturno: \n");
		adicional_noturno = ler.nextFloat();	

		System.out.println("Digite as Horas Extras: \n");
		horas_extras = ler.nextFloat();				
				
		System.out.println("Digite os Descontos: \n");
		descontos = ler.nextFloat();		
				
		salario_liquido = salario_bruto + adicional_noturno + (horas_extras * 5) - descontos;
		
		System.out.println("Valor a receber (Salário Liquido): \n" + salario_liquido);
				
		ler.close();
	}

}
