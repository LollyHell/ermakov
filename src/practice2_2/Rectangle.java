package practice2_2;

public class Rectangle extends Figure {
    private final double a;
    private final double b;
    public Rectangle(double a, double b) {
        if (a <= 0 || b <= 0) throw new IllegalArgumentException("Не может быть отрицательных сторон");
        this.a = a;
        this.b = b;
    }

    @Override
    double getArea() {
        return a * b;
    }
}
