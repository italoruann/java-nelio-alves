package comportamentoDeMemoriaArraysListas.vetoresOuArrays.exercicios.negativos;

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

        // Criando um vetor/array e definindo o tamanho N
        int[] numbers = new int[N];

        // Repetindo o scanner de acordo com o valor N com inicial no i
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        // Logica para verificar se é negativo
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < 0) {
                System.out.println(numbers[i]);
            }
        }

        sc.close();
    }
}
