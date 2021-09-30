package model;

import java.util.Scanner;

public class Login {
    private static String usuario;
    private String password;
    private boolean logStatus;

    public Login() {
        this.logStatus = false;
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

    public void loginUsuario() {
        Scanner scanner = new Scanner(System.in);
        String scannerUsuario;
        String scannerSenha;
        do{
            System.out.println("Usuário:");
            scannerUsuario = scanner.nextLine();
            System.out.println("Senha:");
            scannerSenha = scanner.nextLine();
            if(!logStatusUsuario(scannerUsuario, scannerSenha)) {
                System.out.println("\n Usuário ou senha incorretos !!! \n");
            } else {
                System.out.println("Usuário " + "\"" + getUsuario() + "\"" + " logado");
                break;
            }
        } while(true);
    }

    public boolean logStatusUsuario(String user, String password) {
        if(user.equals(this.getUsuario()) && password.equals(this.getPassword())) {
            setLogStatus(true);
            return true;
        }
        return false;
    }
}
