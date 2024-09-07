package estruturasequencial;

import java.util.Locale;

public class SaidaDeDados {
    public static void main(String[] args) {
        // Por padrão, a saida dos numeros vai ser com ,(virgula) por conta do idioma do computador. Para resolver isso:
        Locale.setDefault(Locale.US);

        System.out.println("o ln tem quebra de linha no final.");
        System.out.print("não tem quebra de linha no final.");
        double y = 34.09445;
        // Para escrever o conteudo de alguma variavel com ponto flutuante (double/float)
        System.out.printf("Formata o texto caso queira informar na saída algum valor. Exemplo: %.2f\n", y);
        // o %.2f serve para quebrar as casas decimais onde o 2 é a quantidade de casas decimais que quero!
        // Pra quebra de linha, podemos utilizar %n ou \n

        // Concatenação - Para juntar textos ou valores
        String nome = "Ruann";
        System.out.println("Meu nome é Italo e sobrenome " + nome);

        // Concatenar varios elementos em uma unica escrita
        byte idade = 23;
        double altura = 1.70;
        double peso = 72.2;
        System.out.printf("Minha idade é %d\n", idade); // o %d é para imprimir formatações que seja int
        System.out.printf("Minha altura é %.2f\n", altura); // o %f é para double/float. o .2 é quantas casas decimais

        // Utilizando varios valores
        // %s - String; %d - int; %f - double/float; \n - quebra de linha; .2 - limite de casa decimal; %c - para caractere unico tipo char
        String nomeF = "Maria";
        int idadeF = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha %.2f por mês\n", nomeF, idadeF, renda);

    }
}
