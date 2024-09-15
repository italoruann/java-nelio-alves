package construtoresThisSobrecargaEncapsulamento.exercicios.entitites;

public class BankAccount {
    private final int accountNumber;
    private String holderAccount;
    private double balance;
    private static final double TAX = 5.00;


    public BankAccount(int accountNumber, String holderAccount) {
        this.accountNumber = accountNumber;
        this.holderAccount = holderAccount;
    }

    public BankAccount(int accountNumber, String holderAccount, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.holderAccount = holderAccount;
        deposit(initialDeposit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderAccount() {
        return holderAccount;
    }

    public void setHolderAccount(String holderAccount) {
        this.holderAccount = holderAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + TAX;
    }

    public String toString() {
        return "Account " + accountNumber + ", " +
                "Holder: " + holderAccount + ", " +
                String.format("Balance: $ %.2f", balance);
    }

}
