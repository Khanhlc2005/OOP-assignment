import java.util.Scanner;

public class Jupiter extends Motor {
    private int warranty;

    public Jupiter() {
        super();
    }

    public Jupiter(String code, String name, double capacity, int num, int warranty) {
        super(code, name, capacity, num);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public void inputInfor() {
        super.inputInfor();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap thoi gian bao hanh (thang): ");
        warranty = scanner.nextInt();
    }

    @Override
    public void displayInfor() {
        super.displayInfor();
        System.out.println("Thoi gian bao hanh: " + warranty + " thang");
    }
}