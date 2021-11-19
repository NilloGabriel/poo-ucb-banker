package model;

import java.util.Scanner;

public class Corrente extends Conta{
    public Corrente(double ganhoMensal, int numeroAgencia) {
        super(ganhoMensal, numeroAgencia);
        setSaldo(25.3);
    }

    @Override
    public String toString() {

        return super.toString();
    }
}