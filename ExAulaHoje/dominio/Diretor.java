package ExAulaHoje.dominio;

public class Diretor extends Funcionario{
    private double bonificacao;

    public Diretor(String cpf, double salario, double bonificacao){
        super(cpf, salario);
        this.bonificacao = bonificacao;
    }

    public void setBonificacao(double bonificacao){
        this.bonificacao = bonificacao;
    }

    public double getBonificacao(){
        return bonificacao;
    }

    @Override
    public double calcularPagamento(){
        return getSalario() + bonificacao;
    }

    @Override
    public String toString(){
        return "CPF: " + getCPF() +
                " | Salário: R$" + getSalario() +
                " | Bonificação: R$" + getBonificacao() +
                " | Pagamento: R$" + calcularPagamento();
    }
}
