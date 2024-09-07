package exercicios.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExEstruturaSequencial6 {
    public static void main(String[] args) {
        /*
        Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        mostre:
        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B. */

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double A, B, C, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
        final double PI = 3.14159;

        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();

        areaTriangulo = A * C / 2;
        areaCirculo = PI * Math.pow(C, 2);
        areaTrapezio = (A + B) * C / 2;
        areaQuadrado = Math.pow(B, 2);
        areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);

        input.close();
    }
}
