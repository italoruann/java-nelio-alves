package construtoresThisSobrecargaEncapsulamento.sobrecarga;

import construtoresThisSobrecargaEncapsulamento.sobrecarga.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // É um recurso que uma classe possui de oferecer mais de uma
        //operação com o mesmo nome, porém com diferentes listas de
        //parâmetros.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        Pessoa pessoa = new Pessoa(nome, idade, altura);

        System.out.println(pessoa);

        // Agora vamos supor q quero especificar meu salario, que por padrão, era 0.0
        System.out.print("Salario: ");
        double salario = sc.nextDouble();

        pessoa.adicionarSalario(salario);

        System.out.println(pessoa);

        sc.close();

    }
}
