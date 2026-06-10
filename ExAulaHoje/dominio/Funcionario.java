package ExAulaHoje.dominio;

public class Funcionario implements Pagavel{
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

    @Override
    public double calcularPagamento(){
        return salario;
    }
    
    @Override
    public String toString(){
        return "CPF: " + cpf +
                " | Salário R$" + salario +
                " | Pagamento: R$" + calcularPagamento();
    }
}
