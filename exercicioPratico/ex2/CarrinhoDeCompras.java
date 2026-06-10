package exercicioPratico.ex2;

import java.util.ArrayList;

public class CarrinhoDeCompras{
    private ArrayList<Produto> produtos;

    public CarrinhoDeCompras(){
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto p){
        produtos.add(p);
    }

    public double calcularTotal(){
        double total = 0;

        for (Produto p : produtos) {
            total += p.getPreco();
        }

        return total;
    }

    public void aplicarDescontoGeral(double percentual){
        if(percentual < 0 || percentual > 100){
            throw new IllegalArgumentException("Percentual deve estar entre 0 e 100.");
        }

        for(Produto p: produtos){
            p.aplicarDesconto(percentual);
        }
    }
}
