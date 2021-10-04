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
        return "\t\nOperadora Invalida!!!";
    }

    public void menuOperadoras(){
        System.out.println("\tESCOLHA A OPERADORA:");
        System.out.printf("\t __________________________________________\n");
        System.out.printf("\t|   OPÇÃO    |          OPERADORA          |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        System.out.printf("\t|     1      |            VIVO             |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        System.out.printf("\t|     2      |            CLARO            |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        System.out.printf("\t|     3      |             OI              |\n");
        System.out.printf("\t|____________|_____________________________|\n");
        System.out.printf("\t|     4      |             TIM             |\n");
        System.out.printf("\t|____________|_____________________________|\n");
        System.out.printf("\t|     5      |            NEXTEL           |\n");
        System.out.printf("\t|____________|_____________________________|\n");
        System.out.println();
    }

    @Override
    public String toString() {
        return "\tOperadora: " + this.retornarOperadora() + '\n' +
                "\tNumero: " + this.numero + '\n';
    }
}




