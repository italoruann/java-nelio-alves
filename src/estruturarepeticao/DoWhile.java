package estruturarepeticao;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // Menos utilizada, mas em alguns casos se encaixa melhor ao problema.
        // O bloco de comandos so executa pelo menos uma vez, pois a condição é verificada no final.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char res;

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            float C = sc.nextFloat();
            double F = (9.0 * C / 5) + 32;

            System.out.printf("Equivalente em Fahrenheit: %.1f\n", F);
            System.out.print("Deseja repetir? s/n ");

            res = sc.next().charAt(0);

        } while (res != 'n');

        sc.close();

    }
}
