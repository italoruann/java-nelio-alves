package estruturacondicional.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("CÓDIGO | ESPECIFICAÇÃO | PREÇO");
        System.out.println("1 | Cachorro quente    | R$ 4.00");
        System.out.println("2 | X-Salada           | R$ 4.50");
        System.out.println("3 | X-Bacon            | R$ 5.00");
        System.out.println("4 | Torrada Simples    | R$ 2.00");
        System.out.println("5 | Refrigerante       | R$ 1.50");

        System.out.print("Código: ");
        byte codigo = sc.nextByte();
        sc.nextLine();
        System.out.print("Quantidade: ");
        byte quantidade = sc.nextByte();
        double total;

        if (codigo == 1) {
            total = quantidade * 4.00;
            System.out.printf("Total: R$ %.2f", total);
        }
        else if (codigo == 2) {
            total = quantidade * 4.50;
            System.out.printf("Total: R$ %.2f", total);
        } else if (codigo == 3) {
            total = quantidade * 5.00;
            System.out.printf("Total: R$ %.2f", total);
        }
        else if (codigo == 4) {
            total = quantidade * 2.00;
            System.out.printf("Total: R$ %.2f", total);
        }
        else {
            total = quantidade * 1.50;
            System.out.printf("Total: R$ %.2f", total);
        }

        sc.close();

    }
}
