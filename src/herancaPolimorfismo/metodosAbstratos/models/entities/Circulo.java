package herancaPolimorfismo.metodosAbstratos.models.entities;

import herancaPolimorfismo.metodosAbstratos.models.entities.enums.Cor;

public class Circulo extends Forma {

    private Double raio;

    public Circulo(Double raio, Cor cor) {
        super(cor);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    // O compilador vai apontar um erro se eu não implementar o metodo area(), pois, a superclasse tem o metodo area() abstrato.
    @Override
    public Double area() {
        return Math.PI * raio * raio;
    }
}
