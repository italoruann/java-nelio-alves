package introducaoPoo.exercicios.membrosEstaticos.util;

public class CurrencyConverter {
    public static double IOF = 0.06; // O IOF é uma constante, entretanto, ele pode mudar o imposto, então, é sem final.

    public static double dollarToReal(double amount, double dolarPrice) {
        return amount * dolarPrice * (1.0 + IOF);
    }
}
