package Produtos;

import java.util.ArrayList;

public class ListaProdutos {
    public static void main(String[] args) {

        TiposProduto produto1 = new TiposProduto("Tenis", 1200);
        TiposProduto produto2 = new TiposProduto("Bolsa", 860);
        TiposProduto produto3 = new TiposProduto("Oculos", 220);

        ArrayList<TiposProduto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        double soma = 0;
        for (TiposProduto produto : produtos) {
            soma += produto.getPreco();
        }

        double precoMedio = soma / produtos.size();
        System.out.println("O preço medio do prudutos e: " + precoMedio);

    }
}
