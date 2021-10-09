import listClasses.Clientes;
import listClasses.Contatos;
import listClasses.Enderecos;
import menu.MenuGenerico;
import menu.Menus;
import model.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static boolean logStatus = false;
    private static int op;
    private static Scanner scanner;
    private static Clientes clientes;

    public static void main(String[] args) {
        int op;
        Login login = new Login();
        String userLogin;
        String userPassword;
        Adm adm = new Adm();
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        Cliente cliente;
        Menus.welcome();
        do{
            Menus.menuLogin();
            op = scannerInt.nextInt();
            switch (op){
                case 1:
                    cliente = Clientes.search(login.loginUsuario());
                    System.out.println("DADOS DA CONTA\n");
                    System.out.println(cliente);
                    if(cliente != null){
                        cliente.setLogStatus(true);
    //                       DESCOMENTAR APOS TIRAR DUVIDA COM A PROFESSORA!!
    //                       if(cliente.getCorrente() == null && cliente.getPoupanca() == null){
    //                           cadastrarConta(cliente);
    //                       }
                        try {
                            do {
                                mainMenu(cliente);
                            } while (login.isLogStatus());
                        } catch (InputMismatchException e) {
                            System.out.println("\n Operação Inválida !!! \n");
                        }
                    }else{
                        System.out.println("\t\nNenhum usuário foi cadastrado... Cadastre-se primeiro:\n");
                        cadastro();
                    }
                    break;
                case 2:
                    cadastro();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção invalida");
            }

        } while (true);
    }

    public static void mainMenu(Cliente c) {
        if(c.getCorrente() != null) {
            System.out.println("\nDADOS DA CONTA CORRENTE\n");
            System.out.println(c.getCorrente());
        } else if (c.getPoupanca() != null) {
            System.out.println("\nDADOS DA CONTA POUPANCA\n");
            System.out.println(c.getPoupanca());
        }
        scanner = new Scanner(System.in);

        System.out.println("\t\nDESEJA OPERAR EM QUAL TIPO DE CONTA?\n");
        Menus.menuTipos();
        op = scanner.nextInt();

        switch(op) {
            case 1:
                if(c.getCorrente() == null)
                    System.out.println("\t\nCliente não possui conta corrente.");
                else if(c.getCorrente() != null){
                    Menus.menuMainMenu();
                    op = scanner.nextInt();
                    switch(op) {//ARRUMAR ESSA PARTE
                        case 1:
                            MenuGenerico.infos("INFORMAÇÕES DA CONTA");
                            System.out.println(c.getNome());
                            System.out.println();
                            break;
                        case 2:
                            MenuGenerico.infos("INFORMAÇÕES DO CARTÃO");
                            break;
                        case 3:
                            MenuGenerico.infos("DEPOSITAR");
                            c.getCorrente().depositarContaCorrente();
                            break;
                        case 4:
                            MenuGenerico.infos("SACAR");
                            c.getCorrente().sacarContaCorrente();
                        case 5:
                            MenuGenerico.infos("TRANSFERIR");
                            break;
                        case 6:
                            MenuGenerico.infos("SALDO");
                            break;
                        case 7:
                            System.out.println("\tUsuário deslogou !!!\n");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("\tOpcao Invalida!!!");
                    }
                }
            case 2:
                if(c.getPoupanca() == null)
                    System.out.println("\t\nCliente não possui conta poupança.");
                else if (c.getPoupanca() != null){
                    Menus.menuMainMenu();
                    op = scanner.nextInt();
                    switch(op) {//ARRUMAR ESSA PARTE
                        case 1:
                            MenuGenerico.infos("INFORMAÇÕES DA CONTA");
                            System.out.println(c.getNome());
                            System.out.println();
                            break;
                        case 2:
                            MenuGenerico.infos("INFORMAÇÕES DO CARTÃO");
                            break;
                        case 3:
                            MenuGenerico.infos("DEPOSITAR");
                            c.getPoupanca().depositarContaPoupanca();
                            break;
                        case 4:
                            MenuGenerico.infos("SACAR");
                            c.getPoupanca().sacarContaPoupanca();
                        case 5:
                            MenuGenerico.infos("TRANSFERIR");
                            break;
                        case 6:
                            MenuGenerico.infos("SALDO");
                            break;
                        case 7:
                            System.out.println("\tUsuário deslogou !!!\n");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("\tOpcao Invalida!!!");
                    }
                }
        }
//        System.out.println(c.getCorrente());
//        scanner = new Scanner(System.in);
//        Scanner scanner3 = new Scanner(System.in);
//        Corrente corrente;
//        Poupanca poupanca;
//        if(c.getPoupanca() == null || c.getCorrente() == null) {
//            if(c.getCorrente() != null)
//                corrente = c.getCorrente();
//            else
//                poupanca = c.getPoupanca();
//        }else{
//            Menus.menuTipos();
//            op = scanner.nextInt();
//            switch (op) {
//                case 1:corrente = c.getCorrente();break;
//                case 2: poupanca = c.getPoupanca();break;
//                default:
//                    System.out.println("Opção invalida");
//            }
//        }
//        Menus.menuMainMenu();
//        op = scanner.nextInt();
//        switch(op) {//ARRUMAR ESSA PARTE
//            case 1:
//                MenuGenerico.infos("INFORMAÇÕES DA CONTA");
//                System.out.println(c.getNome());
//                System.out.println();
//                break;
//            case 2:
//                scanner = new Scanner(System.in);
//                MenuGenerico.infos("INFORMAÇÕES DO CARTÃO");
//                break;
//            case 3:
//                scanner = new Scanner(System.in);
//                MenuGenerico.infos("DEPOSITAR");
//                Menus.menuTipos();
//                op = scanner.nextInt();
//
//                switch(op) {
//                    case 1:
//                        if(c.getCorrente() == null)
//                            System.out.println("\t\nCliente não possui conta corrente.");
//                        else
//                            c.getCorrente().depositarContaCorrente();
//                        break;
//                    case 2:
//                        if(c.getPoupanca() == null)
//                            System.out.println("\t\nCliente não possui conta poupança.");
//                        else
//                            c.getPoupanca().depositarContaPoupanca();
//                        break;
//                    default:
//                        System.out.println("\t\nOpção Inválida!!!");
//                }
//                break;
//            case 4:
//                scanner = new Scanner(System.in);
//                MenuGenerico.infos("SACAR");
//                Menus.menuTipos();
//                op = scanner.nextInt();
//
//                switch(op) {
//                    case 1:
//                        if(c.getCorrente() == null)
//                            System.out.println("\t\nCliente não possui conta corrente.");
//                        else
//                            c.getCorrente().sacarContaCorrente();
//                        break;
//                    case 2:
//                        if(c.getPoupanca() == null)
//                            System.out.println("\t\nCliente não possui conta poupança.");
//                        else
//                            c.getPoupanca().sacarContaPoupanca();
//                        break;
//                    default:
//                        System.out.println("\t\nOpção Inválida!!!");
//                }
//            case 5:
//                scanner = new Scanner(System.in);
//                MenuGenerico.infos("TRANSFERIR");
//                Menus.menuTipos();
//                op = scanner.nextInt();
//
//                break;
//            case 6:
//                scanner = new Scanner(System.in);
//                MenuGenerico.infos("SALDO");
//                break;
//            case 7:
////                login.setLogStatus(false);
//                System.out.println("\tUsuário deslogou !!!\n");
//                System.exit(0);
//                break;
//            default:
//                System.out.println("\tOpcao Invalida!!!");
//        }
    }

    public static void cadastro(){
        Enderecos enderecos = new Enderecos();
        Contatos contatos = new Contatos();
        String usuario, password;
        String cep,estado, cidade, endereco;
        String entradaString;
        int operadora;
        Scanner scannerString = new Scanner(System.in);
        Scanner scannerString2 = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        MenuGenerico.infos("CADASTRANDO CLIENTE");

        System.out.println("Digite seu usuario: ");
        usuario = scannerString.nextLine();

        System.out.println("Digite sua senha: ");
        password = scannerString2.nextLine();

        Cliente cliente = new Cliente(usuario,password);

        System.out.println("Digite seu nome: ");
        entradaString = scannerString.nextLine();
        cliente.setNome(entradaString);

        System.out.println("Digite seu cpf: ");
        entradaString = scannerString.nextLine();
        cliente.setCpf(entradaString);

        System.out.println("Digite seu rg: ");
        entradaString = scannerString.nextLine();
        cliente.setRg(entradaString);

        System.out.println("Digite seu email");
        entradaString = scannerString.nextLine();
        cliente.setEmail(entradaString);

        System.out.println("Digite seu cep:");
        cep = scannerString.nextLine();
        System.out.println("Digite a sigla do seu estado");
        System.out.println("ex: SP");
        estado = scannerString.nextLine();
        System.out.println("Digite o nome da sua cidade: ");
        cidade = scannerString.nextLine();
        System.out.println("Digite seu endereço: ");
        endereco = scannerString.nextLine();
        Endereco endereco1 = new Endereco(cep, estado, cidade, endereco);
        enderecos.add(endereco1);
        cliente.setEnderecos(enderecos);

        System.out.println("Digite seu numero:");
        entradaString = scannerString.nextLine();
        System.out.println("Digite sua operadora");
        Contato.menuOperadoras();
        operadora = scannerInt.nextInt();
        Contato contato = new Contato(operadora, entradaString);
        contatos.add(contato);
        cliente.setContatos(contatos);
        cadastrarConta(cliente);
    }

    public static void cadastrarConta(Cliente c){
        Scanner scanner3 = new Scanner(System.in);
        MenuGenerico.infos("ABRINDO CONTA");
        Menus.menuTipos();
        System.out.printf("\t|     10     |            TODAS            |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        op = scanner3.nextInt();
        Double ganhoMensal;
        Scanner scannerDouble = new Scanner(System.in);
        switch (op){
            case 1:
                System.out.println("Digite o seu ganho mensal:");
                ganhoMensal = scannerDouble.nextDouble();
                Corrente corrente = new Corrente(ganhoMensal, 5);
                c.setCorrente(corrente);
                Clientes.add(c);
                break;
            case 2:
                System.out.println("Digite o seu ganho mensal:");
                ganhoMensal = scannerDouble.nextDouble();
                Poupanca poupanca = new Poupanca(ganhoMensal, 5);
                c.setPoupanca(poupanca);
                Clientes.add(c);
                break;
            case 3:
                System.out.println("Digite o seu ganho mensal:");
                ganhoMensal = scannerDouble.nextDouble();
                Corrente corrente2 = new Corrente(ganhoMensal, 5);
                Poupanca poupanca2 = new Poupanca(ganhoMensal, 5);
                c.setCorrente(corrente2);
                c.setPoupanca(poupanca2);
                Clientes.add(c);
        }
    }
}


