package estruturarepeticao;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        // É uma estrutura de controle que repete um blocos de comandos para um certo intervalo de valores.
        // Quando usar: quando se sabe previamente a quantidade de repetições, ou o intervalo de valores.

        Scanner sc = new Scanner(System.in);

        // inicio ; condicao ; incremento
        int repetir = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < repetir; i++) { // esse lop for é igual o lop for in range(repetir) do python.
            int num = sc.nextInt();
            soma += num;
        }
        System.out.println(soma);

        // Dá para fazer contagem regressiva
        for (int i = 4; i >= 0; i--) {
            System.out.println("Valor de i: " + i);
        }

        sc.close();
    }
}
