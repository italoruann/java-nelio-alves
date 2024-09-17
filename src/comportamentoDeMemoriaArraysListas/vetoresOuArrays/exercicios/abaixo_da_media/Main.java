package comportamentoDeMemoriaArraysListas.vetoresOuArrays.exercicios.abaixo_da_media;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static {
        Locale.setDefault(Locale.US);
    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Quantos elementos vai ter o vetor?: ");
        int N = sc.nextInt();

        double[] vetorN = new double[N];
        double soma = 0.0;
        double media;

        for (int i = 0; i < vetorN.length; i++) {
            System.out.print("Digite um numero: ");
            vetorN[i] = sc.nextDouble();
            soma += vetorN[i];
        }
        System.out.println();

        media = soma / vetorN.length;
        System.out.printf("MEDIA DO VETOR = %.3f\n", media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < vetorN.length; i++) {
            if(vetorN[i] < media) {
                System.out.println(vetorN[i]);
            }
        }
        sc.close();
    }
}
