public abstract class Shape {
    protected String color;

    public abstract double getArea();

    @Override
    public String toString() {
        return color;
    }
}