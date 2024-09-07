package estruturacondicional.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        // Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int num;

        num = input.nextInt();

        if (num % 2 == 0 ) {
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }

        input.close();
    }
}
