package comportamentoDeMemoriaArraysListas.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) {

        List<String> clubes = new ArrayList<>(Arrays.asList(
                "Flamengo",
                "Vasco",
                "Vitória",
                "Atlético MG",
                "Fluminense",
                "Botafogo",
                "Corinthians",
                "Palmeiras",
                "São Paulo",
                "Santos"
        ));

        // Quantidade de times
        System.out.println("Total de clubes: " + clubes.stream().count());
        System.out.println();

        // Removendo da lista
        clubes.removeIf(clube -> clube.toLowerCase().startsWith("v"));

        // Imprimir todos os clubes
        clubes.forEach(clube -> System.out.println("Clube: " + clube));
        System.out.println();

        // Imprimir clubes que começa com F e com S
        clubes.stream()
                .filter(clube -> clube.toLowerCase().startsWith("f") ||
                        clube.toLowerCase().startsWith("s"))
                .sorted()
                .forEach(clube -> System.out.println("Maiores: " + clube));
        System.out.println();

        // Pegar o primeiro clube da lista
        clubes.stream()
                .findFirst().ifPresent(clube -> System.out.println("O maior: " + clube));

        // Pegar o último clube da lista
        clubes.stream()
                .skip(clubes.size() - 1)
                .findFirst()
                .ifPresent(clube -> System.out.println("O menor: " + clube));
    }
}
