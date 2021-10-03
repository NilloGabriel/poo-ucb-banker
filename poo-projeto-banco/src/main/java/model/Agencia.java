package model;

public class Agencia {
    private int numeroAgencia;
    private String enderecoAgencia;

    public Agencia(int numeroAgencia, String enderecoAgencia) {
        this.numeroAgencia = numeroAgencia;
        this.enderecoAgencia = enderecoAgencia;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getEnderecoAgencia() {
        return enderecoAgencia;
    }

    public void setEnderecoAgencia(String enderecoAgencia) {
        this.enderecoAgencia = enderecoAgencia;
    }
}
