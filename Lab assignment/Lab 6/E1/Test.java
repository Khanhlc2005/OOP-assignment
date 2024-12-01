
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        Truck[] trucks = new Truck[3];
        Scanner scanner = new Scanner(System.in);

        // Input for Cars
        System.out.println("Nhap thong tin cho 3 xe Car:");
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Xe Car " + (i + 1) + ":");
            cars[i] = new Car();
            cars[i].input();
        }

        // Input for Trucks
        System.out.println("Nhap thong tin cho 3 xe Truck:");
        for (int i = 0; i < trucks.length; i++) {
            System.out.println("Xe Truck " + (i + 1) + ":");
            trucks[i] = new Truck();
            trucks[i].input();
        }

        // Display all vehicles
        System.out.println("\nThong tin tat ca xe Car:");
        for (Car car : cars) {
            car.display();
        }

        System.out.println("\nThong tin tat ca xe Truck:");
        for (Truck truck : trucks) {
            truck.display();
        }

        // Sort by price
        System.out.println("\nSap xep xe theo gia:");
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - i - 1; j++) {
                if (cars[j].getPrice() > cars[j + 1].getPrice()) {
                    Car tempCar = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = tempCar;
                }
            }
        }

        for (int i = 0; i < trucks.length - 1; i++) {
            for (int j = 0; j < trucks.length - i - 1; j++) {
                if (trucks[j].getPrice() > trucks[j + 1].getPrice()) {
                    Truck tempTruck = trucks[j];
                    trucks[j] = trucks[j + 1];
                    trucks[j + 1] = tempTruck;
                }
            }
        }

        // Display sorted vehicles
        System.out.println("\nDanh sach xe Car sau khi sap xep:");
        for (Car car : cars) {
            car.display();
        }

        System.out.println("\nDanh sach xe Truck sau khi sap xep:");
        for (Truck truck : trucks) {
            truck.display();
        }

        // Search by model
        System.out.print("\nNhap model can tim: ");
        String searchModel = scanner.nextLine();

        System.out.println("\nKet qua tim kiem:");
        boolean found = false;
        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(searchModel)) {
                System.out.println("Tim thay xe Car:");
                car.display();
                found = true;
            }
        }

        for (Truck truck : trucks) {
            if (truck.getModel().equalsIgnoreCase(searchModel)) {
                System.out.println("Tim thay xe Truck:");
                truck.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay xe voi model nay.");
        }
    }
}