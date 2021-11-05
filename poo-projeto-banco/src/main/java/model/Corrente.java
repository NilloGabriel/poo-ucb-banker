package model;

import java.util.Scanner;

public class Corrente extends Conta{
    public Corrente(double ganhoMensal, int numeroAgencia) {
        super(ganhoMensal, numeroAgencia);
        setSaldo(25.3);
    }

    @Override
    public String toString() {

        return super.toString();
    }

    public void sacarContaCorrente() {
        String numConta;
        Double valor = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\nInforme o número da conta para saque: ");
        numConta = scanner.nextLine();

        if(numConta.equals(super.getNumeroConta())) {
            System.out.println("\t\nInforme o valor a ser sacado: ");
            valor = scanner.nextDouble();

            sacar(valor);
            return;
        }

        System.out.println("\t\nConta não existe.\n");
    }

    public void depositarContaCorrente() {
        String numConta;
        Double valor = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\nInforme o número da conta para deposito: ");
        numConta = scanner.nextLine();

        if(numConta.equals(super.getNumeroConta())) {
            System.out.println("\t\nInforme o valor a ser depositado: ");
            valor = scanner.nextDouble();

            depositar(valor);
            return;
        }

        System.out.println("\t\nConta não existe.\n");
    }

    public void transferirContaCorrente(Conta dest) {
        String numConta;
        Double valor = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\nDigite o numero da conta que deseja fazer transferencia:");
        numConta = scanner.nextLine();

        if(numConta.equals(super.getNumeroConta())) {
            System.out.println("\t\nInforme o valor a ser transferido: ");
            valor = scanner.nextDouble();
            transferir(valor, dest);
            return;
        }

        System.out.println("\t\nConta não existe.\n");
    }
}