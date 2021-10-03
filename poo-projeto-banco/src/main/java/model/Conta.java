package model;

import listClasses.Transacoes;

import java.util.Date;

public abstract class Conta {
    private int numeroConta;
    private boolean situacao;
    private Agencia agencia;
    private Date dataCriacao;
    private Double saldo;
    private int numeroBanco;
    private Cartao cartao;
    private Transacoes transacoes;
    private boolean status;

    public Conta(int numeroConta, boolean situacao, Agencia agencia, Date dataCriacao, Double saldo, int numeroBanco, Cartao cartao, Transacoes transacoes, boolean status) {
        this.numeroConta = numeroConta;
        this.situacao = situacao;
        this.agencia = agencia;
        this.dataCriacao = dataCriacao;
        this.saldo = saldo;
        this.numeroBanco = numeroBanco;
        this.cartao = cartao;
        this.transacoes = transacoes;
        this.status = status;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroBanco() {
        return numeroBanco;
    }

    public void setNumeroBanco(int numeroBanco) {
        this.numeroBanco = numeroBanco;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    public Transacoes getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(Transacoes transacoes) {
        this.transacoes = transacoes;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean pagarMensalidade() {
        return true;
    }

    public String sacar(Double valor) {
        return "";
    }

    public String depositar(Double valor) {
        return "";
    }

    public String transferir(int conta, Double valor) {
        return "";
    }

    public void fazerCompra() {

    }

    public boolean fecharConta() {
        return true;
    }
}
