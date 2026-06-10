package exercicioPratico.ex4Diferente.dominio;

public class Caminhao extends Veiculo implements Tributavel {
    private double toneladasCarga;

    public Caminhao(String placa, double custoFixo, double toneladasCarga) {
        super(placa, custoFixo);
        this.toneladasCarga = toneladasCarga;
    }

    @Override
    public double calcularCustoTotal() {
        return getCustoFixo() + (toneladasCarga * 50.0);
    }

    @Override
    public double calcularIPVA() {
        return getCustoFixo() * 0.015;
    }

    public double getToneladasCarga() { return toneladasCarga; }
}
