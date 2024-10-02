package herancaPolimorfismo.classesAbstratas.models.entities;

public class ContaPoupanca extends Conta {
    private Double taxaDeJuros;

    public ContaPoupanca(){
        super();
    }
    public ContaPoupanca(Integer numeroDaConta, String nomeDoTitular, Double saldo, Double taxaDeJuros) {
        super(numeroDaConta, nomeDoTitular, saldo);
        this.taxaDeJuros = taxaDeJuros;
    }

    public Double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(Double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    @Override // -> Polimorfismo: metodo sobrescrito.
    public final void saque(Double quantia) {
        super.saque(quantia);
    }
}
