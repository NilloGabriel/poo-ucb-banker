package model;

import listClasses.Transacoes;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public abstract class Conta extends Agencia{
    private int numeroConta;
    private boolean situacao;
    private LocalDate dataCriacao;
    private Double saldo;
    private int numeroBanco;
    private Cartao cartao;
    private Transacoes transacoes;
    private double ganhoMensal;
    private boolean status;

    public Conta(double ganhoMensal, int numeroAgencia, Endereco enderecoAgencia, boolean situacao, Double saldo, int numeroBanco, Transacoes transacoes) {
        super(numeroAgencia, enderecoAgencia);
        gerarNumerodaConta();
        this.situacao = situacao;
        setDataCriacao();
        this.saldo = saldo;
        this.numeroBanco = numeroBanco;
        this.transacoes = transacoes;
        this.status = true;
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

    public void setNumeroConta() {
        this.numeroConta = gerarNumerodaConta();
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao() {
        LocalDate hoje = LocalDate.now();
        this.dataCriacao = hoje;
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

    //public boolean pagarMensalidade() { return true; }

    public void sacar(Double valor) {
        if(valor <= 0) {
            System.out.println("\t\nNão pode ser efetuados saques com valor igual ou inferior a 0.\n");
            return;
        }

        if(valor <= this.saldo) {
            this.saldo = this.saldo - valor;
            System.out.println("\tSaque de R$" + valor + " efetuado com sucesso!" + "\nSaldo atual: R$" + getSaldo() + '\n');
        } else {
            System.out.println("\t\nSaldo insuficiente");
        }
    }

    public void depositar(Double valor) {
        if(valor <= 0) {
            System.out.println("\t\nNão pode ser efetuados depósitos com valor igual ou inferior a 0.\n");
            return;
        }

        this.saldo = this.saldo + valor;
        System.out.println("\t\nDeposito de R$" + valor + " efetuado com sucesso!" + "\tSaldo atual: R$" + getSaldo() + '\n');
    }

    public void transferir(Double valor) {
        if(valor <= 0) {
            System.out.println("\t\nNão pode ser efetuadas transferências com valor igual ou inferior a 0.\n");
            return;
        }

        if(valor <= getSaldo()) {
            this.saldo = this.saldo - valor;
            System.out.println("\t\nTransferência realizada com sucesso!" + "\nSaldo atual: R$:" + getSaldo() + '\n');
        } else {
            System.out.println("\t\nSaldo insuficiente.");
        }
    }

    private int gerarNumerodaConta(){
        Random random = new Random();
        return random.nextInt(99999999);
    }

    //public void fazerCompra() {}

    //public boolean fecharConta() {return true;}
}
