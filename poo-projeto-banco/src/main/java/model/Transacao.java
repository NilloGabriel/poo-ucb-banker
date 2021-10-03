package model;

public class Transacao {
    private int id;
    private int tipo;
    private String descricao;
    private float valor;
//    private Conta contaTransferencia

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

//    public void realizarTransacao(Conta conta, float valor, String descricao)
}
