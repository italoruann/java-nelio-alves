package comportamentoDeMemoriaArraysListas.vetoresOuArrays.conteudo.entitiesEx2;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNomeP() {
        return nome;
    }

    public void setNomeP(String nome) {
        this.nome = nome;
    }

    public double getPrecoP() {
        return preco;
    }

    public void setPrecoP(double preco) {
        this.preco = preco;
    }
}
