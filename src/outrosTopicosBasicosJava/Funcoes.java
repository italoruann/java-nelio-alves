package outrosTopicosBasicosJava;

import java.util.Locale;
import java.util.Scanner;

public class Funcoes {
    public static void main(String[] args) {
         /*•Representam um processamento que possui um significado
         •Math.sqrt(double)
         • System.out.println(string)
         •Principais vantagens: modularização, delegação e reaproveitamento
         •Dados de entrada e saída
         • Funções podem receber dados de entrada (parâmetros ou argumentos)
         • Funções podem ou não retornar uma saída
         •em orientação a objetos, funções em classes recebem o nome de "métodos*/

        // soma
        int res = soma(3, 5);
        System.out.println(res);

        // divisão
        Funcoes dividir = new Funcoes();
        float res1 = dividir.divisao(3.3F, 4.4F);
        System.out.println(res1);

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int resposta = maior(num1, num2, num3);

        mostrarResultado(resposta);

        sc.close();

    }

    public static int soma(int a, int b) { // a palavra static significa que n preciso instanciar e criar objeto.
        return a + b;
    }

    public float divisao(float a, float b) { // public signifca que posso acessar de outras classes
        return  a / b;
    }

    public static int maior(int a, int b, int c) {
        int res; // variavel local q so vai existir na função, depois, deixa de existir.
        if (a > b && a > c) {
            res = a;
        } else if (b > c) {
            res = b;
        } else {
            res = c;
        }
        return res;
    }
    public static void mostrarResultado(int valor) { // void significa que n vai retornar nada
        System.out.println("Maior " + valor);
    }
}
