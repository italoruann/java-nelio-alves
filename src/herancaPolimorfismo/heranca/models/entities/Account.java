package herancaPolimorfismo.heranca.models.entities;

// Herança é um tipo de associação que permite que uma classe herde TODOS os dados e comportamentos de outra.
// Vantagens: Reuso e polimorfismo.
// Sintaxe: class A extends B

public class Account {
    // class pai/mae
    // superclass (class base)
    // Herança é uma associação entre classes (e não entre objetos)
    private Integer number;
    private String holder;
    protected Double balance; // Permite importar esse atributo que seja do mesmo pacote ou que seja herdada por uma subclasse.

    public Account() {
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
