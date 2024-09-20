package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListasPart2 {

    public static void main(String[] args) {

        // Instanciamos uma lista assim
        List<String> clubesRio = new ArrayList<>(); // List<tipo> apelido = new ArrayList<>();

        clubesRio.add("Flamengo");
        clubesRio.add("Vasco");
        clubesRio.add("Fluminense");
        clubesRio.add("Botafogo");
        clubesRio.add(2, "Bangu"); // Adicionar um valor na posição 2. O conteúdo antigo da posição 2, ele sobe 1 posição.

        System.out.println("Formato padrão de Lista: " + clubesRio);
        System.out.println();

        for (String time : clubesRio) {
            System.out.println(time);
        }
        System.out.println("-------------------------------");

        clubesRio.remove("Vasco"); // Remover objeto especificado.
        clubesRio.remove(2); // Remover da posição 2
        System.out.println(clubesRio);

        System.out.println("-------------------------------------------------");
        clubesRio.add("Santos");
        clubesRio.add("Corinthians");
        clubesRio.add("Sergipe");

        System.out.println("Novos clubes: " + clubesRio);
        System.out.println("-------------------------------------------------");

        // Remover todo mundo que começa com a letra 'F'
        // modo de uso: pega um valor clubesRio e me retorna se o meu clubes.charat(0) for igual a 'F'
        clubesRio.removeIf(clube -> clube.charAt(0) == 'F'); // Expressão lambda, que é um predicado.
        System.out.println("Removendo clubes que começa com a letra F");
        for (String clube : clubesRio) {
            System.out.println(clube);
        }

        System.out.println("-------------------------------------------------");
        System.out.println("Encontrado a posição dos elementos");
        System.out.println("Index of Sergipe: " + clubesRio.indexOf("Sergipe"));
        System.out.println("Index of Flamengo: " + clubesRio.indexOf("Flamengo")); // retorna -1 pq o flamengo não existe mais na lista.
        System.out.println("-------------------------------------------------");

        System.out.println("Deixar na lista apenas nomes que começa com 'S' ");
        // Para fazer isso, precisamos criar uma nova lista com apelido e pegar a lista antiga e converter para stream()
        // stream() - é para conseguirmos usar expressões lambidas em nossas funções
        // So que o stream() não é compatível com minha lista clubesRio, para isso, preciso converter esse stream() para lista.
        // A partir do Java 21, não precisa mais usar o collect(Collectors.toList()) para converter a stream(0) para lista
        // Agora, no Java 21, s[p utiliza toList. toList significa que estou convertendo o meu stream para lista.
        List<String> clubesQueComecaComS = clubesRio.stream().filter(time -> time.charAt(0) == 'S').toList();
        System.out.println(clubesQueComecaComS);
        // RESUMO: primeiro converto minha lista para stream(), para utilizar expressões lambda(predicados) e depois converter para lista.
        System.out.println("-------------------------------------------------");
        clubesRio.add("Avaí");
        clubesRio.add("Agua Santa");
        clubesRio.add("Amazonas");
        System.out.println(clubesRio);

        // Para retornar 1 elemento que começa com a letra A, vou filtrar todos os elementos, verificar o que começa com a letra A e imprimir em uma variavel String
        String nome = clubesRio.stream().filter(unicoClube -> unicoClube.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println("-------------------------------------------------");
        System.out.println("De todos os clubes que começa com a letra A, imprimir apenas o: " + nome);
        String outroNome = clubesRio.stream().filter(unicoClube -> unicoClube.charAt(2) == 'A').findFirst().orElse(null);
        System.out.println("De todos os clubes que começa com a letra A, imprimir apenas o: " + outroNome);
        // Resumo: Vai filtrar todos os elemtnos da posição 0 que começa com a letra A e vai pegar o primeiro, se não existir, retorna null.

    }
}
