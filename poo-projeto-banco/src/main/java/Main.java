import model.Login;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static String userLogin = "1234";
    private static String userPassword = "admin";
    private static boolean logStatus = false;
    private static int op;
    private static Scanner scanner;

    public static void main(String[] args) {
        Login login = new Login();
        login.setUsuario(userLogin);
        login.setPassword(userPassword);
        login.setLogStatus(logStatus);

        do {
            if(!login.isLogStatus()) {
                welcome();
                login.loginUsuario();
            } else if (login.isLogStatus()) {
                try {
                    do {
                        mainMenu();
                    } while (login.isLogStatus());
                } catch (InputMismatchException e) {
                    System.out.println("\n Operação Inválida !!! \n");
                }
            }
        } while (true);
    }

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

    public static void mainMenu() {
        Login login = new Login();

        System.out.println("\tESCOLHA A FUNCAO QUE DESEJA ENTRAR:");
        System.out.printf("\t __________________________________________\n");
        System.out.printf("\t|   OPÇÃO    |           FUNÇÕES           |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        System.out.printf("\t|     1      |            CONTA            |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        System.out.printf("\t|     2      |           CREDITAR          |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        System.out.printf("\t|     3      |           DEBITAR           |\n");
        System.out.printf("\t|____________|_____________________________|\n");
        System.out.printf("\t|     4      |          TRANSFERIR         |\n");
        System.out.printf("\t|____________|_____________________________|\n");
        System.out.printf("\t|     5      |            SALDO            |\n");
        System.out.printf("\t|____________|_____________________________|\n");
        System.out.printf("\t|     6      |            LOGOUT           |\n");
        System.out.printf("\t|____________|_____________________________|\n");
        scanner = new Scanner(System.in);
        op = scanner.nextInt();
        switch(op) {
            case 1:
                scanner = new Scanner(System.in);
                System.out.println(" //////////////////////////////////////////////////////////////////////\n");
                System.out.println();
                System.out.println("                                CONTA                                  \n");
                System.out.println();
                System.out.println(" //////////////////////////////////////////////////////////////////////\n");
                break;
            case 2:
                scanner = new Scanner(System.in);
                System.out.println(" //////////////////////////////////////////////////////////////////////\n");
                System.out.println();
                System.out.println("                                CREDITO                                \n");
                System.out.println();
                System.out.println(" //////////////////////////////////////////////////////////////////////\n");
                break;
            case 3:
                scanner = new Scanner(System.in);
                System.out.println(" //////////////////////////////////////////////////////////////////////\n");
                System.out.println();
                System.out.println("                                DEBITO                                 \n");
                System.out.println();
                System.out.println(" //////////////////////////////////////////////////////////////////////\n");
                break;
            case 4:
                scanner = new Scanner(System.in);
                System.out.println(" //////////////////////////////////////////////////////////////////////\n");
                System.out.println();
                System.out.println("                             TRANSFERENCIA                             \n");
                System.out.println();
                System.out.println(" //////////////////////////////////////////////////////////////////////\n");
                break;
            case 5:
                scanner = new Scanner(System.in);
                System.out.println(" //////////////////////////////////////////////////////////////////////\n");
                System.out.println();
                System.out.println("                                 SALDO                                 \n");
                System.out.println();
                System.out.println(" //////////////////////////////////////////////////////////////////////\n");
                break;
            case 6:
                login.setLogStatus(false);
                System.out.println("\tUsuário deslogou !!!\n");
                System.exit(0);
                break;
            default:
                System.out.println("\tOpcao Invalida!!!");
        }
    }
}
