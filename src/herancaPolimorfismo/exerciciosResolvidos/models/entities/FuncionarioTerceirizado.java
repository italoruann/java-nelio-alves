package herancaPolimorfismo.exerciciosResolvidos.models.entities;

public class FuncionarioTerceirizado extends Funcionario { // funcionario terceirizado
    private Double additionalCharge; //despesa adicional

    public FuncionarioTerceirizado() {
        super();
    }

    public FuncionarioTerceirizado(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public final Double payment() {
        return super.payment() + additionalCharge * 1.1;
    }

}
