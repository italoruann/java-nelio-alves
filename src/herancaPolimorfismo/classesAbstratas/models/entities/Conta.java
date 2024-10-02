package herancaPolimorfismo.classesAbstratas.models.entities;

// classe genérica
// Classe abstrata não pode ser instanciada
// Exemplo: Vai existir conta poupança, conta comum e conta para empresas. A conta vai ser apenas para encapsular operações e fazer metodos que podem ser usados
// em outras subclasses.


public abstract class Conta {
    private Integer numeroDaConta;
    private String nomeDoTitular;
    protected Double saldo;

    public Conta() {
    }

    public Conta(Integer numeroDaConta, String nomeDoTitular, Double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public void saque(Double quantia) {
        saldo -= quantia + 5.0;
    }

    public void depositar(Double quantia) {
        saldo += quantia;
    }

}
