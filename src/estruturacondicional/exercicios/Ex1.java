package estruturacondicional.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int num;

        num = input.nextInt();

        if (num < 0) {
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("NAO NEGATIVO");
        }

        input.close();
    }
}
