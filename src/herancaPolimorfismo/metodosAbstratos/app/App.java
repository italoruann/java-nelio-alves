package herancaPolimorfismo.metodosAbstratos.app;

import herancaPolimorfismo.metodosAbstratos.models.entities.Circulo;
import herancaPolimorfismo.metodosAbstratos.models.entities.Forma;
import herancaPolimorfismo.metodosAbstratos.models.entities.Retangulo;
import herancaPolimorfismo.metodosAbstratos.models.entities.enums.Cor;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Forma> formaList = new ArrayList<>();

        System.out.print("Insira o número de formas: ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N ; i++) {
            scanner.nextLine();
            System.out.println("Forma #" + i + " data:");
            System.out.print("Retângulo ou Círculo? (r/c)? ");
            char tipoForma = scanner.next().toLowerCase().charAt(0);
            System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
            Cor statusCor = Cor.valueOf(scanner.next());
            if (tipoForma == 'r') {
                System.out.print("Largura: ");
                double largura = scanner.nextDouble();
                System.out.print("Altura: ");
                double altura = scanner.nextDouble();
                formaList.add(new Retangulo(altura, largura, statusCor));
            }
            else {
                System.out.print("Raio: ");
                double raio = scanner.nextDouble();
                formaList.add(new Circulo(raio, statusCor));
            }
        }
        System.out.println();
        System.out.println("Área das formas: ");
        for (Forma forma : formaList) {
            System.out.printf("%.2f\n", forma.area());
        }

        scanner.close();
    }
}
