package model;

public class Contato {
    private int operadora;
    private String numero;
    public Contato(int operadora, String numero) {
        this.operadora = operadora;
        this.numero = numero;
    }

    public int getOperadora() {
        return operadora;
    }

    public void setOperadora(int operadora) {
        this.operadora = operadora;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String retornarOperadora(){
        switch(this.operadora){
            case 1: return " 1. Vivo";
            case 2: return "2. Claro";
            case 3: return "3. Oi";
            case 4: return "4. Tim";
            case 5: return "5. Nextel";
        }
        return "Erro";
    }

    @Override
    public String toString() {
        return "Operadora: " + this.retornarOperadora() +
                "Numero: " + this.numero + '\n';
    }
}




