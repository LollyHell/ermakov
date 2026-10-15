package practice2_2;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0) throw new IllegalArgumentException("Отрицательный радиус");
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}
