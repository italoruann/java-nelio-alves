package exercicios.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExEstruturaSequencial2 {
    public static void main(String[] args) {
        /*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        casas decimais conforme exemplos.

        Fórmula da área: area = π . raio2

        Considere o valor de π = 3.14159 */

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        // criando uma constante, ou seja, o valor nao pode ser alterado.
        final double pi = 3.14159;
        double area, raio;

        raio = input.nextDouble();

        area = pi * Math.pow(raio, 2);

        System.out.printf("A=%.4f", area);

        input.close();

    }
}
