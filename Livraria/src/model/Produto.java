package src.model;

public abstract class Produto {
	
	private int id;
	private String nome;
	private int tipo;
	private float preco;
	private int estoque;
	
	public Produto(int id, String nome, int tipo, float preco, int estoque) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.preco = preco;
		this.estoque = estoque;
		
		
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public int getEstoque() {
	    return estoque;
	}

	public void setEstoque(int estoque) {
	    this.estoque = estoque;
	}

	
	
	public void visualizar() {

	    System.out.println("\n\n***********************************************************");
	    System.out.println("Dados do Produto:");
	    System.out.println("***********************************************************");
	    System.out.println("ID: " + this.id);
	    System.out.println("Nome: " + this.nome);
	    System.out.println("Tipo: " + this.tipo);
	    System.out.println("Preço: R$ " + this.preco);
	    System.out.println("Estoque: " + this.estoque);

	}
}
