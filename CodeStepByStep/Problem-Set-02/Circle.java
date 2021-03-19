public class Circle {
    private final double radius;

    public Circle(double r) {
        this.radius = r;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    public double circumference() {
        return Math.PI * this.radius * 2;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public String toString() {
        return "Circle{radius=" + this.radius + "}";
    }
}
