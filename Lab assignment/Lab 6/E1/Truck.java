import java.util.Scanner;

public class Truck extends Vehicles {
    private int truckload;

    public Truck() {
        super();
    }

    public Truck(String maker, String model, double price, int truckload) {
        super(maker, model, price);
        this.truckload = truckload;
    }

    public int getTruckload() {
        return truckload;
    }

    public void setTruckload(int truckload) {
        this.truckload = truckload;
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
        System.out.print("Nhap tai trong: ");
        truckload = scanner.nextInt();
    }

    @Override
    public void display() {
        System.out.println("Hang san xuat: " + maker);
        System.out.println("Model: " + model);
        System.out.println("Gia: " + price);
        System.out.println("Tai trong: " + truckload);
    }
}