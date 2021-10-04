package model;

import listClasses.Transacoes;

import java.util.Date;

public abstract class Conta extends Agencia{
    private int numeroConta;
    private boolean situacao;
    private Date dataCriacao;
    private Double saldo;
    private int numeroBanco;
    private Cartao cartao;
    private Transacoes transacoes;
    private double ganhoMensal;
    private boolean status;

    public Conta(double ganhoMensal, int numeroAgencia, Endereco enderecoAgencia, int numeroConta, boolean situacao, Date dataCriacao, Double saldo, int numeroBanco, Cartao cartao, Transacoes transacoes, boolean status) {
        super(numeroAgencia, enderecoAgencia);
        this.numeroConta = numeroConta;
        this.situacao = situacao;
        this.dataCriacao = dataCriacao;
        this.saldo = saldo;
        this.numeroBanco = numeroBanco;
        this.cartao = cartao;
        this.transacoes = transacoes;
        this.status = status;
        this.ganhoMensal = ganhoMensal;
    }

    public double getGanhoMensal() {
        return ganhoMensal;
    }

    public void setGanhoMensal(float ganhoMensal) {
        this.ganhoMensal = ganhoMensal;
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
