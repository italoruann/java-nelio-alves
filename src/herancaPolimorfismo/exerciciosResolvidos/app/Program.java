package herancaPolimorfismo.exerciciosResolvidos.app;

import herancaPolimorfismo.exerciciosResolvidos.models.entities.Funcionario;
import herancaPolimorfismo.exerciciosResolvidos.models.entities.FuncionarioTerceirizado;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            scanner.nextLine();
            System.out.println("Funcionario #" + i + " data");

            System.out.print("Outsourced (y/n)? ");
            char option = scanner.next().charAt(0);

            System.out.print("Name: ");
            String name = scanner.next();

            System.out.print("Hours: ");
            int hours = scanner.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();

            if (option == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = scanner.nextDouble();
                list.add(new FuncionarioTerceirizado(name, hours, valuePerHour, additionalCharge));
            }
            else {
                list.add(new Funcionario(name, hours, valuePerHour));
            }
        }
        System.out.println();

        for (Funcionario emp : list) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

        scanner.close();
    }
}
