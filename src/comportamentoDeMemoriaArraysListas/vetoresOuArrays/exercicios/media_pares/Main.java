package comportamentoDeMemoriaArraysListas.vetoresOuArrays.exercicios.media_pares;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    static {
        Locale.setDefault(Locale.US);
    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int contadorPares = 0;
        int contadorImpares = 0;
        int soma = 0;
        double media;

        System.out.print("Quantos elementos vai ter o vetor? ");
        int N = sc.nextInt();

        int[] vetorN = new int[N];


        // Verificar se sao pares
        for (int i = 0; i < vetorN.length; i++) {
            System.out.print("Digite um numero: ");
            vetorN[i] = sc.nextInt();

            if (vetorN[i] % 2 == 0) {
                soma += vetorN[i];
                contadorPares++;
            }
            //Verificar se todos os numeros sao impares
            else {
                contadorImpares++;
            }
        }

        if (vetorN.length == contadorImpares) {
            System.out.println("NENHUM NUMERO PAR");
        }
        else {
            media = ((double) soma / contadorPares);
            System.out.printf("MEDIA DOS PARES = %.1f", media);
        }

        sc.close();
    }
}
