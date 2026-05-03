package ExHeranca.ex3;

public class Controlador {
    public static void main(String[] args) {

        Conta c1 = new Conta(1000);
        Conta c2 = new ContaPoupanca(1000, 5);
        Conta c3 = new ContaCorrente(1000, 500);

        c1.saque(100);
        c2.saque(100);
        c3.saque(1200);

        System.out.println("Saldo Conta: " + c1.getSaldo());
        System.out.println("Saldo Poupança: " + c2.getSaldo());
        System.out.println("Saldo Corrente: " + c3.getSaldo());        
    }
}
