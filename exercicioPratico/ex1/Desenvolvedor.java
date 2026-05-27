package exercicioPratico.ex1;

public class Desenvolvedor extends Funcionario{
    private int horasExtra;

    public Desenvolvedor(String nome, double salario, int horasExtra){
        super(nome, salario);
        this.horasExtra = horasExtra;
    }

    public int getHorasExtra(){
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra){
        this.horasExtra = horasExtra;
    }

    @Override
    public double calculaSalario(){
        return getSalarioBase() + (getHorasExtra() * 50);
    }
}