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

        Login login = new Login(userLogin, userPassword, logStatus);

        do {
            if(!login.isLogStatus()) {
                login.loginUsuario();
            } else if (login.isLogStatus()) {
                try {
                    do {
                        System.out.println("MENU");
                        System.out.println("1. Test");
                        System.out.println("2. Test");
                        System.out.println("3. Logout");
                        scanner = new Scanner(System.in);
                        op = scanner.nextInt();

                        switch(op) {
                            case 1:
                                scanner = new Scanner(System.in);
                                System.out.println("Testei");
                                break;
                            case 2:
                                scanner = new Scanner(System.in);
                                System.out.println("Testei 2");
                                break;
                            case 3:
                                login.setLogStatus(false);
                                System.out.println("Usuário deslogou !!!");
                                System.exit(0);
                                break;
                        }
                    } while (login.isLogStatus());
                } catch (InputMismatchException e) {
                    System.out.println("\n Operação Inválida !!! \n");
                }
            }
        } while (true);
    }
}
