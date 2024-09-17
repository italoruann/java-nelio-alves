package comportamentoDeMemoriaArraysListas.vetoresOuArrays.exercicios.numeros_pares;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static {
        Locale.setDefault(Locale.US);
    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Quantos números você vai digitar? ");
        int N = sc.nextInt();

        int contador = 0;
        int[] numeros = new int[N];
        int[] numerosPares = new int[N];

        // Armazenando os numeros em um array

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println();

        // Verificar os pares
        System.out.println("NUMEROS PARES:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                numerosPares[contador] = numeros[i];
                System.out.printf("%d ", numerosPares[contador]);
                contador++;
            }
        }
        System.out.println();

        // Quantidade de pares
        System.out.println("QUANTIDADE DE PARES = " + contador);

        sc.close();
    }
}
