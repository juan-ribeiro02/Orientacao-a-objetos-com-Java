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
    public void exibeVendedor(){
        super.exibeVendedor();
        System.out.println("Comissao: R$" + comissao);
    }
}
