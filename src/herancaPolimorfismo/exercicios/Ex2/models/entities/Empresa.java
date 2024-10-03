package herancaPolimorfismo.exercicios.Ex2.models.entities;

public class Empresa extends Contribuinte {
    private Integer numeroDeFuncionarios;

    public Empresa(String name, Double rendaAnual, Integer numeroDeFuncionarios) {
        super(name, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public Integer getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public final Double imposto() {
        double total = 0.0;
        if (numeroDeFuncionarios < 10) {
            total = rendaAnual * 0.16;
        }
        else {
            total = rendaAnual * 0.14;
        }
        return total;
    }
}
