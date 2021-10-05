package model;

import listClasses.Transacoes;
import org.w3c.dom.ls.LSOutput;

import java.util.Date;
import java.util.Scanner;

public class Corrente extends Conta{

    public Corrente(double ganhoMensal, int numeroAgencia, Endereco enderecoAgencia, boolean situacao, Double saldo, int numeroBanco, Transacoes transacoes) {
        super(ganhoMensal, numeroAgencia, enderecoAgencia, situacao, saldo, numeroBanco, transacoes);
    }

    public void sacarContaCorrente() {
        int numConta;
        Double valor = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\nInforme o número da conta para saque: ");
        numConta = scanner.nextInt();

        if(numConta == super.getNumeroConta()) {
            System.out.println("\t\nInforme o valor a ser sacado: ");
            valor = scanner.nextDouble();

            sacar(valor);
            return;
        }

        System.out.println("\t\nConta não existe.\n");
    }

    public void depositarContaCorrente() {
        int numConta;
        Double valor = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\nInforme o número da conta para deposito: ");
        numConta = scanner.nextInt();

        if(numConta == super.getNumeroConta()) {
            System.out.println("\t\nInforme o valor a ser depositado: ");
            valor = scanner.nextDouble();

            depositar(valor);
            return;
        }

        System.out.println("\t\nConta não existe.\n");
    }
}
