public class ContaPoupanca extends ContaBancaria {
    
public ContaPoupanca(String numero, String titular) {
    super(numero, titular);
}

@Override
public boolean sacar(double valor) {
    if (valor <= saldo) {
        saldo -= valor;
        System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        return true;
    } else {
        System.err.println("Saldo insuficiente!");
        return false;
    }

    }

@Override
public String toString() {
    return "ContaPoupança{" + 
    "numero='" + getNumero() + '\'' +
    ", saldo=" + consultarSaldo() +
    '}';
    }


    
}
