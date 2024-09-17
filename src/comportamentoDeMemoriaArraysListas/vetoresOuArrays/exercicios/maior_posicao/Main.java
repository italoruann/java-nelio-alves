package comportamentoDeMemoriaArraysListas.vetoresOuArrays.exercicios.maior_posicao;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static {
        Locale.setDefault(Locale.US);
    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Quantos numeros voce vai digitar? ");
        int N = sc.nextInt();
        int posMaior = 0;
        double maior;

        double[] numeros = new double[N];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();
        }

        maior = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                posMaior = i;
            }
        }
        System.out.printf("\nMAIOR VALOR = %.1f\n", maior);
        System.out.println("POSICAO DO MAIOR VALOR = " + posMaior);

        sc.close();
    }
}
