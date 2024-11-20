
import java.util.Scanner;

public class Rectangle extends Shape {
    protected int length;
    protected int width;

    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Length: " + length
                + "\nWidth: " + width
                + "\nArea: " + getArea();
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        setLength(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter width: ");
        setWidth(Integer.parseInt(sc.nextLine()));
    }
}
