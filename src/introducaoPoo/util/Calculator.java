package introducaoPoo.util;

public class Calculator {
    public static final double PI = 3.14159; // Criação da constante usa static final

    // Criação de metodo static é onde não precisamos instanciar o objeto.
    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
