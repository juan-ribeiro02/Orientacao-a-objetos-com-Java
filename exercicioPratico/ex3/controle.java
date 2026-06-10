package exercicioPratico.ex3;

public class controle {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("Juan", 500);

        try{
            System.out.println("Tentando saque...");
            c1.sacar(600);
        } catch (SaldoInsuficienteException e){
            System.err.println("Capturado no bloco catch ->" + e.getMessage());
        } finally {
            System.out.println("Fluxo encerrado.");
        }
    }
}
