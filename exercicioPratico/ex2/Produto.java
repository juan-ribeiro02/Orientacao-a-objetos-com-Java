package exercicioPratico.ex2;

public class Produto implements Promocional{
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    @Override
    public void aplicarDesconto(double percentual){
        this.preco = getPreco() - getPreco() * (percentual / 100);
    }
}
