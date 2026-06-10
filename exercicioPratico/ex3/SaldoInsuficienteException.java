package exercicioPratico.ex3;

public class SaldoInsuficienteException extends Exception{
    private double saldoAtual;
    private double valorTentado;

    public SaldoInsuficienteException(double saldoAtual, double valorTentado){
        super("Erro Transiocional: tentativa de saque do valor R$"+ valorTentado +"em uma conta com saldo R$" + saldoAtual);
        this.saldoAtual = saldoAtual;
        this.valorTentado = valorTentado;
    }
}
