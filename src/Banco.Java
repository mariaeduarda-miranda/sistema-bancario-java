import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<ContaBancaria> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public ContaBancaria buscarConta(String numero) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumero().equals(numero)) {
                return conta;
            }
        }

        return null;
    }

    public List<ContaBancaria> listarContas() {
        return contas;
    }
}