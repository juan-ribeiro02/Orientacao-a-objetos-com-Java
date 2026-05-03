package ExHeranca.ex3;

public class ContaCorrente extends Conta{
    private double chequeEspecial;

    public ContaCorrente(double saldo, double chequeEspecial){
        super(saldo);
        this.chequeEspecial = chequeEspecial;
    }

    //setters e getters
    public void setChequeEspecial(double chequeEspecial){
        this.chequeEspecial = chequeEspecial;
    }

    public double getChequeEspecial(){
        return chequeEspecial;
    } 

    @Override
    public void saque(double valor){
        if(saldo + chequeEspecial >= valor){
            saldo -= valor;
        } else {
            System.out.println("Limite Insuficiente");
        }
    }
}
