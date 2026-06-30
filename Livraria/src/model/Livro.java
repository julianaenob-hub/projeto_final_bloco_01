package src.model;

public class Livro extends Produto {

    private String autor;

    public Livro(int id, String nome, int tipo, float preco, int estoque, String autor) {
        super(id, nome, tipo, preco, estoque);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Autor: " + this.autor);
    }

}