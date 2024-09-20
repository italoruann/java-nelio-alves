package DESAFIOS_BEECROWD;

import java.io.IOException;
import java.util.Scanner;

public class BuscaNaInternet {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int link = 4;

        int t = scanner.nextInt();

        System.out.println(link * t);

        scanner.close();
    }
}
