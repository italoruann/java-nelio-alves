package herancaPolimorfismo.heranca;


import herancaPolimorfismo.heranca.models.entities.BusinessAccount;

// Obs: codigo demonstrativo. Questões didaticas, alguns metodosnão funcionam.
public class Main {
    public static void main(String[] args) {

        BusinessAccount account = new BusinessAccount(8010, "Bob Brown", 0.0, 500.0);

        System.out.println(account.getBalance());
    }

}
