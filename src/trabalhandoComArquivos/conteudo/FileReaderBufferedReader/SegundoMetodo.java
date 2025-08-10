package trabalhandoComArquivos.conteudo.FileReaderBufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Esse e o segundo metodo e nao é eficaz, porquê vamos abrir e fechar tudo de forma manual e verbosa (nao recomendado)
public class SegundoMetodo {
    public static void main(String[] args) {

        String caminho = "src/trabalhandoComArquivos/conteudo/palavras.txt";
        BufferedReader bufferedReader = null;
        FileReader file = null;

        try {
            file = new FileReader(caminho);
            bufferedReader = new BufferedReader(file);
            String linha = bufferedReader.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (file != null) {
                    file.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
