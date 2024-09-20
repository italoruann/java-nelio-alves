package comportamentoDeMemoriaArraysListas.boxingUnboxingWrapperClasses;


public class Boxing {

    public static void main(String[] args) {
        // Boxing é um processo conversão de um objeto do tipo valor(primitivo) para um objeto do tipo referência compatível. Exemplos abaixo
        int x = 20;
        Object obj = x;
        // Ou seja, o tipo valor x está em uma area do stack enquanto o Object ta no heap.

        // Unboxing é o inverso, conversão do objeto tipo referência para um objeto do tipo valor compatível.
        int y = (int) obj; // o compilador vai dá erro se eu não usar o casting, pois são tipos diferentes

        // Wrapper classes são classes equivalentes aos tipos primitivos.
        // A diferença é que os tipos primitivos podem receber valores padrões como double 0.0, int 0. Se usarmos o wrapper, os padrões dos valores serão null.

        BoxingValores boxingValor = new BoxingValores();

        System.out.println("Valor tipo primitivo: " + boxingValor.intPrimitivo);
        System.out.println("Valor tipo classe: " + boxingValor.intClasse);

        System.out.println("Valor tipo primitivo: " + boxingValor.doublePrimitivpo);
        System.out.println("Valor tipo classe: " + boxingValor.doubleClasse);

        System.out.println("Valor tipo primitivo: " + boxingValor.charPrimitivo);
        System.out.println("Valor tipo classe: " + boxingValor.charClasse);

        System.out.println("Valor tipo primitivo: " + boxingValor.booleanPrimitivo);
        System.out.println("Valor tipo classe: " + boxingValor.booleanClasse);

        System.out.println("Valor tipo primitivo: " + boxingValor.floatPrimitivo);
        System.out.println("Valor tipo classe: " + boxingValor.floatClasse);

        System.out.println("Valor tipo primitivo: " + boxingValor.shortPrimitivo);
        System.out.println("Valor tipo classe: " + boxingValor.shortClasse);

        System.out.println("Valor tipo primitivo: " + boxingValor.bytePrimitivo);
        System.out.println("Valor tipo classe: " + boxingValor.byteClasse);

        System.out.println("Valor String padrão: " + boxingValor.stringPadrao);

        // Desfecho - Só é recomendado utilizar Wrapper Classe em situações que você precisa que o valor padrão seja null.
        // Motivo: Em aplicações maiores, o wrapper class pode ter perda de desempenho.
        // os tipos primitivos são mais rapidos.

    }
}
