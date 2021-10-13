package menu;

public class Menus {
    public static void welcome() {
        System.out.println();
        System.out.printf("\t ___________________________________________\n");
        System.out.printf("\t|  _______________________________________  |\n");
        System.out.printf("\t| |                                       | |\n");
        System.out.printf("\t| |                                       | |\n");
        System.out.printf("\t| |                                       | |\n");
        System.out.printf("\t| |                  POO                  | |\n");
        System.out.printf("\t| |                                       | |\n");
        System.out.printf("\t| |                 BANKER                | |\n");
        System.out.printf("\t| |                                       | |\n");
        System.out.printf("\t| |            GABRIEL D'NILLO            | |\n");
        System.out.printf("\t| |            MATEUS  COLARES            | |\n");
        System.out.printf("\t| |                                       | |\n");
        System.out.printf("\t| |                                       | |\n");
        System.out.printf("\t| |_______________________________________| |\n");
        System.out.printf("\t|___________________________________________|\n");
        System.out.println();
    }


    public static void menuLogin(){
        System.out.printf("\t __________________________________________\n");
        System.out.printf("\t|                  LOGIN                   |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        System.out.printf("\t|     1      |             LOGIN           |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        System.out.printf("\t|     2      |           CADASTRAR         |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        System.out.printf("\t|     3      |              ADM            |\n");
        System.out.printf("\t|____________|_____________________________|\n");

    }

    public static void menuCadastrarConta(){
        System.out.printf("\t __________________________________________\n");
        System.out.printf("\t|   OPÇÃO    |           FUNÇÕES           |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        System.out.printf("\t|     1      |         ABRIR CONTA         |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        System.out.printf("\t|     2      |           LOGOUT            |\n");
        System.out.printf("\t|------------|-----------------------------|\n");

    }

    public static void menuMainMenu(){
        System.out.println("\tESCOLHA A FUNCAO QUE DESEJA ENTRAR:");
        System.out.printf("\t __________________________________________\n");
        System.out.printf("\t|   OPÇÃO    |           FUNÇÕES           |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        System.out.printf("\t|     1      |     INFORMAÇÕES DA CONTA    |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        System.out.printf("\t|     2      |    INFORMAÇÕES DO CARTÃO    |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        System.out.printf("\t|     3      |          DEPOSITAR          |\n");
        System.out.printf("\t|____________|_____________________________|\n");
        System.out.printf("\t|     4      |            SACAR            |\n");
        System.out.printf("\t|____________|_____________________________|\n");
        System.out.printf("\t|     5      |          TRANSFERIR         |\n");
        System.out.printf("\t|____________|_____________________________|\n");
        System.out.printf("\t|     6      |            SALDO            |\n");
        System.out.printf("\t|____________|_____________________________|\n");
        System.out.printf("\t|     0      |            LOGOUT           |\n");
        System.out.printf("\t|____________|_____________________________|\n");

    }

    public static void menuTipos(){
        System.out.printf("\t __________________________________________\n");
        System.out.printf("\t|   OPÇÃO    |            CONTAS           |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        System.out.printf("\t|     1      |        CONTA CORRENTE       |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        System.out.printf("\t|     2      |        CONTA POUPANÇA       |\n");
        System.out.printf("\t|------------|-----------------------------|\n");

    }
}

