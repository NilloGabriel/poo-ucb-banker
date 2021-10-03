package model;

import java.util.Date;

public class Cartao {
    private boolean debito;
    private boolean credito;
    private double limiteTotal;
    private String numero;
    private String titular;
    private Date validade;
    private int cvc;
    private double limiteAtual;
    private int senha;

    public Cartao(boolean debito, boolean credito, double limiteTotal, String numero, String titular, Date validade, int cvc, double limiteAtual, int senha) {
        this.debito = debito;
        this.credito = credito;
        this.limiteTotal = limiteTotal;
        this.numero = numero;
        this.titular = titular;
        this.validade = validade;
        this.cvc = cvc;
        this.limiteAtual = limiteAtual;
        this.senha = senha;
    }

    public boolean isDebito() {
        return debito;
    }

    public void setDebito(boolean debito) {
        this.debito = debito;
    }

    public boolean isCredito() {
        return credito;
    }

    public void setCredito(boolean credito) {
        this.credito = credito;
    }

    public double getLimiteTotal() {
        return limiteTotal;
    }

    public void setLimiteTotal(double limiteTotal) {
        this.limiteTotal = limiteTotal;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }

    public double getLimiteAtual() {
        return limiteAtual;
    }

    public void setLimiteAtual(double limiteAtual) {
        this.limiteAtual = limiteAtual;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void utilizarCreditoOuDebito() {

    }

    public void renovarCartao() {

    }

    @Override
    public String toString() {
        return    "Tipo: " + '\n'
                + "Limite Total: " + this.limiteTotal + '\n'
                + "Limite Atual: " + this.limiteAtual + '\n'
                + "Número: " + this.numero + '\n'
                + "Titular: " + this.titular + '\n'
                + "Data de Validade: " + this.validade + '\n'
                + "Número de Segurança: " + this.cvc + '\n';
    }
}
