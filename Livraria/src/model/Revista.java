package src.model;

public class Revista extends Produto {

    private int edicao;

    public Revista(int id, String nome, int tipo, float preco, int estoque, int edicao) {
        super(id, nome, tipo, preco, estoque);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Edição: " + this.edicao);
    }

}