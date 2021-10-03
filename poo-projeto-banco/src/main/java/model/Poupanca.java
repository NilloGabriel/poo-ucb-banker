package model;

import listClasses.Transacoes;

import java.util.Date;

public class Poupanca extends Conta{
    public Poupanca(int numeroConta, boolean situacao, Agencia agencia, Date dataCriacao, Double saldo, int numeroBanco, Cartao cartao, Transacoes transacoes, boolean status) {
        super(numeroConta, situacao, agencia, dataCriacao, saldo, numeroBanco, cartao, transacoes, status);
    }
}
