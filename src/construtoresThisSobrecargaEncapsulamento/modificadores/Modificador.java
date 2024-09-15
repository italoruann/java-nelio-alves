package construtoresThisSobrecargaEncapsulamento.modificadores;

public class Modificador {
    private String nome; // Atributo privado. Só pode ser acessado pelos getters e setters
    double idade; //  membro só pode ser acessado nas classes do mesmo pacote
    protected double saldo; // o membro só pode ser acessado no mesmo pacote, bem como em subclasses de pacotes diferentes
    public double altura; // Acesso permitido globalmente(ao menos que ele resida em um módulo diferente  que não exporte o pacote onde ele está)
    

}
