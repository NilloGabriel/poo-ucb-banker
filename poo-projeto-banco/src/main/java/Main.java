import listClasses.Clientes;
import listClasses.Contatos;
import listClasses.Enderecos;
import menu.MenuGenerico;
import menu.Menus;
import model.*;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Random;
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
                    System.out.println(cliente);
                    if(cliente != null){
                        try {
                            cliente.setLogStatus(true);
                            int tipoConta = verificarConta(cliente);//Tipo conta: 1- corrente, 2- poupanca, 3-as duas
                            do {
                                mainMenu(cliente, tipoConta);
                                System.out.println("oi");
                            } while (cliente.isLogStatus() != false);
                            System.out.println("saiu");
                        } catch (InputMismatchException e) {
                            System.out.println("\n Operação Inválida !!! \n");
                        }
                    }else{
                        System.out.println("Usuario ou senha incorretos");
                    }
                    break;
                case 2:
                    cadastroCliente();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção invalida");
            }

        } while (true);
    }

    public static void mainMenu(Cliente c, int tipoConta) {
        System.out.println(c.getCorrente());
        scanner = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Menus.menuMainMenu();
        op = scanner.nextInt();
        switch (tipoConta) {
            case 1:
                switchmainMenuCorrente(c, op);
                break;
            case 2:
                switchmainMenuPoupanca(c, op);
                break;
            case 3:
                Menus.menuTipos();
                op = scanner3.nextInt();
                if(op == 1)
                    switchmainMenuCorrente(c, op);
                else
                    switchmainMenuPoupanca(c, op);

        }
        System.out.println("oi");
    }

    public static void switchmainMenuCorrente(Cliente c, int op){
        switch (op) {//ARRUMAR ESSA PARTE
            case 1:
                MenuGenerico.infos("INFORMAÇÕES DA CONTA");
                System.out.println(c.getNome());
                System.out.println(c);
                break;
            case 2:
                scanner = new Scanner(System.in);
                MenuGenerico.infos("INFORMAÇÕES DO CARTÃO");
                System.out.println(c.getCorrente().getCartao());
                break;
            case 3:
                scanner = new Scanner(System.in);
                MenuGenerico.infos("DEPOSITAR");
                Menus.menuTipos();
                op = scanner.nextInt();

                switch (op) {
                    case 1:
                        if (c.getCorrente() == null)
                            System.out.println("\t\nCliente não possui conta corrente.");
                        else
                            c.getCorrente().depositarContaCorrente();
                        break;
                    case 2:
                        if (c.getPoupanca() == null)
                            System.out.println("\t\nCliente não possui conta poupança.");
                        else
                            c.getPoupanca().depositarContaPoupanca();
                        break;
                    default:
                        System.out.println("\t\nOpção Inválida!!!");
                }
                break;
            case 4:
                scanner = new Scanner(System.in);
                MenuGenerico.infos("SACAR");
                Menus.menuTipos();
                op = scanner.nextInt();

                switch (op) {
                    case 1:
                        if (c.getCorrente() == null)
                            System.out.println("\t\nCliente não possui conta corrente.");
                        else
                            c.getCorrente().sacarContaCorrente();
                        break;
                    case 2:
                        if (c.getPoupanca() == null)
                            System.out.println("\t\nCliente não possui conta poupança.");
                        else
                            c.getPoupanca().sacarContaPoupanca();
                        break;
                    default:
                        System.out.println("\t\nOpção Inválida!!!");
                }
            case 5:
                scanner = new Scanner(System.in);
                MenuGenerico.infos("TRANSFERIR");
                Menus.menuTipos();
                op = scanner.nextInt();

                break;
            case 6:
                scanner = new Scanner(System.in);
                MenuGenerico.infos("SALDO");
                System.out.println(c.getCorrente().getSaldo());
                break;
            case 7:
                System.out.println("\tUsuário deslogou !!!\n");
                c.setLogStatus(false);
                break;
            default:
                System.out.println("\tOpcao Invalida!!!");
        }
    }

    public static void switchmainMenuPoupanca(Cliente c, int op){
        switch (op) {//ARRUMAR ESSA PARTE
            case 1:
                MenuGenerico.infos("INFORMAÇÕES DA CONTA");
                System.out.println(c.getNome());
                System.out.println(c);
                break;
            case 2:
                scanner = new Scanner(System.in);
                MenuGenerico.infos("INFORMAÇÕES DO CARTÃO");
                System.out.println(c.getPoupanca().getCartao());
                break;
            case 3:
                scanner = new Scanner(System.in);
                MenuGenerico.infos("DEPOSITAR");
                Menus.menuTipos();
                op = scanner.nextInt();

                switch (op) {
                    case 1:
                        if (c.getPoupanca() == null)
                            System.out.println("\t\nCliente não possui conta Poupança.");
                        else
                            c.getPoupanca().depositarContaPoupanca();
                        break;
                    case 2:
                        if (c.getPoupanca() == null)
                            System.out.println("\t\nCliente não possui conta poupança.");
                        else
                            c.getPoupanca().depositarContaPoupanca();
                        break;
                    default:
                        System.out.println("\t\nOpção Inválida!!!");
                }
                break;
            case 4:
                scanner = new Scanner(System.in);
                MenuGenerico.infos("SACAR");
                Menus.menuTipos();
                op = scanner.nextInt();

                switch (op) {
                    case 1:
                        if (c.getPoupanca() == null)
                            System.out.println("\t\nCliente não possui conta corrente.");
                        else
                            c.getPoupanca().sacarContaPoupanca();
                        break;
                    case 2:
                        if (c.getPoupanca() == null)
                            System.out.println("\t\nCliente não possui conta poupança.");
                        else
                            c.getPoupanca().sacarContaPoupanca();
                        break;
                    default:
                        System.out.println("\t\nOpção Inválida!!!");
                }
            case 5:
                scanner = new Scanner(System.in);
                MenuGenerico.infos("TRANSFERIR");
                Menus.menuTipos();
                op = scanner.nextInt();

                break;
            case 6:
                scanner = new Scanner(System.in);
                MenuGenerico.infos("SALDO");
                System.out.println("R$" + c.getPoupanca().getSaldo());
                break;
            case 7:
                System.out.println("\tUsuário deslogou !!!\n");
                c.setLogStatus(false);
                break;
            default:
                System.out.println("\tOpcao Invalida!!!");
        }
    }

    public static void cadastroCliente(){
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
                break;
            case 2:
                System.out.println("Digite o seu ganho mensal:");
                ganhoMensal = scannerDouble.nextDouble();
                Poupanca poupanca = new Poupanca(ganhoMensal, 5);
                c.setPoupanca(poupanca);
                break;
            case 3:
                System.out.println("Digite o seu ganho mensal:");
                ganhoMensal = scannerDouble.nextDouble();
                Corrente corrente2 = new Corrente(ganhoMensal, 5);
                Poupanca poupanca2 = new Poupanca(ganhoMensal, 5);
                c.setCorrente(corrente2);
                c.setPoupanca(poupanca2);
        }
        cadastrarCartao(c, op);
    }

    public static void cadastrarCartao(Cliente c, int op){
        int senha;
        Scanner scannerInt = new Scanner(System.in);
        Cartao cartao;
        switch (op){
            case 1:
                MenuGenerico.infos("CADASTRANDO CARTÃO");
                System.out.println("Digite sua senha");
                senha = scannerInt.nextInt();
                cartao = new Cartao(c.getCorrente().getGanhoMensal(), c.getNome().toUpperCase(), senha);
                c.getCorrente().setCartao(cartao);
                MenuGenerico.infos("Cartão cadastrado");
                System.out.println(c.getCorrente());
                break;
            case 2:
                MenuGenerico.infos("CADASTRANDO CARTÃO");
                System.out.println("Digite sua senha");
                senha = scannerInt.nextInt();
                cartao = new Cartao(c.getPoupanca().getGanhoMensal(), c.getNome().toUpperCase(), senha);
                c.getPoupanca().setCartao(cartao);
                MenuGenerico.infos("Cartão cadastrado");
                break;
            case 3:
                MenuGenerico.infos("CADASTRANDO CARTÃO");
                System.out.println("Digite sua senha");
                senha = scannerInt.nextInt();
                cartao = new Cartao(c.getCorrente().getGanhoMensal(), c.getNome().toUpperCase(), senha);
                c.getCorrente().setCartao(cartao);
                c.getPoupanca().setCartao(cartao);
                MenuGenerico.infos("Cartão cadastrado");
                break;
        }
        Clientes.add(c);
    }

    public static int verificarConta(Cliente c){
        if(c.getCorrente() == null)
            return 2;
        if(c.getPoupanca() == null)
            return 1;
        return  3;
    }
}


