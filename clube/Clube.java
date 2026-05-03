package clube;

public class Clube {
    private String nome;
    private int vitorias;
    private int empates;
    private int derrotas;

    public Clube(String nome, int vitorias, int empates, int derrotas) {
        this.nome = nome;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int novaVitorias) {
        this.vitorias = novaVitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int novoEmpates) {
        this.empates = novoEmpates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int novaDerrotas) {
        this.derrotas = novaDerrotas;
    }

    public int totalJogos() {
        return vitorias + empates + derrotas;
    }

    public int pontosGanhos() {
        return vitorias * 3 + empates;
    }

    public int pontosPerdidos() {
        return empates * 2 + derrotas * 3;
    }

    public double aproveitamento() {
        return (100 * pontosGanhos()) / (totalJogos() * 3);
    }
}
