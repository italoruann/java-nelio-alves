package listas.exercicio.application;

import comportamentoDeMemoriaArraysListas.listas.exercicio.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();
        Employee employee;

        System.out.print("How many employees will be registered? ");
        int N = scanner.nextInt();

        int contador = 1;
        for (int i = 0; i < N; i++) {
            System.out.printf("\nFuncionario #%d\n", contador);

            System.out.print("Id: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            while (existsId(employeeList, id)) {
                System.out.print("Id exists. Enter it again: ");
                id = scanner.nextInt();
            }

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            employee = new Employee(id, name,salary);

            employeeList.add(employee);

            contador++;
        }
        System.out.println();

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = scanner.nextInt();
        Employee emp = employeeList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("This id does not exist!\n");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = scanner.nextDouble();
            emp.increaseSalary(percentage);
            System.out.println();
        }

        System.out.println("List of employees:");
        for (Employee func : employeeList) {
            System.out.println(func.toString());
        }

        scanner.close();
    }

    static boolean existsId(List<Employee> employeeList, int id) {
        Employee emp = employeeList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
