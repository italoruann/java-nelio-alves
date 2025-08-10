package trabalhandoComArquivos.conteudo.fileWriterBufferedWriter;

import java.io.*;

// Se com FileReader e BufferedReader fizemos leitura de arquivos, o FileWriter e BufferedWriter escrevemos no arquivo.
public class Main {
    public static void main(String[] args) {
        String caminho = "src/trabalhandoComArquivos/conteudo/palavras.txt";

        // Vou criar um vetor ja com valores para informar no txt
        String[] textos = new String[] {"Bom dia", "Boa tarde", "Boa noite" ,"Boa madrugada"};

        // o parametro append serve para nao recriar o arquivo existente e sim escrever um novo texto em uma nova linha
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))) {
            for (String linha : textos) {
                bw.write(linha);
                bw.newLine(); // Como o BufferedWriter só escreve uma unica linha, o newLine() vai pra proxima linha.
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
