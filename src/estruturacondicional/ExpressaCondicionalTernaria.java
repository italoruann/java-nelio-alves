package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExpressaCondicionalTernaria {
    public static void main(String[] args) {
        // Serve para melhor a legibilidade do código.
        // Ao inves de utilizar varios if e else if.

        Scanner sc = new Scanner(System.in);

        // If e else normal
        double preco= 34.5;
        double desconto;
        if(preco < 20.0) {
            desconto = preco* 0.1;
        }
        else{
            desconto = preco* 0.05;
        }

        // Com expresão ternária
        double preco2 = 33.5;
        double descontoPreco2 = (preco2 < 20.0) ? preco * 0.1 : preco * 0.05;
        // Contexto: Se o preco2 for menor que 20, ele multiplica o preco * 0.1, se não, preco * 0.05;
    }
}
