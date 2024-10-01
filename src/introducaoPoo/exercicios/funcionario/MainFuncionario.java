package introducaoPoo.exercicios.funcionario;

import introducaoPoo.exercicios.funcionario.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class MainFuncionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee funcionario = new Employee();

        System.out.print("Name: ");
        funcionario.name = sc.nextLine();

        System.out.print("Gross salary: ");
        funcionario.glossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        funcionario.tax = sc.nextDouble();

        System.out.println();
        
        System.out.println("Funcionario: " + funcionario);

        System.out.println();

        System.out.print("Which percentage to increase salary? ");
        double tax = sc.nextDouble();
        funcionario.increaseSalary(tax);

        System.out.println();

        System.out.println("Update data: " + funcionario);

        sc.close();
    }
}
