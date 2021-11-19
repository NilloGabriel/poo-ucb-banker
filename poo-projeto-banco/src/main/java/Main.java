import listClasses.Clientes;
import listClasses.Contatos;
import listClasses.Enderecos;
import menu.MenuGenerico;
import menu.Menus;
import model.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static int op;
    private static Scanner scanner;

    public static void main(String[] args) {
        Login login = new Login();
        Scanner scannerInt = new Scanner(System.in);
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
                        try {
                            cliente.setLogStatus(true);
                            int tipoConta = verificarConta(cliente);//Tipo conta: 1- corrente, 2- poupanca, 3-as duas
                            do {
                                mainMenu(cliente, tipoConta);
                            } while (cliente.isLogStatus() != false);
                            Clientes.update(cliente, tipoConta);
                            System.out.println("saiu");
                        } catch (InputMismatchException e) {
                            System.out.println("\n Operação Inválida !!! \n");
                        }
                    }else{
                        System.out.println("\t\nUsuário não existe... Cadastre-se primeiro!\n");
                    }
                    break;
                case 2:
                    cadastroCliente();
                    break;
                default:
                    System.out.println("Opção invalida");
            }

        } while (true);
    }

    public static void mainMenu(Cliente c, int tipoConta) {
        if(c.getPoupanca() != null && c.getCorrente() != null) {
            System.out.println("\nDADOS DA CONTA CORRENTE\n");
            System.out.println(c.getCorrente());
            System.out.println("DADOS DA CONTA POUPANCA\n");
            System.out.println(c.getPoupanca());
        } else if (c.getCorrente() != null) {
            System.out.println("\nDADOS DA CONTA CORRENTE\n");
            System.out.println(c.getCorrente());
        } else {
            System.out.println("DADOS DA CONTA POUPANCA\n");
            System.out.println(c.getPoupanca());
        }
        scanner = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Menus.menuMainMenu();
        op = scanner.nextInt();
        System.out.println(tipoConta);
        switch (tipoConta) {
            case 1:
                switchmainMenuCorrente(c, op);
                break;
            case 2:
                switchmainMenuPoupanca(c, op);
                break;
            case 10:
                if (op == 0)
                    c.setLogStatus(false);
                else {
                    Menus.menuTipos();
                    int op2 = scanner3.nextInt();
                    if (op2 == 1)
                        switchmainMenuCorrente(c, op);
                    else if (op2 == 2)
                        switchmainMenuPoupanca(c, op);
                }
                break;
            default:
                System.out.println("\tOpcao Invalida!!!");
        }
    }

    public static void switchmainMenuCorrente(Cliente c, int op){
        Double valor;
        scanner = new Scanner(System.in);
        switch (op) {//ARRUMAR ESSA PARTE
            case 1:
                MenuGenerico.infos("INFORMAÇÕES DA CONTA");
                System.out.println(c.getNome());
                System.out.println(c.getCorrente());
                break;
            case 2:
                MenuGenerico.infos("INFORMAÇÕES DO CARTÃO");
                System.out.println(c.getCorrente().getCartao());
                break;
            case 3:
                MenuGenerico.infos("DEPOSITAR");
                System.out.println("Digite o valor a ser depositado");
                valor = scanner.nextDouble();
                c.getCorrente().depositar(valor);
                break;
            case 4:
                MenuGenerico.infos("SACAR");
                System.out.println("Digite o valor a ser sacado");
                valor = scanner.nextDouble();
                c.getCorrente().sacar(valor);
                break;
            case 5:
                Scanner scannerString = new Scanner(System.in);
                MenuGenerico.infos("TRANSFERIR");
                System.out.println("Qual valor deseja transferir");
                valor = scanner.nextDouble();
                System.out.println("Digite a conta que o dinheiro sera transferido");
                String conta = scannerString.nextLine();
                c.getCorrente().transferir(valor, conta);
                break;
            case 6:
                int senha;
                System.out.println("Digite a senha do cartão:");
                senha = scanner.nextInt();
                if(c.getCorrente().getCartao().verificarSenha(senha))
                    c.getCorrente().fazerCompra();
                else
                    System.out.println("Senha do cartão invalida");
            case 7:
                scanner = new Scanner(System.in);
                MenuGenerico.infos("SALDO");
                System.out.println(c.getCorrente().getSaldo());
                break;
            case 0:
                System.out.println("\tUsuário deslogou !!!\n");
                c.setLogStatus(false);
                break;
            default:
                System.out.println("\tOpcao Invalida!!!");
        }
    }

    public static void switchmainMenuPoupanca(Cliente c, int op){
        Double valor;
        scanner = new Scanner(System.in);
        switch (op) {//ARRUMAR ESSA PARTE
            case 1:
                MenuGenerico.infos("INFORMAÇÕES DA CONTA");
                System.out.println(c.getNome());
                System.out.println(c.getPoupanca());
                break;
            case 2:
                MenuGenerico.infos("INFORMAÇÕES DO CARTÃO");
                System.out.println(c.getPoupanca().getCartao());
                break;
            case 3:
                MenuGenerico.infos("DEPOSITAR");
                System.out.println("Digite o valor a ser depositado");
                valor = scanner.nextDouble();
                c.getPoupanca().depositar(valor);
                break;
            case 4:
                MenuGenerico.infos("SACAR");
                System.out.println("Digite o valor a ser sacado");
                valor = scanner.nextDouble();
                c.getPoupanca().sacar(valor);
                break;
            case 5:
                Scanner scannerString = new Scanner(System.in);
                MenuGenerico.infos("TRANSFERIR");
                System.out.println("Qual valor deseja transferir");
                valor = scanner.nextDouble();
                System.out.println("Digite a conta que o dinheiro sera transferido");
                String conta = scannerString.nextLine();
                c.getPoupanca().transferir(valor, conta);
                break;
            case 6:
                int senha;
                System.out.println("Digite a senha do cartão:");
                senha = scanner.nextInt();
                if(c.getPoupanca().getCartao().verificarSenha(senha))
                    c.getPoupanca().fazerCompra();
                else
                    System.out.println("Senha do cartão invalida");
            case 7:
                scanner = new Scanner(System.in);
                MenuGenerico.infos("SALDO");
                System.out.println("R$" + c.getPoupanca().getSaldo());
                break;
            case 0:
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
            case 10:
                System.out.println("Digite o seu ganho mensal:");
                ganhoMensal = scannerDouble.nextDouble();
                Corrente corrente2 = new Corrente(ganhoMensal, 5);
                Poupanca poupanca2 = new Poupanca(ganhoMensal, 5);
                c.setCorrente(corrente2);
                c.setPoupanca(poupanca2);
                break;
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
                break;
            case 2:
                MenuGenerico.infos("CADASTRANDO CARTÃO");
                System.out.println("Digite sua senha");
                senha = scannerInt.nextInt();
                cartao = new Cartao(c.getPoupanca().getGanhoMensal(), c.getNome().toUpperCase(), senha);
                c.getPoupanca().setCartao(cartao);
                MenuGenerico.infos("Cartão cadastrado");
                break;
            case 10:
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
        return  10;
    }
}