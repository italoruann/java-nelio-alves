package enumeracoesComposicoes.exerciciosResolvidos.Ex1.application;

import enumeracoesComposicoes.exerciciosResolvidos.Ex1.entities.Department;
import enumeracoesComposicoes.exerciciosResolvidos.Ex1.entities.HourContract;
import enumeracoesComposicoes.exerciciosResolvidos.Ex1.entities.Worker;
import enumeracoesComposicoes.exerciciosResolvidos.Ex1.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;


import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        String departmentName = scanner.nextLine();

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String workName = scanner.nextLine();
        System.out.print("Level: ");
        String workLevel = scanner.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = scanner.nextDouble();

        Worker worker = new Worker(workName, WorkerLevel.valueOf(workLevel), baseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println("Enter contract #" + i + " data");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(scanner.next());
            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = scanner.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }
        System.out.println();

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = scanner.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));


        scanner.close();
    }
}
