package model;

import listClasses.Transacoes;

import java.util.Date;

public class Corrente extends Conta{

    public Corrente(double ganhoMensal, int numeroAgencia, Endereco enderecoAgencia, boolean situacao, Double saldo, int numeroBanco, Transacoes transacoes) {
        super(ganhoMensal, numeroAgencia, enderecoAgencia, situacao, saldo, numeroBanco, transacoes);
    }
}
