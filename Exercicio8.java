package atividadesCanva;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

	Scanner ler = new Scanner(System.in);

	String produto = "";
	int codigo;
	int quantidade;
	double preco = 0.0;
	double total;
    
    System.out.println("★ ★★ ★★★ ★★★★ ★★★★★★★   Menu   ★★★★★★★ ★★★★ ★★★ ★★ ★\n");
    System.out.println("Digite 1 para Cachorro-Quente");
    System.out.println("Digite 2 para X-Salada");
    System.out.println("Digite 3 para X-Bacon");
    System.out.println("Digite 4 para Bauru");
    System.out.println("Digite 5 para Refrigerante");
    System.out.println("Digite 6 para Suco de Laranja");
    
    codigo = ler.nextInt();
    
    System.out.println("Digite a quantidade: ");
    quantidade = ler.nextInt();
    
    switch (codigo) {
    
    case 1:
    	produto = "Cachorro Quente";
        preco = 10.00;
        
        break;
        
    case 2:
    	produto = "X-Salada";
        preco = 15.00;
        break;
        
    case 3:
    	produto = "X-Bacon";
        preco = 18.00;
        break;
        
    case 4:
    	produto = "Bauru";
        preco = 12.00;
        break;
        
    case 5:
        produto = "Refrigerante";
        preco = 8.00;
        break;
        
    case 6:
        produto = "Suco de Laranja";
        preco = 13.00;
        break;
        }

        total = quantidade * preco;
        
        System.out.printf("Produto: %s\n", produto);
        System.out.printf("Quantidade: %d\n", quantidade);
        System.out.printf("Valor total: R$ %.2f\n", total);
        
        ler.close();

	}

}
	

