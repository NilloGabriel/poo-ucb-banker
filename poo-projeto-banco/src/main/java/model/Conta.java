package model;

import java.time.LocalDate;

public abstract class Conta extends Agencia{
    private String numeroConta;
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

    public String getNumeroConta() {
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
            System.out.println("\tSaque de R$" + valor + " efetuado com sucesso!" + "\n\tSaldo atual: R$" + getSaldo() + '\n');
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
        System.out.println("\t\nDeposito de R$" + valor + " efetuado com sucesso!" + "\t\nSaldo atual: R$" + getSaldo() + '\n');
    }

    public void transferir(Double valor, Conta destino) {
        if(valor <= 0) {
            System.out.println("\t\nNão pode ser efetuadas transferências com valor igual ou inferior a 0.\n");
            return;
        }

        if(valor <= getSaldo()) {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("\t\nTransferência realizada com sucesso!" + "\t\nSaldo atual: R$:" + getSaldo() + '\n');
        } else {
            System.out.println("\t\nSaldo insuficiente.");
        }
    }

    private int randomNumber(int n) {
        int randNum = (int) (Math.random() * n);

        return randNum;
    }

    public String gerarNumerodaConta(){
        int n = 9;

        int num[] = new int[9];

        for (int i = 0; i < 9; i++) {
            num[i] = randomNumber(n);
        }

        return this.numeroConta = "" + num[0] + num[1] + num[2] + num[3] + num[4] + num[5] + num[6] + num[7] + '-' + num[8];
    }

    //public void fazerCompra() {}

    //public boolean fecharConta() {return true;}


    @Override
    public String toString() {
        return  "NumeroBanco = " + this.numeroBanco + '\n' +
                "Numero da Conta = " + this.numeroConta + '\n' +
                "Data de Criacao = " + this.dataCriacao + '\n' +
                "Saldo = " + saldo + '\n' +
                "Ganho Mensal = " + ganhoMensal + '\n' ;
    }
}
