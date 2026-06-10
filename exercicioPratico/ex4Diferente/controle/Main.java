package exercicioPratico.ex4Diferente.controle;

import exercicioPratico.ex4Diferente.dominio.*;

public class Main {
    public static void main(String[] args) {
        // Inicializa a persistência
        FrotaRepository repository = new FrotaRepository("frota.txt");
        
        // Injeta o repositório no controlador (Injeção de Dependência)
        FrotaController controller = new FrotaController(repository);
        
        // Passa o controlador pronto para a camada visual
        FrotaView view = new FrotaView(controller);
        
        // Dispara o app
        view.iniciar();
    }
}
