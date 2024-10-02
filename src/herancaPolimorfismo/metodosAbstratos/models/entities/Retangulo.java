package herancaPolimorfismo.metodosAbstratos.models.entities;

import herancaPolimorfismo.metodosAbstratos.models.entities.enums.Cor;

public class Retangulo extends Forma {
    private Double altura;
    private Double largura;

    public Retangulo(Double altura, Double largura, Cor cor) {
        super(cor);
        this.altura = altura;
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    @Override
    public Double area() {
        return altura * largura;
    }
}
