import listClasses.Clientes;
import model.*;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static String userLogin = "";
    private static String userPassword = "";
    private static int op;

    public static void main(String[] args) {
        int op;
        Scanner scannerInt = new Scanner(System.in);
         do{
            welcome();
            menuLogin();
            op = scannerInt.nextInt();
            switch (op){
                case 1:

                        Login.loginUsuario();

                    break;
                case 2:
                    cadastro();
                    readClientes();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção invalida");
            }

        } while (true);
    }

    public static void welcome() {
        System.out.println();
        System.out.printf("\t ___________________________________________\n");
        System.out.printf("\t|  _______________________________________  |\n");
        System.out.printf("\t| |                                       | |\n");
        System.out.printf("\t| |                                       | |\n");
        System.out.printf("\t| |                                       | |\n");
        System.out.printf("\t| |                  POO                  | |\n");
        System.out.printf("\t| |                                       | |\n");
        System.out.printf("\t| |                 BANKER                | |\n");
        System.out.printf("\t| |                                       | |\n");
        System.out.printf("\t| |            GABRIEL D'NILLO            | |\n");
        System.out.printf("\t| |            MATEUS  COLARES            | |\n");
        System.out.printf("\t| |                                       | |\n");
        System.out.printf("\t| |                                       | |\n");
        System.out.printf("\t| |_______________________________________| |\n");
        System.out.printf("\t|___________________________________________|\n");
        System.out.println();
    }

    public static void mainMenu() {
//        Login login = new Login();

        System.out.println("\tESCOLHA A FUNCAO QUE DESEJA ENTRAR:");
        System.out.printf("\t __________________________________________\n");
        System.out.printf("\t|   OPÇÃO    |           FUNÇÕES           |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        System.out.printf("\t|     1      |            CONTA            |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        System.out.printf("\t|     2      |            SACAR            |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        System.out.printf("\t|     3      |          DEPOSITAR          |\n");
        System.out.printf("\t|____________|_____________________________|\n");
        System.out.printf("\t|     4      |          TRANSFERIR         |\n");
        System.out.printf("\t|____________|_____________________________|\n");
        System.out.printf("\t|     5      |            SALDO            |\n");
        System.out.printf("\t|____________|_____________________________|\n");
        System.out.printf("\t|     6      |            LOGOUT           |\n");
        System.out.printf("\t|____________|_____________________________|\n");
        Scanner scanner = new Scanner(System.in);
        op = scanner.nextInt();
        switch(op) {
            case 1:
                System.out.println(" //////////////////////////////////////////////////////////////////////\n");
                System.out.println();
                System.out.println("                                CONTA                                  \n");
                System.out.println();
                System.out.println(" //////////////////////////////////////////////////////////////////////\n");
                menuTipoContaAmbos();
                break;
            case 2:
                System.out.println(" //////////////////////////////////////////////////////////////////////\n");
                System.out.println();
                System.out.println("                                SAQUE                                \n");
                System.out.println();
                System.out.println(" //////////////////////////////////////////////////////////////////////\n");
                menuTipoConta();
                break;
            case 3:
                System.out.println(" //////////////////////////////////////////////////////////////////////\n");
                System.out.println();
                System.out.println("                                DEPOSITO                                 \n");
                System.out.println();
                System.out.println(" //////////////////////////////////////////////////////////////////////\n");
                menuTipoConta();
                break;
            case 4:
                System.out.println(" //////////////////////////////////////////////////////////////////////\n");
                System.out.println();
                System.out.println("                             TRANSFERENCIA                             \n");
                System.out.println();
                System.out.println(" //////////////////////////////////////////////////////////////////////\n");
                menuTipoConta();
                break;
            case 5:
                System.out.println(" //////////////////////////////////////////////////////////////////////\n");
                System.out.println();
                System.out.println("                                 SALDO                                 \n");
                System.out.println();
                System.out.println(" //////////////////////////////////////////////////////////////////////\n");
                menuTipoContaAmbos();
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


    public static void menuLogin(){
        System.out.printf("\t __________________________________________\n");
        System.out.printf("\t|                  LOGIN                   |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        System.out.printf("\t|     1      |            CLIENTE          |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        System.out.printf("\t|     2      |           CADASTRAR         |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        System.out.printf("\t|     3      |              ADM            |\n");
        System.out.printf("\t|____________|_____________________________|\n");
    }

    public static void menuTipoContaAmbos() {
        System.out.println();
        System.out.println("\tESCOLHA O TIPO DE CONTA PARA REALIZAR A FUNCAO INFORMADA:");
        System.out.printf("\t __________________________________________\n");
        System.out.printf("\t|   OPÇÃO    |             TIPO            |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        System.out.printf("\t|     1      |           CORRENTE          |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        System.out.printf("\t|     2      |           POUPANCA          |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        System.out.printf("\t|     3      |             AMBOS           |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        System.out.println();
    }

    public static void menuTipoConta() {
        System.out.println();
        System.out.println("\tESCOLHA O TIPO DE CONTA PARA REALIZAR A FUNCAO INFORMADA:");
        System.out.printf("\t __________________________________________\n");
        System.out.printf("\t|   OPÇÃO    |             TIPO            |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        System.out.printf("\t|     1      |           CORRENTE          |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        System.out.printf("\t|     2      |           POUPANCA          |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        System.out.println();
    }

    public static void cadastro(){
        /*Enderecos enderecos = new Enderecos();
        Contatos contatos = new Contatos();
        String usuario, password;
        String cep,estado, cidade, endereco;
        String entradaString;
        Double entradaDouble;
        int operadora;
        Scanner scannerString = new Scanner(System.in);
        Scanner scannerDouble = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        System.out.println(" //////////////////////////////////////////////////////////////////////\n");
        System.out.println();
        System.out.println("                          CADASTRANDO CLIENTE                     \n");
        System.out.println();
        System.out.println(" //////////////////////////////////////////////////////////////////////\n");
        System.out.println("");

        System.out.println("Digite seu usuario: ");
        usuario = scannerString.nextLine();

        System.out.println("Digite sua senha: ");
        password = scannerString.nextLine();

        Cliente cliente = new Cliente(usuario, password, logStatus);

        System.out.println("Digite seu nome: ");
        entradaString = scannerString.nextLine();
        cliente.setNome(entradaString);

        System.out.println("Digite seu cpf: ");
        entradaString = scannerString.nextLine();
        cliente.setCpf(entradaString);

        System.out.println("Digite seu rg: ");
        entradaString = scannerString.nextLine();
        cliente.setRg(entradaString);

        System.out.println("Digite sua renda mensal: ");
        entradaDouble = scannerDouble.nextDouble();
        cliente.setRendaMensal(entradaDouble);

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

        System.out.printf("\t __________________________________________\n");
        System.out.printf("\t|   OPÇÃO    |           FUNÇÕES           |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        System.out.printf("\t|     1      |         ABRIR CONTA         |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        System.out.printf("\t|     2      |           LOGOUT            |\n");
        System.out.printf("\t|------------|-----------------------------|\n");
        op = scanner.nextInt();
        switch (op){
            case 1:


        }

        Clientes.add(cliente);*/
        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente(userLogin, userPassword);
        System.out.println("Informe o Usuário: ");
        String usuarioInput = sc.next();
        cliente.setUsuario(usuarioInput);

        System.out.println("Informe a senha: ");
        String senhaInput = sc.next();
        cliente.setSenha(senhaInput);

        Clientes.addClientes(cliente);
    }

    public static void readClientes() {
        Clientes.getClientes();
    }

    public static void cadastrarConta(Cliente c){


    }
}

