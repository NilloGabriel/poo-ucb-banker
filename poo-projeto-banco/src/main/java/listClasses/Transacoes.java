package listClasses;

import model.Transacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Transacoes {
    private static final List<Transacao>transacoes = new ArrayList<>();

    public static List<Transacao> getTransacoes() {
        return transacoes;
    }

    public static boolean add(Transacao a) {
        for(Transacao t : transacoes) {
            if(String.valueOf(t.getId()).equals(String.valueOf(a.getId()))) {
                System.out.println("Erro! Transação já em processamento!!");
                return false;
            }
        }
        transacoes.add(a);
        System.out.println("Transação será processada com sucesso!!");
        return true;
    }

    public static boolean delete (int id) {
        for(Transacao t : transacoes) {
            if(String.valueOf(t.getId()).equals(String.valueOf(id))) {
                transacoes.remove(t);
                System.out.println("Transação de id: " + id + "removida com sucesso!!");
                return true;
            }
        }
        return false;
    }

    public static void read() {
        System.out.println("\n\n **Transações em processamento na sua conta** \n");
        transacoes.stream().peek(System.out::println).collect(Collectors.toList());
    }

    public static boolean update(int id) {

        return false;
    }
}
