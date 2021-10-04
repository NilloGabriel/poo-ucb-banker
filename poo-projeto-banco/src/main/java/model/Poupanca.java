package model;

import listClasses.Transacoes;

import java.util.Date;

public class Poupanca extends Conta{
    public Poupanca(double ganhoMensal,int numeroAgencia, Endereco enderecoAgencia, int numeroConta, boolean situacao, Agencia agencia, Date dataCriacao, Double saldo, int numeroBanco, Cartao cartao, Transacoes transacoes, boolean status) {
        super(ganhoMensal,numeroAgencia, enderecoAgencia, numeroConta, situacao, dataCriacao, saldo, numeroBanco, cartao, transacoes, status);
    }
}
