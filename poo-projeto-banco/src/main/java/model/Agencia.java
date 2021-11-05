package model;

public class Agencia {
    private int numeroAgencia;
    private Endereco enderecoAgencia;

    public Agencia(int numeroAgencia, Endereco enderecoAgencia) {
        this.numeroAgencia = numeroAgencia;
        this.enderecoAgencia = enderecoAgencia;
    }

    public Agencia(int numeroAgencia) {
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public Endereco getEnderecoAgencia() {
        return enderecoAgencia;
    }

    public void setEnderecoAgencia(Endereco enderecoAgencia) {
        this.enderecoAgencia = enderecoAgencia;
    }
}