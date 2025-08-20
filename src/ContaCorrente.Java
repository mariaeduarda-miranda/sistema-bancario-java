public class ContaCorrente extends ContaBancaria {
    double limite;   
}

public ContaCorrente(String numero, String titular, double limite) {
    super(numero, titular);
    this.limite = limite;
}

@Override 
    public boolean sacar(double valor) {
        if (valor > 0 && (saldo + limite) >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

@Override 
    public String toString() {
        return "Conta Corrente\n" +
                "Número: " + numero +
                "\nTitular: " + titular + 
                "\nSaldo: R$ " + saldo +
                "\nLimite: R$ " + limite;
    }