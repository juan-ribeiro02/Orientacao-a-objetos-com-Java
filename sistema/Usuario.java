package sistema;

public class Usuario {
    
    public String nome;
    public int idade;
    public String funcao;
    public String pais;

    public Usuario(String nome, int idade, String funcao, String pais) {
        this.nome = nome;
        this.idade = idade;
    }

    public void votoUser(Filme filmeVot){
        filmeVot.filmeVotado(this);
    }

    public static void main(String[] args) {
        Usuario user1 = new Usuario("Juan", 19, "Influenciador", "Brasil");
        Filme f1 = new Filme("la la land", "Jose Carlos", "01:56", 2017, "Romance");
        Filme f2 = new Filme("Avengers", "Carlos Magnus", "03:01", 2019, "Aventura");

        user1.votoUser(f1);

        System.out.println("Votos filme 1: "+f1.totalDeVotos);
        System.out.println("Votos filme 2: "+f2.totalDeVotos);
    }
}