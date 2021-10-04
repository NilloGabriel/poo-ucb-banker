package model;

public class Endereco {
    private String cep;
    private String estado;
    private String cidade;
    private String endereco;

    public Endereco(String cep, String estado, String cidade, String endereco) {
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return    "\t\nCEP: "     + this.getCep() + '\n'
                + "\tEstado: "  + this.getEstado() + '\n'
                + "\tCidade: "  + this.getCidade() + '\n'
                + "\tEndereço: " + this.getEndereco() + '\n';
    }
}
