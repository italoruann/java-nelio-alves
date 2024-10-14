package tratamentoDeErros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {
        // Exceções são erros que o Java notifica. Tem dois tipos: o que são necessários tratar e os que não são.
        Scanner scanner = new Scanner(System.in);

        // Aqui vai uma demonstração de exceções.
        // o try -> tente executar esse comando
        // Caso o try dê alguam execção, o catch vai capturar e tratar essas exceções.
        // Se não tratado, o programa é finalizado
        try {
            String[] nomes = scanner.nextLine().split(" ");
            int posicao = scanner.nextInt();
            System.out.println(nomes[posicao]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Você acessou uma posição que não existe na lista.");
            e.printStackTrace(); // Serve para capturar onde deu o erro (em qual chamada)
        }
        catch (InputMismatchException e) {
            System.out.println("Erro: Digite apenas números inteiros!");
            e.printStackTrace(); // Serve para capturar onde deu o erro (em qual chamada)
        }
        finally {

            // Executa esse bloco, independente se deu certo ou não no bloco try catch.
            scanner.close();
        }

        System.out.println("Fim do programa");

    }
}

/*
Resumos:
-> Em java, uma exceção é um objeto herdado da classe:
    => java.lang.Exception - o compilador obriga a tratar ou propagar.
    => java.lang.RuntimeException - o compilador não obriga a tratar ou propagar.
-> Por quê excecções?
    => O modelo de tratamento de exceções permite que erros sejam tratados de forma consistente e flexível, usando boas práticas.

-> Vantagens:
    *  Delega a lógica do erro para a classe responsável por conhecer as regras que podem ocasionar o erro.
    * Trata de forma organizada (inclusive hierárquica) exceções de tipos diferentes.
    * A exceção pode carregar dados quaisquer.

--> E qual a estrutura de execução?
try {
    Codigo
}
catch (TipoDeExceção nomequalquer) {
    Codigo
}
finally {
    O bloco será executado independente ou não se ocorreu erro no try catch.
}

 */