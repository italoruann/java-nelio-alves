package DESAFIOS_BEECROWD;

import java.util.Scanner;

public class IdentificarCha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tipoCha = scanner.nextInt();

        int[] respostasCompetitor = new int[5];

        for (int i = 0; i < respostasCompetitor.length; i++) {
            respostasCompetitor[i] = scanner.nextInt();
        }

        int corretas = 0;
        for (int resposta : respostasCompetitor) {
            if (resposta == tipoCha) {
                corretas++;
            }
        }

        System.out.println(corretas);

        scanner.close();
    }
}
