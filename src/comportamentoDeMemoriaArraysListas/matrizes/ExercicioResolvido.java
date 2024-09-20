package comportamentoDeMemoriaArraysListas.matrizes;

import java.util.Arrays;

import java.util.Scanner;

public class ExercicioResolvido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] matrices = new int[n][n];

        // Para percorrer matrizes, precisamos percorrer  alinha e coluna. Para isso, vamos utilizar dois for
        for (int l = 0; l < matrices.length; l++) {

            for (int c = 0; c < matrices[l].length; c++) {
                matrices[l][c] = scanner.nextInt();
            }
        }
        System.out.println("Main diagonal:");
        for (int i = 0; i < matrices.length; i++) {
            System.out.print(matrices[i][i] + " ");
        }
        int cont = 0;
        for (int i = 0; i < matrices.length; i++) {
            for (int j = 0; j < matrices[i].length; j++) {
                if (matrices[i][j] < 0) {
                    cont++;
                }
            }
        }
        System.out.println("\nNegative numbers = " + cont);

        scanner.close();
    }
}
