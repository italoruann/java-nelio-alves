package introducaoPoo.exercicios.estudante;

import introducaoPoo.exercicios.estudante.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class MainEstudante {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student estudante = new Student();

        estudante.student = sc.nextLine();
        estudante.grade1 = sc.nextDouble();
        estudante.grade2 = sc.nextDouble();
        estudante.grade3 = sc.nextDouble();

        System.out.println("FINAL GRADE = " + estudante.finalGrade());

        if (estudante.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS",estudante.missingPoints());
        }
        else {
            System.out.println("PASS");
        }

        sc.close();
    }
}
