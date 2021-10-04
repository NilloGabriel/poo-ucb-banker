package model;

import listClasses.Contatos;
import listClasses.Enderecos;

import java.time.LocalDate;

public class Cliente {
    private String nome;
    private LocalDate dataNascimento;
    private boolean comprovanteResidencia;
    private String cpf;
    private String rg;
    private Double rendaMensal;
    private Contatos contatos;
    private Enderecos enderecos;
    private Login login;
    private Poupanca poupanca;
    private Corrente corrente;
    private String email;

    public Cliente(String nome, LocalDate dataNascimento, boolean comprovanteResidencia, String cpf, String rg, Double rendaMensal, Contatos contatos, Enderecos enderecos, Login login, Poupanca poupanca, Corrente corrente, String email) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.comprovanteResidencia = comprovanteResidencia;
        this.cpf = cpf;
        this.rg = rg;
        this.rendaMensal = rendaMensal;
        this.contatos = contatos;
        this.enderecos = enderecos;
        this.login = login;
        this.poupanca = poupanca;
        this.corrente = corrente;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean isComprovanteResidencia() {
        return comprovanteResidencia;
    }

    public void setComprovanteResidencia(boolean comprovanteResidencia) {
        this.comprovanteResidencia = comprovanteResidencia;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(Double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public Contatos getContatos() {
        return contatos;
    }

    public void setContatos(Contatos contatos) {
        this.contatos = contatos;
    }

    public Enderecos getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Enderecos enderecos) {
        this.enderecos = enderecos;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Poupanca getPoupanca() {
        return poupanca;
    }

    public void setPoupanca(Poupanca poupanca) {
        this.poupanca = poupanca;
    }

    public Corrente getCorrente() {
        return corrente;
    }

    public void setCorrente(Corrente corrente) {
        this.corrente = corrente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean abrirConta() {
        return true;
    }
}
