
import java.util.Scanner;

public class Yamaha {
    public static void main(String[] args) {
        Jupiter[] jupiters = new Jupiter[3];
        Serius[] serius = new Serius[3];
        Scanner scanner = new Scanner(System.in);

        // Input for Jupiter
        System.out.println("Nhap thong tin cho 3 xe Jupiter:");
        for (int i = 0; i < jupiters.length; i++) {
            System.out.println("Xe Jupiter " + (i + 1) + ":");
            jupiters[i] = new Jupiter();
            jupiters[i].inputInfor();
        }

        // Input for Serius
        System.out.println("Nhap thong tin cho 3 xe Serius:");
        for (int i = 0; i < serius.length; i++) {
            System.out.println("Xe Serius " + (i + 1) + ":");
            serius[i] = new Serius();
            serius[i].inputInfor();
        }

        // Display all vehicles
        System.out.println("\nThong tin tat ca xe Jupiter:");
        for (Jupiter jupiter : jupiters) {
            jupiter.displayInfor();
        }

        System.out.println("\nThong tin tat ca xe Serius:");
        for (Serius s : serius) {
            s.displayInfor();
        }

        // Sort by warranty
        System.out.println("\nSap xep xe theo thoi gian bao hanh:");
        for (int i = 0; i < jupiters.length - 1; i++) {
            for (int j = 0; j < jupiters.length - i - 1; j++) {
                if (jupiters[j].getWarranty() > jupiters[j + 1].getWarranty()) {
                    Jupiter tempJupiter = jupiters[j];
                    jupiters[j] = jupiters[j + 1];
                    jupiters[j + 1] = tempJupiter;
                }
            }
        }

        for (int i = 0; i < serius.length - 1; i++) {
            for (int j = 0; j < serius.length - i - 1; j++) {
                if (serius[j].getWarranty() > serius[j + 1].getWarranty()) {
                    Serius tempSerius = serius[j];
                    serius[j] = serius[j + 1];
                    serius[j + 1] = tempSerius;
                }
            }
        }

        // Display sorted vehicles
        System.out.println("\nDanh sach xe Jupiter sau khi sap xep:");
        for (Jupiter jupiter : jupiters) {
            jupiter.displayInfor();
        }

        System.out.println("\nDanh sach xe Serius sau khi sap xep:");
        for (Serius s : serius) {
            s.displayInfor();
        }

        // Search for Serius
        System.out.println("\nTim kiem xe Serius:");
        boolean found = false;
        for (Serius s : serius) {
            if (s.getName().equalsIgnoreCase("Serius")) {
                System.out.println("Tim thay xe Serius:");
                s.displayInfor();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay xe Serius.");
        }
    }
}