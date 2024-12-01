import java.util.Scanner;

public class Car extends Vehicles {
    private String color;

    public Car() {
        super();
    }

    public Car(String maker, String model, double price, String color) {
        super(maker, model, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap hang san xuat: ");
        maker = scanner.nextLine();
        System.out.print("Nhap model: ");
        model = scanner.nextLine();
        System.out.print("Nhap gia: ");
        price = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        System.out.print("Nhap mau: ");
        color = scanner.nextLine();
    }

    @Override
    public void display() {
        System.out.println("Hang san xuat: " + maker);
        System.out.println("Model: " + model);
        System.out.println("Gia: " + price);
        System.out.println("Mau: " + color);
    }
}