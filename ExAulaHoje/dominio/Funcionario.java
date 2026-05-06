package ExAulaHoje.dominio;

public abstract class Funcionario {
    protected String cpf;
    protected double salario;

    public Funcionario(String cpf, double salario){
        this.cpf = cpf;
        this.salario = salario;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    public String getCPF(){
        return cpf;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }

    public void exibeVendedor(){
        System.out.println("CPF: " + cpf);
        System.out.println("Salario: R$" + salario);
    }
}
