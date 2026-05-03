package ExHeranca.ex2e5;

public class Gerente extends Funcionario implements Autenticavel{
    private String departamento;
    private String senha;

    public Gerente(String nome, double salario, String departamento, String senha){
        super(nome, salario);
        this.departamento = departamento;
        this.senha = senha;
    }

    //setters e getters
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public String getDepartamento(){
        return departamento;
    }    

    public void setSenha(String senha){
        this.senha = senha;
    }

    public String getSenha(){
        return senha;
    } 

    @Override
    public double calcularBonus(){
        return salario * 0.20;
    }

    @Override
    public boolean autenticar(String senha){
        return this.senha.equals(senha);
    }

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Maria", 2300.50);
        Funcionario g1 = new Gerente("Carlos", 11000, "RH", "gerente123");

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
