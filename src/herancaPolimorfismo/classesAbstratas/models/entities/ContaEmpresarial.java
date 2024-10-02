package herancaPolimorfismo.classesAbstratas.models.entities;

public class ContaEmpresarial extends Conta {
    private Double limiteDeEmprestino;

    public ContaEmpresarial() {
        super();
    }

    public ContaEmpresarial(Integer numeroDaConta, String nomeDoTitular, Double saldo, Double limiteDeEmprestino) {
        super(numeroDaConta, nomeDoTitular, saldo);
        this.limiteDeEmprestino = limiteDeEmprestino;
    }


    public Double getLimiteDeEmprestino() {
        return limiteDeEmprestino;
    }

    public void setLimiteDeEmprestino(Double limiteDeEmprestino) {
        this.limiteDeEmprestino = limiteDeEmprestino;
    }

    public void emprestimo(Double quantia) {
        if (quantia <= limiteDeEmprestino) {
            saldo += quantia - 10.0;
        }
    }

    @Override // -> Polimorfismo: metodo sobrescrito.
    public final void saque(Double quantia) {
        super.saque(quantia);
        saldo -= 2.0;
    }
}
