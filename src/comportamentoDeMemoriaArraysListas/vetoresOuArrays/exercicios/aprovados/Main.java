package comportamentoDeMemoriaArraysListas.vetoresOuArrays.exercicios.aprovados;

import comportamentoDeMemoriaArraysListas.vetoresOuArrays.exercicios.aprovados.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static {
        Locale.setDefault(Locale.US);
    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int contador = 1;

        System.out.print("Quantos alunos serao digitados? ");
        int N = sc.nextInt();

        Student[] estudante = new Student[N];

        for (int i = 0; i < estudante.length; i++) {
            sc.nextLine();
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", contador);

            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();

            estudante[i] = new Student(nome, nota1, nota2);
            contador++;
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < estudante.length; i++) {

            if (estudante[i].calcularMedia() >= 6.0) {
                System.out.println(estudante[i].getName());
            }
        }

        sc.close();
    }
}
