package listClasses;

import model.Cliente;
import model.Login;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Clientes {
    /*private static final List<Cliente>clientes = new ArrayList<>();

    public static List<Cliente> getClientes() {
        return clientes;
    }

    public static Cliente search(String cpf){
        for(Cliente c : clientes) {
            if(c.getCpf().equals(cpf)) {
                return c;
            }
        }
        return null;
    }

    public static boolean add(Cliente a) {
        for(Cliente c : clientes) {
            if(c.getCpf().equals(a.getCpf())) {
                System.out.println("Erro! Cliente já cadastrado!");
                return false;
            }
        }
        clientes.add(a);
        System.out.println("Cliente cadastrado com sucesso!");
        return true;
    }

    public static Cliente searchLogin(Login usuario){
        for(Cliente c : clientes) {
            if((c.getUsuario().equals(usuario.getUsuario())) && (c.getPassword().equals(usuario.getPassword()))) {
                return c;
            }
        }
        return null;
    }

    public static boolean delete(String cpf) {
        for(Cliente c : clientes) {
            if(c.getCpf().equals(cpf)) {
                clientes.remove(c);
                System.out.println("Cliente removido com sucesso!");
                return true;
            }
        }
        return false;
    }

    public static void read() {
        System.out.println("\n **Clientes cadastrados:** \n");
        clientes.stream().peek(System.out::println).collect(Collectors.toList());
    }

    public static boolean update(String cpf) {
        Scanner scannerString = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        String novosDados;
        int op;
        for(Cliente c : clientes){
            if(c.getCpf().equals(cpf)){
                menuUpdate();
                op = scanner.nextInt();
                switch (op){
                    case 1:
                        System.out.println("Digite o Nome Correto:");
                        novosDados = scannerString.nextLine();
                        c.setNome(novosDados);
                        return true;
                    case 2:
                        System.out.println("Digite o CPF Correto:");
                        novosDados = scannerString.nextLine();
                        c.setCpf(novosDados);
                        return true;
                    case 3:
                        System.out.println("Digite o RG Correto:");
                        novosDados = scannerString.nextLine();
                        c.setRg(novosDados);
                        return true;
                    case 4:
                        System.out.println("Digite o Email Correto:");
                        novosDados = scannerString.nextLine();
                        c.setEmail(novosDados);
                    case 5:
                        System.out.println("Digite o Nome Correto:");
                        novosDados = scannerString.nextLine();
                        c.setNome(novosDados);
                        System.out.println("Digite o CPF Correto:");
                        novosDados = scannerString.nextLine();
                        c.setCpf(novosDados);
                        System.out.println("Digite o RG Correto:");
                        novosDados = scannerString.nextLine();
                        c.setRg(novosDados);
                        System.out.println("Digite o Email Correto:");
                        novosDados = scannerString.nextLine();
                        c.setEmail(novosDados);
                        return true;
                    default:
                        System.out.println("Opção Inválida");
                }
            }
        }
        return false;
    }

    private static void menuUpdate(){
        System.out.println("Deseja corrigir qual dado? ");
        System.out.println("1 - Nome");
        System.out.println("2 - CPF");
        System.out.println("3 - RG");
        System.out.println("4 - Email");
        System.out.println("10 - todos");
    }*/

    public static final List<Cliente> clientes = new ArrayList<>();

    public static boolean addClientes(Cliente cliente) {
        return clientes.add(cliente);
    }

    public static List<Cliente> getClientes() {
        System.out.println("USUARIO | SENHA");
        System.out.println();
        for (Cliente c : clientes) {
            System.out.println(c.getUsuario() + " | ");
            System.out.println(c.getPassword());
            System.out.println();
        }
        return clientes;
    }

    public static Cliente searchLoginSenha(String usu, String sen) {
        Cliente clienteEncontrado = null;
        for(int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            if (cliente.getUsuario().equals(usu) && cliente.getPassword().equals(sen)) {
                clienteEncontrado = cliente;
                break;
            }
        }
        return clienteEncontrado;
    }
}
