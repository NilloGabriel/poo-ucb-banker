package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Contatos{
    private static final List<Contato>contatos = new ArrayList<>();

    public static List<Contato> getContatos() {
        return contatos;
    }

    public static boolean add(Contato a) {
        for(Contato c : contatos){
            if(c.getNumero().equals(a.getNumero())){
                System.out.println("Erro! Contato ja cadastrado");
                return false;
            }
        }
        contatos.add(a);
        System.out.println("Contato cadastrado com sucesso");
        return true;
    }

    public static boolean delete(String numero, int ddd) {
        for(Contato c : contatos){
            if(c.getNumero().equals(numero)){
                contatos.remove(c);
                System.out.println("Contato removido:");
                c.toString();
                return true;
            }
        }
        return false;
    }

    public static void read() {
        System.out.println("\n\n **Contatos cadastrados na sua conta** \n");
        contatos.stream().peek(System.out::println).collect(Collectors.toList());
    }

    public static boolean update(String numero) {
        Scanner scanner = new Scanner(System.in);
        int novosDados;
        for(Contato c : contatos){
            if(c.getNumero().equals(numero)){
                System.out.println("\nDigite a operadora certa:");
                c.menuOperadoras();
                novosDados = scanner.nextInt();
                c.setOperadora(novosDados);
            }
        }
        return false;
    }

}