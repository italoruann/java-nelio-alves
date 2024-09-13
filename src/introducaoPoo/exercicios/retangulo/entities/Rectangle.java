package introducaoPoo.exercicios.retangulo.entities;

public class Rectangle {
    public double width;
    public double height;

    public double area() {
        return width * height;
    }
    public double perimeter() {
        return 2.00 * (width + height);
    }
    public double diagonal() {
        double res = Math.pow(width, 2) + Math.pow(height, 2);
        return Math.sqrt(res);
    }
    public String toString() {
        return String.format("AREA = %.2f\n", area())
                + String.format("PERIMETER = %.2f\n", perimeter())
                + String.format("DIAGONAL = %.2f\n", diagonal());
    }
}

