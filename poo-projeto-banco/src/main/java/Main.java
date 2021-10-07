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
                    System.out.println(cliente);
                    if(cliente != null){
                         cliente.setLogStatus(true);
//                        DESCOMENTAR APOS TIRAR DUVIDA COM A PROFESSORA!!
//                        if(cliente.getCorrente() == null && cliente.getPoupanca() == null){
//                            cadastrarConta(cliente);
//                        }
                            try {
                                do {
                                    mainMenu(cliente);
                                } while (login.isLogStatus());
                            } catch (InputMismatchException e) {
                                System.out.println("\n Operação Inválida !!! \n");
                            }
                    }else{
                        System.out.println("Usuario ou senha incorretos");
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
        System.out.println(c.getCorrente());
//        Login login = new Login();
        scanner = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Menus.menuMainMenu();
        op = scanner.nextInt();
        switch(op) {
            case 1:
                MenuGenerico.infos("INFORMAÇÕES DA CONTA");
                Menus.menuTipos();
                int op2 = scanner3.nextInt();
                switch (op2){
                    case 1:
                        System.out.println(c.getNome());
                        System.out.println(c.getCorrente());
                }
                break;
            case 2:
                scanner = new Scanner(System.in);
                MenuGenerico.infos("INFORMAÇÕES DO CARTÃO");
                break;
            case 3:
                scanner = new Scanner(System.in);
                MenuGenerico.infos("DEPOSITAR");
                break;
            case 4:
                scanner = new Scanner(System.in);
                MenuGenerico.infos("TRANSFERIR");
                break;
            case 5:
                scanner = new Scanner(System.in);
                MenuGenerico.infos("SALDO");
                break;
            case 6:
//                login.setLogStatus(false);
                System.out.println("\tUsuário deslogou !!!\n");
                System.exit(0);
                break;
            default:
                System.out.println("\tOpcao Invalida!!!");
        }
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

