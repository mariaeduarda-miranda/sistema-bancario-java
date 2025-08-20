public abstract class ContaBancaria {
    protected String numero;
    protected String titular;
    protected double saldo;
}

public ContaBancaria(String numero, String titular) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = 0.0;
}

public String getNumero() {
    return numero;
}

public void setNumero(String numero) {
    this.numero = numero;
}

public String getTitular() {
    return titular;
}

public void setaTitular(String titular) {
    this.titular = titular;
}

public double consultarSaldo() {
    return saldo;
}
public void depositar(double valor) {
    if (valor > 0) {
        saldo += valor;
    }
}

@Override 
    public String toString() {
        return "Conta: " + numero + " | Titular: " + titular + " | Saldo: R$ " + saldo;
    }
