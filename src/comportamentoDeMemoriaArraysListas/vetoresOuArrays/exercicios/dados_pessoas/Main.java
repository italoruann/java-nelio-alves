package comportamentoDeMemoriaArraysListas.vetoresOuArrays.exercicios.dados_pessoas;

import comportamentoDeMemoriaArraysListas.vetoresOuArrays.exercicios.dados_pessoas.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static {
        Locale.setDefault(Locale.US);
    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int contador = 1;
        double menorAltura;
        double maiorAltura;
        double soma;
        double media;
        int numHomens;

        System.out.print("Quantas pessoas serao digitadas? ");
        int N = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[N];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.printf("Altura da %da pessoa: ", contador);
            double altura = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", contador);
            char genero = sc.next().charAt(0);

            pessoas[i] = new Pessoa(altura, genero);

            contador++;
        }

        menorAltura = pessoas[0].getAltura();
        maiorAltura = pessoas[0].getAltura();

        for (int i = 1; i < pessoas.length; i++) {
            if (pessoas[i].getAltura() < menorAltura) {
                menorAltura = pessoas[i].getAltura();
            }
            if (pessoas[i].getAltura() > maiorAltura) {
                maiorAltura = pessoas[i].getAltura();
            }
        }
        System.out.printf("Menor altura: %.2f\n", menorAltura);
        System.out.printf("Maior altura: %.2f\n", maiorAltura);

        // Media das alturas das mulheres
        soma = 0;
        contador = 0;
        numHomens = 0;
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getGenero() == 'F') {
                soma += pessoas[i].getAltura();
                contador++;
            } else {
                numHomens++;
            }
        }
        media = soma / contador;
        System.out.printf("Media das alturas das mulheres = %.2f\n", media);
        System.out.println("Numero de homens = " + numHomens);

        sc.close();
    }
}
