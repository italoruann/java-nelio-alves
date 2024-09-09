package estruturarepeticao;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
    // Estrutura de controle que repete um bloco de comandos enquanto uma condição for verdadeira.

        Scanner sc = new Scanner(System.in);
        
        int cont = 0;

        // Usando  o true
        while (true) {
            int num = sc.nextInt();
            cont += num;

            if (num == 0) {
                System.out.println(cont);
                break;
            }
        }

        // Usando uma condição
        int contSoma = 0;
        int num2 = sc.nextInt();
        while (num2 != 0) {
            contSoma += num2;
            num2 = sc.nextInt();
        }
        System.out.println(contSoma);

        sc.close();

    }
}
