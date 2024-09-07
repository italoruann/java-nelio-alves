package estruturasequencial;

public class FuncoesMatematicas {
    public static void main(String[] args) {
        // Algumas funções matemáticas em Java
        double a,b,c;
        double A,B,C;

        // Raiz quadrada
        a = 3.5;
        b = 3.2;
        c = 5.5;

        A = Math.sqrt(a);
        B = Math.sqrt(b);
        C = Math.sqrt(c);
        System.out.printf("Raiz quadrada dos números %.1f, %.1f, %.1f é %.2f, %.2f, %.2f", a, b, c, A, B, C);
        System.out.println();

        // A potência (Numero elevado a outro)
        a = 4.4;
        b = 3.7;
        c = 6.6;
        A = Math.pow(c, a);
        B = Math.pow(a, b);
        C = Math.pow(c, b);
        System.out.printf("A potência dos números %.1f, %.1f, %.1f é %.2f, %.2f, %.2f", a, b, c, A, B, C);
        System.out.println();

        // Qualquer sinal negativo se tornará positivo. Se está negativo, ficará positivo
        int num1 = -6;
        int num2 = 6;
        int resul1, resul2;
        resul1 = Math.abs(num1);
        resul2 = Math.abs(num2);
        System.out.printf("Os números %d, %d, utilizando abs(sinal sempre positivo) é %d e %d", num1, num2, resul1, resul2);

    }
}
