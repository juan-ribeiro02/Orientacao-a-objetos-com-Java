package ExAulaHoje.dominio;

public class Vendedor extends Funcionario{
    private double comissao;

    public Vendedor(String cpf, double salario, double comissao){
        super(cpf, salario);
        this.comissao = comissao;
    }

    public void setComissao(double comissao){
        this.comissao = comissao;
    }

    public double getComissao(){
        return comissao;
    }

    @Override
    public double calcularPagamento(){
        return getSalario() + comissao;
    }    

    @Override
    public String toString(){
        return "CPF: " + getCPF() +
                " | Salário: R$" + getSalario() +
                " | Comissao: R$" + getComissao() +
                " | Pagamento: R$" + calcularPagamento();
    }
}
