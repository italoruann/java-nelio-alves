package herancaPolimorfismo.polimorfismo.application;

import herancaPolimorfismo.polimorfismo.models.entities.Animal;
import herancaPolimorfismo.polimorfismo.models.entities.Cachorro;
import herancaPolimorfismo.polimorfismo.models.entities.Gato;

public class App {
    public static void main(String[] args) {
        // Upcasting
        Animal cachorro = new Cachorro("Bob", "Pitbull", 30);
        Animal gato = new Gato("Felícia", "Cianês", 4);

        // Sabemos que o cachorro ele come e late
        cachorro.comer(); // O metodo comer se origina da super classe Animal, ou seja, é um metodo sobrescrito, dando o nome de polimorfismo.
        gato.comer();
        System.out.println();

        // E se eu quiser que meu cachorro do tipo animal ele late? Ai fazemos um downcasting
        // Ou seja, meu cachorro vai latir e comer, pq eu converti minha superclasse para subclasse
        Cachorro cachorro1 = (Cachorro) cachorro;
        cachorro1.latir();
        cachorro1.comer();
        System.out.println(cachorro1.getOssosComidos());
        System.out.println();

        // E meu gato? Ele come e mia também. Então vamos fazer um downcasting
        if (gato instanceof Gato) { // esse bloco de comando é sempre verdadeiro.
            Gato gato1 = (Gato) gato;
            gato1.miar();
            gato1.comer();
            System.out.println(gato1.getRatosCapturados());
        }
    }
}
