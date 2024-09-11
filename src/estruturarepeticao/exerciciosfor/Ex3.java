package estruturarepeticao.exerciciosfor;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        /*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
        de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
        conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
        peso 5.*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        for (int i = 0; i < N; i++) {
            double caso1 = sc.nextDouble();
            double caso2 = sc.nextDouble();
            double caso3 = sc.nextDouble();

            double media = ((caso1 * 2) + (caso2 * 3) + (caso3 * 5)) / (2 + 3 + 5);

            System.out.printf("%.1f\n", media);
        }

        sc.close();
    }
}