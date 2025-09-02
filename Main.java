import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();
        int opcao;

        do {
            System.out.println("\n---- MENU ----");
            System.out.println("1. Criar Conta (Corrente ou Poupança)");
            System.out.println("2. Depositar em uma conta");
            System.out.println("3. Sacar de uma conta");
            System.out.println("4. Listar todas as contas");
            System.out.println("5. Consultar saldo");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1: // Criar conta
                    System.out.print("Digite o número da conta: ");
                    String numero = sc.nextLine();

                    System.out.print("Digite o nome do titular: ");
                    String titular = sc.nextLine();

                    System.out.print("Tipo de conta (1 - Corrente, 2 - Poupança): ");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    if (tipo == 1) {
                        System.out.print("Digite o limite da conta: ");
                        double limite = sc.nextDouble();
                        sc.nextLine();
                        ContaCorrente cc = new ContaCorrente(numero, titular, limite);
                        banco.adicionarConta(cc);
                        System.out.println("Conta Corrente criada com sucesso!");
                    } else {
                        ContaPoupanca cp = new ContaPoupanca(numero, titular);
                        banco.adicionarConta(cp);
                        System.out.println("Conta Poupança criada com sucesso!");
                    }
                    break;

                case 2: // Depositar
                    System.out.print("Digite o número da conta: ");
                    numero = sc.nextLine();
                    ContaBancaria contaDep = banco.buscarConta(numero);
                    if (contaDep != null) {
                        System.out.print("Digite o valor do depósito: ");
                        double valor = sc.nextDouble();
                        contaDep.depositar(valor);
                        System.out.println("Depósito realizado!");
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                    break;

                case 3: // Sacar
                    System.out.print("Digite o número da conta: ");
                    numero = sc.nextLine();
                    ContaBancaria contaSac = banco.buscarConta(numero);
                    if (contaSac != null) {
                        System.out.print("Digite o valor do saque: ");
                        double valor = sc.nextDouble();
                        if (contaSac.sacar(valor)) {
                            System.out.println("Saque realizado!");
                        } else {
                            System.out.println("Saldo insuficiente!");
                        }
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                    break;

                case 4: // Listar contas
                    System.out.println("\n--- Lista de Contas ---");
                    for (ContaBancaria c : banco.listarContas()) {
                        System.out.println(c);
                        System.out.println("-------------------");
                    }
                    break;

                case 5: // Consultar saldo
                    System.out.print("Digite o número da conta: ");
                    numero = sc.nextLine();
                    ContaBancaria contaSaldo = banco.buscarConta(numero);
                    if (contaSaldo != null) {
                        System.out.println("Saldo: R$ " + contaSaldo.consultarSaldo());
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                    break;

                case 6: // Sair
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 6);

        sc.close();
    }
}
