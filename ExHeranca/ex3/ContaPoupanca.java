package ExHeranca.ex3;

public class ContaPoupanca extends Conta{
    private double taxa;

    public ContaPoupanca(double saldo, double taxa){
        super(saldo);
        this.taxa = taxa;
    }
  
    //setters e getters
    public void setTaxa(double taxa){
        this.taxa = taxa;
    }

    public double getTaxa(){
        return taxa;
    }    

    @Override
    public void saque(double valor){
        double valorComTaxa = valor + taxa;

        if(valorComTaxa <= saldo){
            saldo -= valorComTaxa;
        } else {
            System.out.println("Saldo Insuficiente!a");
        }
    }
}
