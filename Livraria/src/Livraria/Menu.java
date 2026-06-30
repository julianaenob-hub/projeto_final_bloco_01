package Livraria;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {

	
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("                 LIVRARIA JAVA                       ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("            1 - Listar todos os Produtos             ");
		System.out.println("            2 - Listar Produto por ID                ");
		System.out.println("            3 - Cadastrar Produto                    ");
		System.out.println("            4 - Atualizar Produto                    ");
		System.out.println("            5 - Deletar Produto                      ");
		System.out.println("            0 - Sair                                 ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.print("Entre com a opção desejada: ");
	
	Scanner leia = new Scanner(System.in);

	int opcao;

	while (true) {

	    opcao = leia.nextInt();

	    switch (opcao) {
	    case 1:
	        System.out.println("Listar todos os Produtos");
	        break;

	    case 2:
	        System.out.println("Listar Produto por ID");
	        break;

	    case 3:
	        System.out.println("Cadastrar Produto");
	        break;

	    case 4:
	        System.out.println("Atualizar Produto");
	        break;

	    case 5:
	        System.out.println("Deletar Produto");
	        break;

	    case 0:
	        System.out.println("Programa finalizado!");
	        leia.close();
	        System.exit(0);

	    default:
	        System.out.println("Opção inválida!");
	    }    
	}
	}
}