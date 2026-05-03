package ExHeranca.ex3;

public class Conta {
    protected double saldo;

    public Conta(double saldo){
        this.saldo = saldo;
    }

    //setters e getters
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public void saque(double valor){
        if(valor <= saldo){
            saldo -= valor;
        } else {
            System.out.println("Saldo Insuficiente!b");
        }
    }

    public void depositar(double valor){
        saldo += valor;
    }
}
