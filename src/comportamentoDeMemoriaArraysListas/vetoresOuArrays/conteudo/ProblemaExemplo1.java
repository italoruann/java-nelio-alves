package comportamentoDeMemoriaArraysListas.vetoresOuArrays.conteudo;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemplo1 {

    static {
        Locale.setDefault(Locale.US);
    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int N = sc.nextInt();


        // o q é vetor/arrays - estrutura de dados homogênia( do mesmo tipo), ordenada(elementos acessados por meio de posições) e alocada uma vez só, em um bloco contíguo
        // de memoria

        // Para criar um vetor, primeiro tem q instanciar
        double[] alturasN = new double[N]; // tipo sinalArray = new tipo sinalArray tamanhoDoArray

        for (int i = 0; i < N; i++) {
            alturasN[i] = sc.nextDouble();

        }
        // Agora que o lop for ja percorreu os arrays digitados, eles já estão adicionados ao array. Agora vamos criar outro lop for para percorrer a soma dos vetores.
        double soma = 0;
        for (int i = 0; i < N; i++) {
            soma += alturasN[i];
        }
        // Agora vamos dividir a soma total por 3;
        double divisao = soma / N;
        System.out.printf("AVERAGE HEIGHT = %.2f\n", divisao);

        sc.close();
    }
}
