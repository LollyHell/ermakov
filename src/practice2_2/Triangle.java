package practice2_2;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double h) {
        if (a <= 0 || b <= 0 || c <= 0) throw new IllegalArgumentException("отриц сторона треугольника");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }
}
