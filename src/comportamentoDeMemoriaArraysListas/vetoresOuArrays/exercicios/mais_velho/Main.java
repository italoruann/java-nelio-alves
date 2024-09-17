package comportamentoDeMemoriaArraysListas.vetoresOuArrays.exercicios.mais_velho;



import comportamentoDeMemoriaArraysListas.vetoresOuArrays.exercicios.mais_velho.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static {
        Locale.setDefault(Locale.US);
    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String name;
        String pessoaVelha;
        int contador = 1;
        int age;
        int maior;

        System.out.print("Quantas pessoas voce vai digitar? ");
        int N = sc.nextInt();

        Person[] pessoa = new Person[N];

        for (int i = 0; i < pessoa.length; i++) {
            sc.nextLine();
            System.out.printf("Dados da %da pessoa:\n", contador);
            System.out.print("Nome: ");
            name = sc.nextLine();
            System.out.print("Idade: ");
            age = sc.nextInt();

            pessoa[i] = new Person(name, age);

            contador++;
        }
        maior = pessoa[0].getAge();
        pessoaVelha = pessoa[0].getName();
        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i].getAge() > maior) {
                maior = pessoa[i].getAge();
                pessoaVelha = pessoa[i].getName();
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + pessoaVelha);

        sc.close();
    }
}
