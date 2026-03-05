package sistema;

import javax.swing.JOptionPane;

public class Filme {
    public String nome;
    public String diretor;
    public String duracao;
    public int anoLancamento;
    public String genero;
    public int totalDeVotos;

    public Filme(String nome, String diretor, String duracao, int anoLancamento, String genero) {
        this.nome = nome;
        this.diretor = diretor;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
        this.totalDeVotos = 0;
    }

    public void filmeVotado(Usuario usuario){
        this.totalDeVotos++;
    }
}
