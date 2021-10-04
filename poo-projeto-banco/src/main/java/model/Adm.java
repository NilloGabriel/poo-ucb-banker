package model;

public class Adm extends Login{
    public Adm(String usuario, String password) {
        super(usuario, password);
        setUsuario("Admin");
        setPassword("12345");
    }
}
