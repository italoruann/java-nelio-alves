package herancaPolimorfismo.polimorfismo.models.entities;

public class Cachorro extends Animal {
    private int ossosComidos;

    public Cachorro() {
        super();
    }

    public Cachorro(String nome, String raca, int ossosComidos) {
        super(nome, raca);
        this.ossosComidos = ossosComidos;
    }

    public int getOssosComidos() {
        return ossosComidos;
    }

    public void setOssosComidos(int ossosComidos) {
        this.ossosComidos = ossosComidos;
    }

    public void latir() {
        System.out.println("Cachorro está latindo");
    }

    @Override
    public void comer() {
        System.out.println("Cachorro está comendo.");
    }
}
