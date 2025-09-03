public class ContaCorrente extends ContaBancaria {
    private double limite;

public ContaCorrente(String numero, String titular, double limite) {
    super(numero, titular);
    setLimite(limite);
}

public double getLimite() {
    return limite;
}

public void setLimite(double limite) {
    if (limite >= 0) {
        this.limite = limite;
    } else {
        throw new IllegalArgumentException("O limite não pode ser negativo.");
    }
}


@Override
public boolean sacar(double valor) {
    if (valor <= 0) {
        System.out.println("Saque negado: valor deve ser maior que zero.");
        return false;
    }

    double saldoDisponivel = saldo + limite;

    if (valor <= saldoDisponivel) {
        saldo -= valor;
        System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
        return true;
    } else { 
        System.out.printf("Saque negado: valor R$ %.2f excede o limite disponível de R$ %.2f.%n, valor, saldoDisponível");
        return false;
    }
}

@Override
public String toString() {
    return String.format("ContaCorrente{numero='%s', titular='%s', saldo=R$ %.2f, limite=R$ %.2f, disponível=R$ %.2f}", 
    getNumero(), consultarSaldo(), limite, consultarSaldo() + limite);
}
}
