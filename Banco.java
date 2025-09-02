import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<ContaBancaria> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

public void adicionarConta(ContaBancaria conta) {
    if (conta != null) {
        if (buscarConta(conta.getNumero()) == null) {
            contas.add(conta);
            System.out.println("Conta adicionada com sucesso!");
        } else {
            System.out.println("Erro: Já existe uma conta com o número " + conta.getNumero());
        }
    } else {
        System.out.println("Erro: Conta não pode ser nula.");
    }

}

public ContaBancaria buscarConta(String numero) {
    if (numero != null && !numero.trim().isEmpty()) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumero().equals(numero)) {
            }
        }
    }
    return null;
}

public List<ContaBancaria> listarContas() {
    return new ArrayList<>(contas);
}

public void exibirTodasContas() {
    if (contas.isEmpty()) {
        System.out.println("Nenhuma conta cadastrada no banco.");
    } else {
        System.out.println("\n--- CONTAS CADASTRADAS ---");
        for (int i = 0; i < contas.size(); i++) {
            System.out.println((i + 1) + ". " + contas.get(i).toString());
            System.out.println();
        }
    }    
}

public int getTotalContas() {
    return contas.size();
}

public boolean contaExiste(String numero) {
    return buscarConta(numero) != null;
}
}

