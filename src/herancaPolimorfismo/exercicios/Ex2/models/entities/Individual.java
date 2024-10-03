package herancaPolimorfismo.exercicios.Ex2.models.entities;

public class Individual extends Contribuinte {
    private Double gastosComSaude;

    public Individual(String name, Double rendaAnual, Double gastosComSaude) {
        super(name, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public final Double imposto() {
        double total = 0.0;
        if (rendaAnual < 20000.00) {
            total = rendaAnual * 0.15 - gastosComSaude * 0.50;
        }
        else {
            total = rendaAnual * 0.25 - gastosComSaude * 0.50;
        }
        return total;
    }
}
