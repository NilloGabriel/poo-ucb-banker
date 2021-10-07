package model;

import java.util.Scanner;

public class Login {
    private static String usuario;
    private String password;
    private boolean logStatus;

    public Login(String usuario, String password) {
        this.logStatus = true;
        setUsuario(usuario);
        setPassword(password);
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

    public Login loginUsuario() {
        Scanner scanner = new Scanner(System.in);
        Login login = new Login();
        String scannerUsuario;
        String scannerSenha;
        System.out.println("\tFAÇA O SEU LOGIN:");
        System.out.printf("\t ___________________________________________\n");
        System.out.printf("\t|                  USUARIO                  |\n");
        System.out.printf("\t ___________________________________________\n");
        scannerUsuario = scanner.nextLine();
        login.setUsuario(scannerUsuario);
        System.out.printf("\t ___________________________________________\n");
        System.out.printf("\t|                   SENHA                   |\n");
        System.out.printf("\t ___________________________________________\n");
        scannerSenha = scanner.nextLine();
        login.setPassword(scannerSenha);
        return login;
    }

    public boolean logStatusUsuario(String user, String password) {
        if(user.equals(this.getUsuario()) && password.equals(this.getPassword())) {
            setLogStatus(true);
            return true;
        }
        return false;
    }
}
