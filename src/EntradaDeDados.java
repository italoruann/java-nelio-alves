import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        // A classe Scanner é utilizada para entrada de dados

        // Instancia da classe Scanner e o nome do objeto é input
        Scanner input = new Scanner(System.in);

        // Para ler textos sem espaços, utiliza o metodo next() do scanner
        String nome;
        System.out.print("Digite seu nome: ");
        nome = input.next();
        System.out.printf("Você digitou %s\n", nome);

        // Para ler numeros inteiros, utiliza nextInt() do scanner
        int idade;
        System.out.print("Digite sua idade: ");
        idade = input.nextInt();
        System.out.printf("Você digitou a idade %d\n", idade);

        // Para ler numero com ponto flutuante, utiliza nextDouble() do scanner.
        // Obs: Para considerar o idioma (ponto ou virgula), importa a classe Locale
        double peso;
        System.out.print("Digite seu peso: ");
        peso = input.nextDouble();
        System.out.printf("Seu peso é %.2f\n", peso);

        // Para ler um caractere char, utilizasse next().charArt(0)
        char genero;
        System.out.print("Digite seu genêro: ");
        genero = input.next().charAt(0);
        System.out.printf("Seu gênero é %c\n", genero);

        // Para ler varios dados em uma linha
        String a;
        int b;
        double c;
        System.out.print("Digite Texto, inteiro e flutuante: ");
        a = input.next();
        b = input.nextInt();
        c = input.nextDouble();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // Para ler varias string na mesma linha. Exemplo:
        String text1, text2, text3;
        text1 = input.nextLine(); // Saida: Bom dia
        text2 = input.nextLine(); // saida: Boa tarde
        text3 = input.nextLine(); // saida: boa noite
        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);


        input.close(); // Obrigatório fechar o input para evitar problemas de performance

        /*•Scanner
             •next()
             •nextInt()
             •nextDouble()
             •next().charAt(0)
         •Locale
         •Como ler até a quebra de linha
             •nextLine()
             • como limpar o buffer de leitura */
    }
}
