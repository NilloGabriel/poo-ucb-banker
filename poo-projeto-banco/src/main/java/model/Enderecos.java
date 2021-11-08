package model;

import model.Endereco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Enderecos{
    private static final List<Endereco>enderecos = new ArrayList<>();

    public static List<Endereco> getEndereco() {
        return enderecos;
    }

    public static boolean add(Endereco a) {
        for(Endereco e : enderecos){
            if(e.getCep().equals(a.getCep())){
                System.out.println("Erro! Endereço ja cadastrado");
                return false;
            }
        }
        enderecos.add(a);
        System.out.println("Endereço cadastrado com sucesso");
        return true;
    }

    public static boolean delete(String cep) {
        for(Endereco e : enderecos){
            if(e.getCep().equals(cep)){
                enderecos.remove(e);
                System.out.println("Endereço de cep: "+ cep + "removido com sucesso");
                return true;
            }
        }
        return false;
    }

    public static void read() {
        System.out.println("\n\n **Endereços cadastrados na sua conta** \n");
        enderecos.stream().peek(System.out::println).collect(Collectors.toList());
    }

    public static boolean update(String cep) {
        Scanner scannerString = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        String novosDados;
        int op;
        for(Endereco e : enderecos){
            if(e.getCep().equals(cep)){
                menuUpdate();
                op = scanner.nextInt();
                switch (op){
                    case 1:
                        System.out.println("Digite o Estado Correto:");
                        novosDados = scannerString.nextLine();
                        e.setEstado(novosDados);
                        return true;
                    case 2:
                        System.out.println("Digite a Cidade Correta:");
                        novosDados = scannerString.nextLine();
                        e.setCidade(novosDados);
                        return true;
                    case 3:
                        System.out.println("Digite o Endereço Correto:");
                        novosDados = scannerString.nextLine();
                        e.setEndereco(novosDados);
                        return true;
                    case 4:
                        System.out.println("Digite o Estado Correto:");
                        novosDados = scannerString.nextLine();
                        e.setEstado(novosDados);
                        System.out.println("Digite a Cidade Correta:");
                        novosDados = scannerString.nextLine();
                        e.setCidade(novosDados);
                        System.out.println("Digite o Endereço Correto:");
                        novosDados = scannerString.nextLine();
                        e.setEndereco(novosDados);
                        return true;
                    default:
                        System.out.println("Opção Inválida");
                }
            }
        }
        return false;
    }


    private static void menuUpdate(){
        System.out.println("Deseja corrir qual dado? ");
        System.out.println("1 - Estado");
        System.out.println("2 - Cidade");
        System.out.println("3 - Endereço");
        System.out.println("4 - todos");
    }
}
