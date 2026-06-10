package exercicioPratico.ex4.dominio;

public class Caminhao extends Veiculo implements Tributavel{
    private double toneladasCarga;

    public Caminhao(String placa, double custoFixo, double toneladasCarga){
        super(placa, custoFixo);
        this.toneladasCarga = toneladasCarga; 
    }

    @Override
    public double calcularCustoTotal(){
        return getCustoFixo() + (toneladasCarga * 50);
    }

    @Override
    public double calcularIPVA(){
        return getCustoFixo() * 0.015;
    }

    public String toLinhaTexto() {
        return "CAMINHAO;" + getPlaca() + ";" + getCustoFixo() + ";" + this.toneladasCarga;
    }

    public double getToneladasCarga(){ return toneladasCarga; }
    public void setToneladasCarga(double novaToneladasCarga){ this.toneladasCarga = novaToneladasCarga;}
}
