package comportamentoDeMemoriaArraysListas.vetoresOuArrays.conteudo;

import comportamentoDeMemoriaArraysListas.vetoresOuArrays.conteudo.entitiesEx2.Produto;

import java.util.Locale;
import java.util.Scanner;

/*
 Fazer um programa para ler um número inteiro N e os dados(nome e
 preço) de N Produtos. Armazene os N produtos em um vetor. Em
 seguida,mostrar o preço médio dos produtos.

 */

// Esse exemplo 2 é utilizando o vetor/array com classe

public class ProblemaExemplo2 {

    static {
        Locale.setDefault(Locale.US);
    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int N = sc.nextInt();

        // Ao inves de usar tipo primitivo, usaremos o tipo valor para instanciar nossa classe com o array
        Produto[] Nprodutos = new Produto[N];

        // Importante: Ao inves de ficar utilizando a variavel N, podemos utilizar uma propriedade do array que se chama length para saber o tamanho do vetor/aray, ou seja, da na mesma.
        // é até melhor utilizar a propriedade lenght para nao ficar dependente de variavel.
        for (int i = 0; i < Nprodutos.length; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();

            // Agora, para recebermos os valores no array, precisamos criar outro array e instanciando o produto com seus atributos. Os atributos serao adicionados de acordo com o i.
            Nprodutos[i] = new Produto(nome, preco);
        }

        double soma = 0.0;
        for (int i = 0; i < Nprodutos.length; i++) {
            soma += Nprodutos[i].getPrecoP();
        }

        double precoMedia = soma / Nprodutos.length;

        System.out.printf("AVERAGE PRICE = %.2f", precoMedia);

        sc.close();

    }
}
