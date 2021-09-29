package model;

public class Endereco {
    private String cep;
    private String estado;
    private String cidade;
    private String endereco;

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
        return    "CEP: "     + this.getCep() + '\n'
                + "Estado: "  + this.getEstado() + '\n'
                + "Cidade: "  + this.getCidade() + '\n'
                + "Endereço " + this.getEndereco();
    }
}
