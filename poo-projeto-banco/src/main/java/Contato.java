public class Contato {
    private int operadora;
    private int ddd;
    private String numero;

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
            case 1: return "Vivo";
            case 2: return "Claro";
            case 3: return "Oi";
            case 4: return "Tim";
            case 5: return "Nextel";
        }
        return "Erro";
    }

    @Override
    public String toString() {
        return "Operadora: " + this.retornarOperadora() +
                "Numero: " + this.ddd + this.numero;
    }
}




