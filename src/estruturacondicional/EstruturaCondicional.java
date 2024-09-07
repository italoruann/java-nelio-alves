package estruturacondicional;

public class EstruturaCondicional {
    public static void main(String[] args) {
         // É uma estrutura de controle para controlar o fluxo do código.

        // Condicional simples (Sò tem um if)
        int a = 3;
        int b = 4;

        if (a > b) {
            System.out.println("A é maior que B"); // Condiçao Falsa
        }
        System.out.println("Fim");

        // Condicional composta (tem if e else e dentro do else outro if e else)
        int c = 5;
        int d = 3;
        if (c > d) {
            System.out.println("C é maior que B");
        }
        else {
            if (c == d){
                System.out.println("C é igual a D");
            }
            else {
                System.out.println("C é menor que B");
            }
        }

        // Entretando, se tiver mais condicões, o código pode virar uma especie de "torre". Então, o certo seria usar else if.
        int horas = 23;

        if (horas < 12) {
            System.out.println("Bom dia");
        }
        else if (horas < 18) {
            System.out.println("Boa tarde");
        }
        else if (horas <= 23) {
            System.out.println("Boa noite");
        }
        else {
            System.out.println("Boa madrugada");
        }
    }
}
