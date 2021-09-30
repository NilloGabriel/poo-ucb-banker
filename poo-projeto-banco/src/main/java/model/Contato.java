package model;

public class Contato {
    private int operadora;
    private int ddd;
    private String numero;
    
    public Contato(int operadora, int ddd, String numero) {
        this.operadora = operadora;
        this.ddd = ddd;
        this.numero = numero;
    }

    public int getOperadora() {
        return operadora;
    }

    public void setOperadora(int operadora) {
        this.operadora = operadora;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
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
                "Numero: " + this.ddd + this.numero;
    }
}




