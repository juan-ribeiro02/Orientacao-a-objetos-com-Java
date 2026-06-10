package exercicioPratico.ex4Diferente.dominio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FrotaController {
    private final List<Veiculo> frota;
    private final FrotaRepository repository;

    public FrotaController(FrotaRepository repository) {
        this.repository = repository;
        this.frota = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        if (veiculo == null) {
            throw new IllegalArgumentException("Veículo não pode ser nulo.");
        }
        frota.add(veiculo);
    }

    public List<Veiculo> listarFrota() {
        // Retorna uma cópia imutável para proteger a lista interna da aplicação
        return Collections.unmodifiableList(frota);
    }

    public void salvarDados() throws IOException {
        repository.salvar(frota);
    }

    public void carregarDados() throws IOException {
        List<Veiculo> dadosDoDisco = repository.carregar();
        frota.clear();
        frota.addAll(dadosDoDisco);
    }
}
