package exercicioPratico.ex4Diferente.dominio;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class FrotaView {
    private final FrotaController controller;
    private final Scanner scanner;

    public FrotaView(FrotaController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        System.out.println("=== SISTEMA DE GESTÃO DE FROTA ===");
        
        // Executando fluxo automatizado do teste solicitado
        executarFluxoDeTeste();
    }

    private void executarFluxoDeTeste() {
        // Ação 1: Teste de Placa Inválida
        System.out.println("\n[Ação 1] Testando validação de placa incorreta...");
        try {
            Carro carroInvalido = new Carro("ABC12", 500.0, 10000);
            controller.adicionarVeiculo(carroInvalido);
        } catch (PlacaInvalidaException e) {
            System.out.println("Sucesso! Exceção capturada na View: " + e.getMessage());
        }

        // Ação 2: Adicionando dados válidos
        System.out.println("\n[Ação 2] Adicionando veículos válidos...");
        try {
            Carro carroValido = new Carro("KGP1A23", 1200.0, 15000);
            Caminhao caminhaoValido = new Caminhao("BRA2E19", 3500.0, 12.5);
            
            controller.adicionarVeiculo(carroValido);
            controller.adicionarVeiculo(caminhaoValido);
            System.out.println("Veículos adicionados ao controlador com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro inesperado ao criar veículos: " + e.getMessage());
        }

        // Ação 3: Gravando dados via controlador
        System.out.println("\n[Ação 3] Solicitando gravação no arquivo via Controlador...");
        try {
            controller.salvarDados();
            System.out.println("Arquivo 'frota.txt' gerado pelo Repository.");
        } catch (IOException e) {
            System.out.println("Erro de I/O ao salvar dados: " + e.getMessage());
        }

        // Ação 4: Leitura e exibição retroativa
        System.out.println("\n[Ação 4] Carregando dados do arquivo e exibindo resultados:");
        try {
            // Força a limpeza da memória e recarregamento do arquivo para provar a persistência
            controller.carregarDados();
            List<Veiculo> veículosDoSistema = controller.listarFrota();
            
            for (Veiculo v : veículosDoSistema) {
                System.out.print("Placa: " + v.getPlaca() + " | Custo Total: R$ " + String.format("%.2f", v.calcularCustoTotal()));
                if (v instanceof Tributavel) {
                    System.out.print(" | IPVA: R$ " + String.format("%.2f", ((Tributavel) v).calcularIPVA()));
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Erro de I/O ao carregar dados: " + e.getMessage());
        }
    }
}