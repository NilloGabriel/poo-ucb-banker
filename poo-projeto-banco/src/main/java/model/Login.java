package model;

import view.LoginGUI;
import java.util.HashMap;

public class Login {
    HashMap<String,String> loginInfo = new HashMap<String,String>();

    public Login(String usuario, String password) {
        loginInfo.put(usuario, password);
    }

    public Login() {
    }

    public HashMap getLoginInfo() {
        return loginInfo;
    }

    public Login loginUsuario() {
        Login returno = new Login();
        LoginGUI loginPage = new LoginGUI(getLoginInfo());

        return returno;
    }
}
