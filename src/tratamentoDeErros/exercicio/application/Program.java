package tratamentoDeErros.exercicio.application;

import tratamentoDeErros.exercicio.models.entities.Account;
import tratamentoDeErros.exercicio.models.exceptions.BusinessException;
import tratamentoDeErros.model.exceptions.DomainException;


import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Informe os dados da conta");
            System.out.print("Numero: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Titular: ");
            String holder = sc.nextLine();
            System.out.print("Saldo inicial: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Limite de saque: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.println();
            System.out.print("Informe uma quantia para sacar: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
            System.out.printf("Novo saldo: %.2f", account.getBalance());

        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
