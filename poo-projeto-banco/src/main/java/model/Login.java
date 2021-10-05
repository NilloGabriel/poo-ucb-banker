package model;

import java.util.Scanner;

public class Login {
    private static String usuario;
    private String password;
    private boolean logStatus;
    private String scannerUsuario;
    private String scannerSenha;

    public Login(String usuario, String password, boolean logStatus) {
        this.usuario = usuario;
        this.password = password;
        this.logStatus = logStatus;
    }

    public Login() {

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

    public void inputData() {
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
    }

    public void loginUsuario() {
        inputData();

        do {
            if(!logStatusUsuario(scannerUsuario, scannerSenha)) {
                System.out.println("\t\n Usuário ou senha incorretos !!! \n");
                inputData();
            } else {
                System.out.println("\t\nUsuário " + "\"" + getUsuario() + "\"" + " logado\n");
                break;
            }
        } while(true);
    }

    public boolean logStatusUsuario(String usuario, String password) {
        if(usuario.equals(this.getUsuario()) && password.equals(this.getPassword())) {
            setLogStatus(true);
            return true;
        }
        return false;
    }
}
