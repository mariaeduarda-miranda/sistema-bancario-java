public abstract class ContaBancaria implements OperacoesBancarias {
    protected String numero;
    protected String titular;
    protected double saldo;   

public ContaBancaria(String numero, String titular) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = 0.0;
}

public String getNumero() {
    return numero;
}

@Override
public double consultarSaldo() {
    return saldo;
}

@Override
public void depositar(double valor) {
    if (valor > 0) {
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    } else {
        System.out.println("Valor de depósito inválido.");
    }
    }

@Override
public abstract boolean sacar(double valor);

@Override
public String toString() {
    return "Conta{" +
            "número='" + numero + '\''  +
            ", titular='" + titular + '\'' +
            ", saldo=R$" + String.format("%.2f", saldo) +
            '}';
}
}

