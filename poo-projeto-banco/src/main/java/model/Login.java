package model;

import listClasses.Clientes;

import java.util.Scanner;

public class Login {
    public static Cliente c;
    private static String scannerUsuario;
    private static String scannerSenha;

    public static boolean loginUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\tFAÇA O SEU LOGIN:");
        System.out.printf("\t ___________________________________________\n");
        System.out.printf("\t|                  USUARIO                  |\n");
        System.out.printf("\t ___________________________________________\n");
        scannerUsuario = scanner.nextLine();
        System.out.printf("\t ___________________________________________\n");
        System.out.printf("\t|                   SENHA                   |\n");
        System.out.printf("\t ___________________________________________\n");
        scannerSenha = scanner.nextLine();

        if(!Clientes.clientes.isEmpty()) {
            for(Cliente cli : Clientes.clientes) {
                if(cli.getUsuario().equals(scannerUsuario) && cli.getSenha().equals(scannerSenha)) {
                    c = cli;
                    System.out.println("\t\nUsuário " + "\"" + cli.getUsuario() + "\"" + " logado\n");
                    return true;
                }
            }
            System.out.println("\t\n Usuário ou senha incorretos !!! \n");
            return false;
        } else {
            System.out.println("\t\nUsuário não existe!!!\n");
        }
        return false;
    }

//    public void loginUsuario() {
//        inputData();
//
//        do {
//            if(!logStatusUsuario(scannerUsuario, scannerSenha)) {
//                System.out.println("\t\n Usuário ou senha incorretos !!! \n");
//                inputData();
//            } else {
//                System.out.println("\t\nUsuário " + "\"" + getUsuario() + "\"" + " logado\n");
//                break;
//            }
//        } while(true);
//    }
//
//    public boolean logStatusUsuario(String usuario, String password) {
//        if(usuario.equals(this.getUsuario()) && password.equals(this.getPassword())) {
//            setLogStatus(true);
//            return true;
//        }
//        return false;
//    }
}
