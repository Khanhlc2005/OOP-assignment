public class Circle implements GeometricObject {

    // Attribue
    protected double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Peremeter
    @Override
    public double getPerimeter() {
        return radius * 2 * 3.14;
    }

    // Area
    @Override
    public double getArea() {
        return radius * radius * 3.14;
    }
}
