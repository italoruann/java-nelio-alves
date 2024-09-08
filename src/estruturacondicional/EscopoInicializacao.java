package estruturacondicional;

public class EscopoInicializacao {
    public static void main(String[] args) {
        double preco = 400.00;
        double desconto;


        // Aqui eu não inicializei a variavel desconto, porém, pra ela funcionar, necessário colocar no else pro compilador entender.
        if (preco < 200.00) {
            desconto = preco * 0.1;
        }
        else {
            desconto = 0;
        }
        System.out.println(desconto);

        // Variaveis temporarias são aquelas que é execucada em um escopo, seja de um if ou ate método e dps de usadas, é desalocada da memória.
        if (preco > 200.00) {
            double valor = 30; // essa variavel é temporaria apenas na execução desse bloco, depois, deixará de existir.
            System.out.println(valor);
        }
    }
}
