package estruturasequencial;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        // Operadores -> + - * / %
        System.out.println(2+2);
        System.out.println(4-2);
        System.out.println(2*2);
        System.out.println(2/3);
        System.out.println(12%3);

        // Precedência -> 1 lugar -> * / %   2 lugar -> + -
        System.out.println(3 + 4 * 5);
        System.out.println(3 / 5 % 5);
        System.out.println((3 + 4) * 5);

    }
}