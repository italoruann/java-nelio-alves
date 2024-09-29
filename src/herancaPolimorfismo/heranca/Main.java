package herancaPolimorfismo.heranca;

import herancaPolimorfismo.heranca.models.entities.Account;
import herancaPolimorfismo.heranca.models.entities.BusinessAcount;
import herancaPolimorfismo.heranca.models.entities.enums.AccountStatus;

import java.util.Locale;
import java.util.Scanner;

// Obs: codigo demonstrativo. Questões didaticas, alguns metodosnão funcionam.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dados do cliente:");
        System.out.print("Informe o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Informe o nome do titular: ");
        String titular = scanner.nextLine();
        System.out.print("Informe o saldo da sua conta: ");
        double saldo = scanner.nextDouble();
        System.out.print("Tipo da conta: ");

        Account conta = new Account(numeroConta, titular, saldo);

        AccountStatus status = AccountStatus.valueOf(scanner.next());
        if (status == AccountStatus.valueOf("BUSINESS")) {
            System.out.print("Informe o limite de empréstimo: ");
            double loanLimit = scanner.nextDouble();
            System.out.print("Informe uma quantia: ");
            double quantia = scanner.nextDouble();

            BusinessAcount contaEmpresarial = new BusinessAcount(numeroConta, titular, saldo, loanLimit);
            contaEmpresarial.loan(quantia);

            System.out.println(conta + "" + contaEmpresarial);
        }
        else {

            System.out.print("Informe uma quantia de saque: ");
            double quantia = scanner.nextDouble();
            conta.withDraw(quantia);
            System.out.print("Informe uma quantia de depósito: ");
            double deposito = scanner.nextDouble();
            conta.deposit(deposito);

            System.out.println(conta);
        }

    }
}
