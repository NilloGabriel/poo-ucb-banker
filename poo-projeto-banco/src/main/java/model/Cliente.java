package model;

import listClasses.Clientes;
import listClasses.Contatos;
import listClasses.Enderecos;

import java.time.LocalDate;
import java.util.Scanner;

public class Cliente extends Login{
    private String nome;
    private LocalDate dataNascimento;
    private boolean comprovanteResidencia;
    private String cpf;
    private String rg;
    private Contatos contatos;
    private Enderecos enderecos;
    private Poupanca poupanca;
    private Corrente corrente;
    private String email;

    public Cliente(String usuario, String senha) {
        super(usuario, senha);
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

    @Override
    public String toString() {
        return "Nome: " + this.nome + '\n' +
                "Cpf: " + this.cpf + '\n' +
                "Rg: " + this.rg + '\n' +
                "Contatos: " + this.contatos + '\n' +
                "Endereços: " + this.enderecos + '\n' +
                "Email: " + this.email;
    }
}
