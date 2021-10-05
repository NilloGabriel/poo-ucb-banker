package model;

public class Adm extends Login{
    public Adm(String usuario, String password, boolean logStatus) {
        super(usuario, password, logStatus);
        setUsuario("Admin");
        setPassword("12345");
    }
}
