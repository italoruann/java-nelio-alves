package comportamentoDeMemoriaArraysListas.vetoresOuArrays.exercicios.alturas;

import comportamentoDeMemoriaArraysListas.vetoresOuArrays.exercicios.alturas.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    static {
        Locale.setDefault(Locale.US);
    }
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Quantas pessoas serão digitadas? ");
        int Npessoas = sc.nextInt();
        double soma, media;
        int contador = 1;

        Person[] persons = new Person[Npessoas];

        for (int i = 0; i < persons.length; i++) {
            System.out.printf("Dados da %da pessoa\n", contador);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            persons[i] = new Person(nome, idade, altura);
            contador += 1;
        }
        System.out.println();

        // Calcular a altura média
        soma = 0;
        for (int i = 0; i < persons.length; i++) {
            soma += persons[i].getHeight();
        }
        media = soma / persons.length;
        System.out.printf("Altura média: %.2f\n", media);
        // Contar e mostrar pessoas com menos de 16 anos
        int countMenores = 0;
        String[] menores = new String[Npessoas];
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getAge() < 16) {
                menores[countMenores] = persons[i].getName();
                countMenores++;
            }
        }
        // Calcular o percentual de menores de 16 anos
        double percentualMenores = (double) countMenores / persons.length * 100.0;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        // Imprimir os nomes das pessoas menores de 16 anos
        for (int i = 0; i < countMenores; i++) {
            System.out.println(menores[i]);
        }
        sc.close();
    }
}
