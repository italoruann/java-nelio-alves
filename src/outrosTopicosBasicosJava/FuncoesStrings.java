package outrosTopicosBasicosJava;

public class FuncoesStrings {
    public static void main(String[] args) {
        // toLowerCase() - Todos os textos minusculos
        String original = "Uma vez Flamengo, sempre Flamengo   ";
        String t1 = original.toLowerCase();
        String t2 = original.toUpperCase();
        String t3 = original.trim();
        String t4 = original.substring(2); // com 1 parametro
        String t5 = original.substring(2, 9); // com 2 parametros
        String t6 = original.replace("Flamengo", "Brasil");
        int i = original.indexOf("men");
        int j = original.lastIndexOf("Flamengo");

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase(): -" + t1 + "-"); // textis minusculos
        System.out.println("toUpperCase(): -" + t2 + "-"); // textos maiusculos
        System.out.println("trim(): -" + t3 + "-"); // a função trim remove espaços indesejados
        System.out.println("substring(2) -" + t4 + "-"); // vai continuar o texto a partir da posição 2.
        System.out.println("substring(2, 9) -" + t5 + "-"); // vai continuar o texto a partir da posição 2 e vai ate abaixo da posição 9
        System.out.println("replace(\"Flamengo\", \"Brasil\") -" + t6 + "-"); // Substitui um texto pelo outro
        System.out.println("indexOf(\"men\") -" + i + "-"); // Vai buscar a posição da ocorrencia do texto. Por exemplo, se eu botei o men, então ele vai pegar a posição do m.
        System.out.println("lastIndexOf(\"Flamengo\") -" + j + "-"); // Vai pegar a posição da ultima palavra que se chama Flamengo, ou seja, vai pegar a posição do f.

        // Uso da operação Split
        // Serve para separar varios textos em um vetor
        String insta = "usuario1 usuario2 usuario3 usuario4";
        String[] vetores = insta.split(" "); // O espaço é onde quero dividir.

        String texto1 = vetores[0];
        String texto2 = vetores[1];
        String texto3 = vetores[2];
        String texto4 = vetores[3];

        System.out.println(texto1);
        System.out.println(texto2);
        System.out.println(texto3);
        System.out.println(texto4);
    }
}
