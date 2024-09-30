package herancaPolimorfismo.polimorfismo.models.entities;

public class Gato extends Animal {
    private int ratosCapturados;

    public Gato() {
        super();
    }

    public Gato(String nome, String raca, int ratosCapturados) {
        super(nome, raca);
        this.ratosCapturados = ratosCapturados;
    }

    public int getRatosCapturados() {
        return ratosCapturados;
    }

    public void setRatosCapturados(int ratosCapturados) {
        this.ratosCapturados = ratosCapturados;
    }

    public void miar() {
        System.out.println("Gato está miando.");
    }

    @Override
    public void comer() {
        System.out.println("Gato está comendo.");
    }
}
