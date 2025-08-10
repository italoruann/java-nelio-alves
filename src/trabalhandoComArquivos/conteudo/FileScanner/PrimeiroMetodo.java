package trabalhandoComArquivos.conteudo.FileScanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// Esse é o metodo de leitura de arquivos txt mais comum e menos eficaz
public class PrimeiroMetodo {

    private static File file = new File("src/trabalhandoComArquivos/conteudo/palavras.txt");
    private static Scanner sc = null;

    public static void main(String[] args) {
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro no arquivo: " + e.getMessage());

        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
