package construtoresThisSobrecargaEncapsulamento.exercicios;

import construtoresThisSobrecargaEncapsulamento.exercicios.entitites.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    static {
        Locale.setDefault(Locale.US);
    }

    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the account number: ");
        int accountNumber = SC.nextInt();
        SC.nextLine();

        System.out.print("Enter the name of the account holder: ");
        String accountHolder = SC.nextLine();
        System.out.println();

        System.out.print("Would you like to make an initial deposit? (y/n) ");
        char res = SC.next().charAt(0);
        System.out.println();

        BankAccount bankAccount;

        if (res == 'y') {
            System.out.print("Enter initial deposit value: ");
            double depositInitial = SC.nextDouble();
            System.out.println("Account Data:");
            bankAccount = new BankAccount(accountNumber, accountHolder, depositInitial);
            System.out.println(bankAccount);
        } else {
            System.out.println("Account Data:");
            bankAccount = new BankAccount(accountNumber, accountHolder);
            System.out.println(bankAccount);
        }
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double depositValue = SC.nextDouble();
        bankAccount.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(bankAccount);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withDraw = SC.nextDouble();
        bankAccount.withdraw(withDraw);
        System.out.println("Updated account data:");
        System.out.println(bankAccount);

        SC.close();

    }
}
