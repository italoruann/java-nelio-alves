package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresCumulativa {
    public static void main(String[] args) {
        // Problema exemplo
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();

        double conta = 50.0;
        if (minutos > 100) {
            conta += (minutos - 100) * 2.00; // Repare que tem um += é um operador de atribuição cumulativo
        }
        System.out.printf("Valor da conta = R$ %.2f", conta);

        sc.close();
    }

    /* Ou seja, aqui está abaixo os operadores de atribuição cumulativa:
    *  E pra que serve? Serve para deixar o codigo mais legivel.
    *  a += b; >>> a = a + b;
    *  a -=; >>> a = a - b;
    *  a *= b; >>> a = a * b;
    *  a /= b; >>> a = a / b;
    *  a %= b; >>> a = a % b;
    *  */
}
