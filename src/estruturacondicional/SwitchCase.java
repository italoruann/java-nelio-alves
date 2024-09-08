package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        // Temos outra sintaxe de estrutura condicional que tbm é muito usada que é o switch case
//        Quando se tem várias opções de fluxo a serem tratadas com base no
//        valor de uma variável, ao invés de várias estruturas if-else encadeadas,
//                alguns preferem utilizar a estrutura switch-case
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Problema exemplo:
        // Fazer um programa para ler um valor inteiro de 1 a 7 representando um
        //dia da semana (sendo 1=domingo, 2=segunda, e assim por diante).
        //Escrever na tela o dia da semana correspondente, conforme exemplos.

        // Feito com if,else if, else
        int numero = sc.nextInt();
        String dia;

        if (numero == 1) {
            dia = "domingo";
        } else if (numero == 2) {
            dia = "segunda";
        } else if (numero == 3) {
            dia = "terça";
        } else if (numero == 4) {
            dia = "quarta";
        } else if (numero == 5) {
            dia = "quinta";
        } else if (numero == 6) {
            dia = "sexta";
        } else if (numero == 7) {
            dia = "sábado";
        } else {
            dia = "valor inválido";
        }

        System.out.println("Dia da semana: " + dia);

        // Utilizando switch case
        // Essa é a forma mais legível caso tenha varias opções encadeadas
        dia = switch (numero) {
            case 1 -> "domingo";
            case 2 -> "segunda";
            case 3 -> "terça";
            case 4 -> "quarta";
            case 5 -> "quinta";
            case 6 -> "sexta";
            case 7 -> "sábado";
            default -> "valor inválido";
        };
        System.out.println("Dia da semana: "+ dia);

        sc.close();

    }

}
