package model;

import java.util.Scanner;

public class Login {
    private static String usuario;
    private String password;
    private boolean logStatus;

    private Scanner scanner;
    private String scannerUsuario;
    private String scannerSenha;

    public Login(String usuario, String password, boolean logStatus) {
        this.usuario = usuario;
        this.password = password;
        this.logStatus = logStatus;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLogStatus() {
        return logStatus;
    }

    public void setLogStatus(boolean logStatus) {
        this.logStatus = logStatus;
    }

    public static void inputData() {
        scanner = new Scanner(System.in);

        System.out.println("Usuário:");
        scannerUsuario = scanner.nextLine();

        System.out.println("Senha:");
        scannerSenha = scanner.nextLine();
    }

    public static void loginUsuario(Login login) {
        inputData();

        do {
            if(!logStatusUsuario(login, scannerUsuario, scannerSenha)) {
                System.out.println("\n Usuário ou senha incorretos !!! \n");
                inputData();
            } else {
                System.out.println("Usuário " + "\"" + login.getUsuario() + "\"" + " logado");
                break;
            }
        } while(true);
    }

    public static boolean logStatusUsuario(Login login, String usuario, String password) {
        if(usuario.equals(login.getUsuario()) && password.equals(login.getPassword())) {
            login.setLogStatus(true);
            return true;
        }
        return false;
    }
}
