package exercicioPratico.ex4.dominio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorFrota {
    private List<Veiculo> frota = new ArrayList<>();

    public void adicionarVeiculo(Veiculo v){
        frota.add(v);
    }

    public void salvarDadosEmArquivo(String nomeArquivo){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))){
            for(Veiculo v : frota){
                if(v instanceof Carro){
                    writer.write(((Carro) v).toLinhaTexto());
                } else if (v instanceof Caminhao){
                    writer.write(((Caminhao) v).toLinhaTexto());
                }
                writer.newLine();
            }
            System.out.println("Dados salvos com sucesso no arquivo: " + nomeArquivo);
        } catch (IOException e){
            System.out.println("Erro ao salvar os dados: " + e.getMessage());
        }
    }

    public void lerDadosDoArquivo(String nomeArquivo){
        System.out.println("\n---LENDO DADOS DO ARQUIVO: " + nomeArquivo + " ---");
        try(BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))){
            String linha;
            while((linha = reader.readLine()) != null){
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler os dados do arquivo: " + e.getMessage());
        }
    }
}
