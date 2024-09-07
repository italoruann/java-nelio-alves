package exercicios.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExEstruturaSequencial5 {
    public static void main(String[] args) {
        /*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int codigopeca1, codigopeca2;
        byte numPeca1, numPeca2;
        double valorUnitario1, valorUnitario2, total;

        codigopeca1 = input.nextInt();
        numPeca1 = input.nextByte();
        valorUnitario1 = input.nextDouble();

        codigopeca2 = input.nextInt();
        numPeca2 = input.nextByte();
        valorUnitario2 = input.nextDouble();

        total = (numPeca1 * valorUnitario1) + (numPeca2 * valorUnitario2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", total);

        input.close();
    }
}
