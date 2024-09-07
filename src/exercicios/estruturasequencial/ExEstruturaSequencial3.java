package exercicios.estruturasequencial;

import java.util.Scanner;


public class ExEstruturaSequencial3 {
    public static void main(String[] args) {
        /* Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).   */

        Scanner input = new Scanner(System.in);

        int A, B, C, D, total;

        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();

        total = A * B - C * D;

        System.out.printf("DIFERENÇA =  %d", total);

        input.close();

    }
}
