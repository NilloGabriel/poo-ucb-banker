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
            case 1: return "Vivo";
            case 2: return "Claro";
            case 3: return "Oi";
            case 4: return "Tim";
            case 5: return "Nextel";
        }
        return "Erro";
    }

    public static void menuOperadoras(){
        System.out.println("1 - Vivo");
        System.out.println("2 - Claro");
        System.out.println("3 - Oi");
        System.out.println("4 - Tim");
        System.out.println("5 - Nextel");
    }

    @Override
    public String toString() {
        return "Operadora: " + this.retornarOperadora() + '\n' +
                "Numero: " + this.numero + '\n';
    }
}




