
import java.util.Scanner;

public class Motor implements IMotor {
    protected String code;
    protected String name;
    protected double capacity;
    protected int num;

    public Motor() {
    }

    public Motor(String code, String name, double capacity, int num) {
        this.code = code;
        this.name = name;
        this.capacity = capacity;
        this.num = num;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void inputInfor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma xe: ");
        code = scanner.nextLine();
        System.out.print("Nhap ten xe: ");
        name = scanner.nextLine();
        System.out.print("Nhap dung tich xi lanh: ");
        capacity = scanner.nextDouble();
        System.out.print("Nhap kieu truyen luc: ");
        num = scanner.nextInt();
    }

    @Override
    public void displayInfor() {
        System.out.println("Ma xe: " + code);
        System.out.println("Ten xe: " + name);
        System.out.println("Dung tich xi lanh: " + capacity);
        System.out.println("Kieu truyen luc: " + num);
    }

    @Override
    public void changeInfor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chon thong tin can thay doi:");
        System.out.println("1. Ma xe");
        System.out.println("2. Ten xe");
        System.out.println("3. Dung tich xi lanh");
        System.out.println("4. Kieu truyen luc");
        System.out.print("Lua chon: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (choice) {
            case 1:
                System.out.print("Nhap ma xe moi: ");
                code = scanner.nextLine();
                break;
            case 2:
                System.out.print("Nhap ten xe moi: ");
                name = scanner.nextLine();
                break;
            case 3:
                System.out.print("Nhap dung tich xi lanh moi: ");
                capacity = scanner.nextDouble();
                break;
            case 4:
                System.out.print("Nhap kieu truyen luc moi: ");
                num = scanner.nextInt();
                break;
            default:
                System.out.println("Lua chon khong hop le.");
        }
    }
}