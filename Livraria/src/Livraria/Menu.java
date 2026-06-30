package Livraria;
import java.util.Scanner;

import controller.Controller;
import model.Livro;
import model.Produto;
import model.Revista;

public class Menuatual {
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
	Controller produtos = new Controller();

	int opcao;

	while (true) {

	    opcao = leia.nextInt();

	    switch (opcao) {
	    case 1:
	        System.out.println("Listar todos os Produtos");
	       produtos.listarTodos();
	        break;

	    case 2:
	        System.out.println("Procurar Produto por ID");
	        System.out.print("Digite o ID do produto: ");
	        int idBusca = leia.nextInt(); 
	        
	        produtos.buscarPorId(idBusca); 
	        break;

	    case 3:
	        System.out.println("Cadastrar Produto");
	        System.out.println("Escolha o tipo: 1 - Livro | 2 - Revista");
	        int tipo = leia.nextInt();
	        leia.nextLine(); // Limpa o cache do teclado
	        
	        System.out.print("Digite o nome: ");
	        String nome = leia.nextLine();
	        
	        System.out.print("Digite o preço: ");
	        float preco = leia.nextFloat();
	        
	        System.out.print("Digite a quantidade em estoque: ");
	        int estoque = leia.nextInt();
	        leia.nextLine(); 
	        
	        if (tipo == 1) {
	            System.out.print("Digite o autor do livro: ");
	            String autor = leia.nextLine();
	            
	            Produto novoLivro = new Livro(0, nome, tipo, preco, estoque, autor);
	            produtos.cadastrar(novoLivro);
	            
	        } else if (tipo == 2) {
	            System.out.print("Digite o número da edição da revista: ");
	            int edicao = leia.nextInt(); 
	                 
	            Produto novaRevista = new Revista(0, nome, tipo, preco, estoque, edicao);
	            produtos.cadastrar(novaRevista);
	        } else {
	            System.out.println("Tipo inválido!");
	        }
	        break;
	     
	    case 4:
	        System.out.println("Atualizar Produto");
	        System.out.print("Digite o ID do produto que deseja atualizar: ");
	        int idAtualizar = leia.nextInt();
	        
	        System.out.println("Escolha o tipo do produto: 1 - Livro | 2 - Revista");
	        int novoTipo = leia.nextInt();
	        leia.nextLine(); 
	        
	        System.out.print("Digite o novo nome: ");
	        String novoNome = leia.nextLine();
	        
	        System.out.print("Digite o novo preço: ");
	        float novoPreco = leia.nextFloat();
	        
	        System.out.print("Digite a nova quantidade em estoque: ");
	        int novoEstoque = leia.nextInt();
	        leia.nextLine(); 
	        
	        if (novoTipo == 1) {
	            System.out.print("Digite o novo autor do livro: ");
	            String novoAutor = leia.nextLine();
	            
	            Produto livroAtualizado = new Livro(idAtualizar, novoNome, novoTipo, novoPreco, novoEstoque, novoAutor);
	            produtos.atualizar(livroAtualizado);
	            
	        } else if (novoTipo == 2) {
	            System.out.print("Digite o novo número da edição da revista: ");
	            int novaEdicao = leia.nextInt(); 
	            
	            Produto revistaAtualizada = new Revista(idAtualizar, novoNome, novoTipo, novoPreco, novoEstoque, novaEdicao);
	            produtos.atualizar(revistaAtualizada);
	        } else {
	            System.out.println("Tipo inválido!");
	        }
	        break;

	    case 5:
	        System.out.println("Deletar Produto");
	        System.out.print("Digite o ID do produto a ser deletado: ");
	        int idDeletar = leia.nextInt();
	        
	        produtos.deletar(idDeletar); 
	        break;

	    case 0:
	        System.out.println("Programa finalizado!");
	        leia.close();
	        System.exit(0);

	    default:
	        System.out.println("Opção inválida!");
	    }
	  
	    pressionarEnter(leia);
	}
	
	}
	
	public static void pressionarEnter(Scanner leia) {
	    System.out.println("\n--- Pressione Enter para escolher uma nova opção ---");
	    leia.nextLine(); 
	}
}
