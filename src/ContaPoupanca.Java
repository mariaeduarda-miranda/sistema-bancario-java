public class ContaPoupanca extends ContaBancaria {

public ContaPoupanca(String numero, String titular) {
    super(numero, titular);
}

@Override 
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo)
            saldo -= valor;
            return true;
       }
        return false;

    }

@Override 
    public String toString() {
        return "Conta Poupança\n" +
                "Número: " + numero +
                "\nTitular: " + titular + 
                "\nSaldo: R$ " + saldo;
    }