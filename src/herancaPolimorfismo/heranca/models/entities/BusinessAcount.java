package herancaPolimorfismo.heranca.models.entities;

public class BusinessAcount extends Account {
    private Double loanLimit;

    public BusinessAcount(){
        super();
    }

    public BusinessAcount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance); // associar aos atributos da classe mae que serao modificados
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void loan(Double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }
        else {
            System.out.println("Empréstimo negado.");
        }
    }

    public String toString() {
        return "Limite de empréstimo: " + String.format("%.2f", loanLimit);
    }
}
