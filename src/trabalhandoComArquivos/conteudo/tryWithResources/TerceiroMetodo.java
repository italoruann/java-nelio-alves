package trabalhandoComArquivos.conteudo.tryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Esse terceiro metodo inclui em remover o bloco finally e remover as instancias nulas e acrescentar tudo dentor do
// do parenteses do try (try with resources)
public class TerceiroMetodo {
    public static void main(String[] args) {
        String caminho = "src/trabalhandoComArquivos/conteudo/palavras.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha = br.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
