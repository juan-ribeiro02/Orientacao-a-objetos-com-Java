package exercicioPratico.ex4.dominio;

public class Carro extends Veiculo implements Tributavel{
    private int quilometragem;
     public Carro(String placa, double custoFixo, int quilometragem){
        super(placa, custoFixo);
        this.quilometragem = quilometragem;
     }

    @Override
    public double calcularCustoTotal(){
        return getCustoFixo() + (quilometragem * 0.15);
    }

    @Override
    public double calcularIPVA(){
        return getCustoFixo() * 0.04;
    }

    public String toLinhaTexto() {
        return "CARRO;" + getPlaca() + ";" + getCustoFixo() + ";" + this.quilometragem;
    }

    public int getQuilometragem(){ return quilometragem; }
    public void setQuilometragem(int novaQuilometragem){ this.quilometragem = novaQuilometragem; }

}