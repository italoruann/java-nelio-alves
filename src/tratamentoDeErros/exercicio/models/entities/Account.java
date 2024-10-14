package tratamentoDeErros.exercicio.models.entities;

import tratamentoDeErros.exercicio.models.exceptions.BusinessException;

public class Account {
    private final Integer number;
    private String holder;
    private Double balance;
    private final Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
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

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount) {
        balance += amount;
    }
    public void withdraw(Double amount) {
        validateWithdraw(amount);
        balance -= amount;
    }

    // Criando uma função privada para tratar os erros relacionados ao withDraw
    private void validateWithdraw(Double amount) {
        if (amount > getWithdrawLimit()) {
            throw new BusinessException("Erro de saque: A quantia excede o limite de saque");
        }
        if (amount > getBalance()) {
            throw  new BusinessException("Erro de saque: Saldo insuficiente");
        }
    }
}
