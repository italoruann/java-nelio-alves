package construtoresThisSobrecargaEncapsulamento.encapsulamento;

import construtoresThisSobrecargaEncapsulamento.encapsulamento.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String produto = sc.nextLine();

        System.out.print("Preço do produto: ");
        double preco= sc.nextDouble();
        System.out.println();

        Product product = new Product(produto, preco);

        System.out.println("Dados: " + product);
        System.out.println();

        System.out.print("Digite a quantidade de unidade a ser adicionada: ");
        int quantidade = sc.nextInt();
        product.addProducts(quantidade);
        System.out.println();

        System.out.println("Dados atualizados: " + product);
        System.out.println();

        System.out.print("Digite a quantidade de unidade a ser removida: ");
        quantidade = sc.nextInt();
        product.removeProducts(quantidade);
        System.out.println();

        System.out.println("Dados atualizados: " + product);
        System.out.println();

        System.out.print("Digite outro produto: ");
        sc.nextLine();
        produto = sc.nextLine();
        product.setProductName(produto);
        System.out.println();

        System.out.print("Digite um novo preço: ");
        preco = sc.nextDouble();
        product.setPriceProduct(preco);
        System.out.println();

        System.out.printf("Dados do novo produto: %s R$ %.2f %d unidades", product.getProductName(), product.getPriceProduct(), product.getQuantityProduct());
        System.out.println();

        System.out.print("Adicione a quantidade da nova remessa: ");
        quantidade = sc.nextInt();
        product.addProducts(quantidade);
        System.out.println();

        System.out.print("Remova a quantidade da nova remessa: ");
        quantidade = sc.nextInt();
        product.removeProducts(quantidade);
        System.out.println();

        System.out.println("Dados finais: " + product);

        sc.close();

    }
}
