
/*      - Estado = PE - População = 9.616.621
        - Estado = AL - População = 3.351.543
        - Estado = CE - População = 9.187.103
        - Estado = RN - População = 3.534.265
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Criando dicionario para tratamento
        Map<String, Integer> listaDePopulacao = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(" * Exibindo dados inicias: * ");
        System.out.println("-------------------------------------------------");
        // Exibindo lista
        for (Map.Entry<String, Integer> entry: listaDePopulacao.entrySet()) {
            System.out.println(" Estado : " + entry.getKey() + "\n" +
                    " Populacao : " + entry.getValue() + "\n" +
                    "-------------------------------------------------");
        }

        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("---------------------------------------------------");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++ \n");
        System.out.println(" * Substitua Populacao Rn por 3.534.165 : *");
        // Adicionando novo valor
        listaDePopulacao.put("RN", 3534165);
        System.out.println("-------------------------------------------------");
        // Exibindo lista
        for (Map.Entry<String, Integer> entry: listaDePopulacao.entrySet()) {
            System.out.println(" Estado : " + entry.getKey() + "\n" +
                    " Populacao : " + entry.getValue() + "\n" +
                    "-------------------------------------------------");
        }

        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("---------------------------------------------------");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++ \n");
        System.out.println(" * Confira se contem o estado PB na lista *");
        System.out.println(" * Caso nao tenha Adicione - PB - 4.039.277 *");
        if (!listaDePopulacao.isEmpty()) { // Verificando se Lista não esta vazia
            if (listaDePopulacao.containsKey("PB")) { // Verificando se exista a chave PB
                System.out.println(" Estado PB ja adiconado na lista .");
            } else {
                listaDePopulacao.put("PB", 4039277); // Adicionando caso não exista a chave PB
            }
        }
        System.out.println("-------------------------------------------------");
        // Exibindo lista
        for (Map.Entry<String, Integer> entry: listaDePopulacao.entrySet()) {
            System.out.println(" Estado : " + entry.getKey() + "\n" +
                    " Populacao : " + entry.getValue() + "\n" +
                    "-------------------------------------------------");
        }

        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("---------------------------------------------------");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++ \n");
        System.out.println(" * Exiba a população de PE : * ");
        // Exibindo População
        System.out.println(listaDePopulacao.get("PE"));

        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("---------------------------------------------------");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++ \n");
        System.out.println(" * Exiba todos na ordem que foi informado * ");
        // Recriando lista com Linked
        Map<String, Integer> listaDePopulacaoOrdemInsersao = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println("-------------------------------------------------");
        // Exibindo lista
        for (Map.Entry<String, Integer> entry: listaDePopulacaoOrdemInsersao.entrySet()) {
            System.out.println(" Estado : " + entry.getKey() + "\n" +
                    " Populacao : " + entry.getValue() + "\n" +
                    "-------------------------------------------------");
        }

        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("---------------------------------------------------");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++ \n");
        System.out.println(" * Ordem alfabetica * ");
        // Recriando Lista com TreeMap
        Map<String, Integer> listaDePopulacaoOrdemAlfabetica = new TreeMap<>(listaDePopulacao);
        System.out.println("-------------------------------------------------");
        // Exibindo lista
        for (Map.Entry<String, Integer> entry: listaDePopulacaoOrdemAlfabetica.entrySet()) {
            System.out.println(" Estado : " + entry.getKey() + "\n" +
                    " Populacao : " + entry.getValue() + "\n" +
                    "-------------------------------------------------");
        }

        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("---------------------------------------------------");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++ \n");
        System.out.println(" * Exiba o estado com menor populacao e sua quantidade * ");
        System.out.println("-------------------------------------------------");
        // Pegando o qnt da menor população
        Integer menorPopulacao = Collections.min(listaDePopulacao.values());
        for (Map.Entry<String, Integer> entry: listaDePopulacao.entrySet()) {
            if (entry.getValue().equals(menorPopulacao)) {
                System.out.println(" Estado : " + entry.getKey() + "\n" +
                        " Populacao : " + entry.getValue() + "\n" +
                        "-------------------------------------------------");
            }
        }

        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("---------------------------------------------------");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++ \n");
        System.out.println(" * Exiba o estado com maior populacao e sua quantidade * ");
        System.out.println("-------------------------------------------------");
        Integer maiorPopulacao = Collections.max(listaDePopulacao.values());
        for (Map.Entry<String, Integer> entry : listaDePopulacao.entrySet()) {
            if(entry.getValue().equals(maiorPopulacao)) {
                System.out.println(" Estado : " + entry.getKey() + "\n" +
                        " Populacao : " + entry.getValue() + "\n" +
                        "-------------------------------------------------");
            }
        }

        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("---------------------------------------------------");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++ \n");
        System.out.println(" * Exiba a soma total e a media de populacao de todos os estados * ");
        System.out.println("-------------------------------------------------");
        // Variavel de controle
        Integer totalPopulacao = 0;
        // Somando
        for (Map.Entry<String, Integer> entry: listaDePopulacao.entrySet()) {
            totalPopulacao += entry.getValue();
        }
                System.out.println(" Populacao total : " + totalPopulacao);
        System.out.println(" Media : " + (totalPopulacao/listaDePopulacao.size()) );
        System.out.println("-------------------------------------------------");

        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("---------------------------------------------------");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++ \n");
        System.out.println(" * Remova os estados com população menor que 4 milhoes * ");
        System.out.println("-------------------------------------------------");
        listaDePopulacao.values().removeIf(values -> values < 4000000);
        // Exibindo lista
        for (Map.Entry<String, Integer> entry: listaDePopulacao.entrySet()) {
            System.out.println(" Estado : " + entry.getKey() + "\n" +
                    " Populacao : " + entry.getValue() + "\n" +
                    "-------------------------------------------------");
        }

        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("---------------------------------------------------");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++ \n");
        System.out.println(" * Pague Tudo * ");
        System.out.println("-------------------------------------------------");
        listaDePopulacao.clear();
        System.out.println(" A lista esta vazia ? " + listaDePopulacao.isEmpty() );

    }
}