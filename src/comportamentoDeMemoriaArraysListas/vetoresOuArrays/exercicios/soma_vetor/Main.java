package comportamentoDeMemoriaArraysListas.vetoresOuArrays.exercicios.soma_vetor;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    static {
        Locale.setDefault(Locale.US);
    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Quantos números você quer digitar? ");
        int N = sc.nextInt();

        double[] numerosReais = new double[N];

        double soma, media;

        for (int i = 0; i < numerosReais.length; i++) {
            System.out.print("Digite um número: ");
            numerosReais[i] = sc.nextDouble();
        }
        System.out.println();

        // Todos os elementos do vetor
        System.out.print("VALORES: ");
        for (int i = 0; i < numerosReais.length; i++) {
            System.out.printf("%.1f " ,numerosReais[i]);
        }
        System.out.println();

        // Soma
        soma = 0;
        for (int i = 0; i < numerosReais.length; i++) {
            soma += numerosReais[i];
        }
        System.out.printf("SOMA: %.2f\n", soma);

        // media
        media = soma / numerosReais.length;
        System.out.printf("MEDIA: %.2f", media);

        sc.close();
    }
}
