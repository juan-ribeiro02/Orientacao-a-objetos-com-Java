package exercicioPratico.ex1;

public class Gerente extends Funcionario{
    private double bonus;

    public Gerente(String nome, double salario, double bonus){
        super(nome, salario);
        this.bonus = bonus;
    }

    public double getBonus(){
        return bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    @Override
    public double calculaSalario(){
        return getSalarioBase() + getBonus();
    }
}