package model;

import java.util.Scanner;

public class Poupanca extends Conta{
    public Poupanca(double ganhoMensal, int numeroAgencia) {
        super(ganhoMensal, numeroAgencia);
        setSaldo(30.80);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}