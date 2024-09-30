package herancaPolimorfismo.heranca.entities;

public class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance); // associar aos atributos da classe mae que serao modificados
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }

    // É possivel chamar a implementação da superclasse usando a palavra super.
    // Vamos supor que na conta empresarial(businessAcount), eu quero fazer a mesma operação do withdraw da classe Account, so que descontando 2.0
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount); // A palavra super significa que estou acessando a superclasse(Account) e implementando a operação da superclasse.
        balance -= 2.0;
    }
    // Ao inves de reescrever a logica do with de Account, a gente chama essa logica com super :D
}