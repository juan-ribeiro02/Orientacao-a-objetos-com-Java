package exercicioPratico.ex4Diferente.dominio;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FrotaRepository {
    private final String nomeArquivo;

    public FrotaRepository(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void salvar(List<Veiculo> frota) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Veiculo v : frota) {
                if (v instanceof Carro) {
                    Carro c = (Carro) v;
                    writer.write(String.format("CARRO;%s;%.2f;%d%n", c.getPlaca(), c.getCustoFixo(), c.getQuilometragem()));
                } else if (v instanceof Caminhao) {
                    Caminhao cam = (Caminhao) v;
                    writer.write(String.format("CAMINHAO;%s;%.2f;%.2f%n", cam.getPlaca(), cam.getCustoFixo(), cam.getToneladasCarga()));
                }
            }
        }
    }

    public List<Veiculo> carregar() throws IOException {
        List<Veiculo> frotaCarregada = new ArrayList<>();
        File arquivo = new File(nomeArquivo);
        
        if (!arquivo.exists()) return frotaCarregada;

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                if (linha.trim().isEmpty()) continue;
                
                String[] dados = linha.split(";");
                String tipo = dados[0];
                String placa = dados[1];
                double custoFixo = Double.parseDouble(dados[2].replace(",", "."));

                if (tipo.equals("CARRO")) {
                    int km = Integer.parseInt(dados[3]);
                    frotaCarregada.add(new Carro(placa, custoFixo, km));
                } else if (tipo.equals("CAMINHAO")) {
                    double carga = Double.parseDouble(dados[3].replace(",", "."));
                    frotaCarregada.add(new Caminhao(placa, custoFixo, carga));
                }
            }
        }
        return frotaCarregada;
    }
}