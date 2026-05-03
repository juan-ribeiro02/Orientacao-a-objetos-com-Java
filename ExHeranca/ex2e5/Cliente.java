package ExHeranca.ex2e5;

public class Cliente implements Autenticavel{
    private String nome;
    private String senha;

    public Cliente(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }

    //setters e getters
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public String getSenha(){
        return senha;
    }

    @Override
    public boolean autenticar(String senha){
        return this.senha.equals(senha);
    }
}
