package herancaPolimorfismo.heranca.application;


import herancaPolimorfismo.heranca.entities.Account;
import herancaPolimorfismo.heranca.entities.BusinessAccount;
import herancaPolimorfismo.heranca.entities.SavingsAccount;

public class Program {

    public static void main(String[] args) {

        Account acc1 = new Account(1000, "Italo", 5000.0); // taxa de saque de 5.0
        acc1.withdraw(500.0);
        System.out.println(acc1.getBalance());

        // upcasting
        Account acc2 = new SavingsAccount(1001, "Vitoria", 5000.0, 0.01); // sen taxa de saque
        acc2.withdraw(500.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1002, "Bob", 5000.0, 500.0); // taxa de 5.0 do Account e 2.0 do BusinessAccount.
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
    }
}