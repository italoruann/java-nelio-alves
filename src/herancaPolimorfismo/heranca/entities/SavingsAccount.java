package herancaPolimorfismo.heranca.entities;

public final class SavingsAccount extends Account {

    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    // Na minha classe Account, no metodo withdraw, ele tem taxa de 5.0. Porem, nao quero que tenha taxa na conta poupanca (SavingsAccount)
    // Para isso, vamos usar o mesmo metodo da classe Account, só que sobrescrita (@override)
    @Override // Override é uma anotação indicando que esse metodo foi sobrescrito/sobreposição. Override também ajuda a detectar erros.
    public final void withdraw(double amount) {
        balance -= amount;
    }
}