package comportamentoDeMemoriaArraysListas.matrizes.conteudo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Matrizes é uma versão do array com varias linhas e colunas. São arrays bidimensionais.
        String dados = "Italo";

        // Exemplos de uso: #Array Tradicional
        String[] arrayTradicional = new String[3];
        Arrays.fill(arrayTradicional, dados);
        System.out.println(Arrays.toString(arrayTradicional));

        // Lista
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(30);
        numeros.add(40);
        for (Integer num : numeros) {
            System.out.println("numeros: " + num);
        }

        // Matrizes
        int[][] num = new int[3][3]; // 3 linhas e 3 colunas
        for (int[] n : num) {
            System.out.println(Arrays.toString(n));
        }

        // saida
        // [0, 0, 0]
        // [0, 0, 0]
        // [0, 0, 0]

    }
}
