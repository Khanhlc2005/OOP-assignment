import java.util.Scanner;

public class Triangle extends Shape {
    protected int base;
    protected int height;

    public Triangle() {
        this.base = 0;
        this.height = 0;
    }

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (double) base * height / 2.0;
    }

    @Override
    public String toString() {
        return "Area: " + getArea();
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base: ");
        setBase(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter height: ");
        setHeight(Integer.parseInt(sc.nextLine()));
    }
}
