package ExHeranca.ex2;

public class Gerente extends Funcionario{
    private String departamento;

    public Gerente(String nome, double salario, String departamento){
        super(nome, salario);
        this.departamento = departamento;
    }

    //setters e getters
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public String getDepartamento(){
        return departamento;
    }    

    @Override
    public double calcularBonus(){
        return salario * 0.20;
    }

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Maria", 2300.50);
        Funcionario g1 = new Gerente("Carlos", 11000, "RH");

        System.out.println("Funcionario:");
        System.out.println("Nome: "+ f1.getNome());
        System.out.println("Bonus: R$" + f1.calcularBonus());

        System.out.println("Gerente:");
        System.out.println("Nome: "+ g1.getNome());
        System.out.println("Bonus: R$" + g1.calcularBonus());        

        Gerente gerente = (Gerente) g1;
        System.out.println("Depertamento: " + gerente.getDepartamento());
    }
}
