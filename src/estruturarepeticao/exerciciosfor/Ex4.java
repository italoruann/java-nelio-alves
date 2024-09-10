package estruturarepeticao.exerciciosfor;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        /*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
        segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int primeiro = sc.nextInt();
            int segundo = sc.nextInt();



            if (segundo == 0) {
                System.out.println("divisao impossivel");
            } else {

                double res = (double) primeiro / segundo;
                System.out.printf("%.1f\n", res);
            }

        }

        sc.close();
    }
}
