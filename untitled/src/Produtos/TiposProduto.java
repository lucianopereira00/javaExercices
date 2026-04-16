package Produtos;

public class TiposProduto {
    private String nome;
    private double preco;

    public TiposProduto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void setPreco() {
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
