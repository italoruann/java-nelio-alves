package trabalhandoComArquivos.exercicios;

import trabalhandoComArquivos.exercicios.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        String caminhoArquivo = "/Users/italoruann/Projetos/java/java-nelio-alves/src/trabalhandoComArquivos/exercicios/resources/products.csv";
        String saidaPasta = "/Users/italoruann/Projetos/java/java-nelio-alves/src/trabalhandoComArquivos/exercicios/resources/saida";
        String saidaArquivo = saidaPasta + "/summary.csv";

        File pasta = new File(saidaPasta);
        boolean sucesso = pasta.mkdir();

        List<Product> produtos = getProducts(caminhoArquivo);

        // Escrever no arquivo novo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(saidaArquivo))) {
            for (Product p : produtos) {
                bw.write(p.name() + "," + p.totalValue());
                bw.newLine();
            }
        }
    }

    private static List<Product> getProducts(String caminhoArquivo) throws IOException {
        List<Product> produtos = new ArrayList<>();

        // Ler o arquivo csv
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String itemCsv = br.readLine();
            while (itemCsv != null) {
                String[] campos = itemCsv.split(",");

                String nome = campos[0];
                double price = Double.parseDouble(campos[1]);
                int quantity = Integer.parseInt(campos[2]);

                produtos.add(new Product(nome, price, quantity));
                itemCsv = br.readLine();
            }
        }
        return produtos;
    }
}
