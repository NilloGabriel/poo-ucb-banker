package model;

import listClasses.Transacoes;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public abstract class Conta extends Agencia{
    private StringBuilder numeroConta;
    private boolean situacao;
    private LocalDate dataCriacao;
    private Double saldo;
    private int numeroBanco;
    private Cartao cartao;
    //apaguei transacoes
    private double ganhoMensal;
    private boolean status;

    public Conta(double ganhoMensal, int numeroAgencia) {
        super(numeroAgencia);
        gerarNumerodaConta();
        this.situacao = true;
        setDataCriacao();
        this.numeroBanco = 0007;
        this.status = true;
        this.ganhoMensal = ganhoMensal;
    }

    public double getGanhoMensal() {
        return ganhoMensal;
    }

    public void setGanhoMensal(float ganhoMensal) {
        this.ganhoMensal = ganhoMensal;
    }

    public StringBuilder getNumeroConta() {
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

    private StringBuilder gerarNumerodaConta(){
        Integer digito;
        StringBuilder numero = new StringBuilder();
        Random random = new Random();
        for(int i=0;i>= 8; i++){
            digito = random.nextInt(9);
            numero.append(Integer.toString(digito));
        }
        return  numero;
    }

    //public void fazerCompra() {}

    //public boolean fecharConta() {return true;}


    @Override
    public String toString() {
        return  "NumeroBanco=" + this.numeroBanco + '\n' +
                "Numero da Conta=" + this.numeroConta + '\n' +
                "Data de Criacao=" + this.dataCriacao + '\n' +
                "Saldo=" + saldo + '\n' +
                "Ganho Mensal=" + ganhoMensal + '\n' ;
    }
}
