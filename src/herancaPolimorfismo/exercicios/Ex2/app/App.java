package herancaPolimorfismo.exercicios.Ex2.app;

import herancaPolimorfismo.exercicios.Ex2.models.entities.Contribuinte;
import herancaPolimorfismo.exercicios.Ex2.models.entities.Individual;
import herancaPolimorfismo.exercicios.Ex2.models.entities.Empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Contribuinte> contribuinteList = new ArrayList<>();

        System.out.print("Insira o número de contribuintes: ");
        int N = scanner.nextInt();
        for (int i = 1; i <= N ; i++) {
            scanner.nextLine();
            System.out.println("Taxa contribuinte #" + i + " dados:");
            System.out.print("Individual ou empresa (i/c)? ");
            char opcao = scanner.next().charAt(0);
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("Renda Anual: ");
            double rendaAnual = scanner.nextDouble();
            if (opcao == 'i') {
                System.out.print("Despesas com saúde: ");
                double despesasComSaude = scanner.nextDouble();
                contribuinteList.add(new Individual(nome, rendaAnual, despesasComSaude));

            }
            else {
                System.out.print("Número de funcionários: ");
                int numeroDeFuncionarios = scanner.nextInt();
                contribuinteList.add(new Empresa(nome, rendaAnual, numeroDeFuncionarios));
            }
        }
        double soma = 0.0;
        System.out.println();
        System.out.println("IMPOSTOS PAGOS:");
        for (Contribuinte contribuinte : contribuinteList) {
            System.out.printf("%s: R$ %.2f\n", contribuinte.getName(), contribuinte.imposto());
            soma += contribuinte.imposto();
        }
        System.out.println();
        System.out.printf("Impostos totais: R$%.2f", soma);

        scanner.close();
    }
}
