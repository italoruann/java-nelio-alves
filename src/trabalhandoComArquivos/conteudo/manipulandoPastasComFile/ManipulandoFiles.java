package trabalhandoComArquivos.conteudo.manipulandoPastasComFile;

import java.io.File;

public class ManipulandoFiles {
    public static void main(String[] args) {
        try {
            String strCaminho = "/Users/italoruann/Projetos/java/java-nelio-alves/src/trabalhandoComArquivos/conteudo";

            File caminho = new File(strCaminho);

            // Informacoes do caminho do arquivo
            System.out.println("getPath: " + caminho.getPath());
            System.out.println("getParent: " + caminho.getParent());
            System.out.println("getName: " + caminho.getName());

            System.out.println();
            // pastas
            File[] pastas = caminho.listFiles(File::isDirectory);
            if (pastas != null) {
                for (File pasta : pastas) {
                    System.out.println(pasta);
                }
            }
            System.out.println();

            // arquivos+
            File[] arquivos = caminho.listFiles(File::isFile);
            if (arquivos != null) {
                for (File arquivo : arquivos) {
                    System.out.println(arquivo);
                }
            }
            // Verificar se a pasta existe
            File pasta = new File(caminho + "/pastaTeste");
            if (pasta.exists()) {
                System.out.println("Pasta já existe");
                return;
            }

            boolean sucesso = pasta.mkdir();
            if (!sucesso) {
                System.out.println("Falha ao criar a pasta");
                return;
            }

            System.out.println("Pasta criada com sucesso");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
