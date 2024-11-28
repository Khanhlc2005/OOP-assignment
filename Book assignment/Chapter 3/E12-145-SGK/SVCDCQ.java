
import java.util.Scanner;

public class SVCDCQ extends Nguoi implements SinhVien {
    // Attribute
    protected int maSV;
    protected int tdkt;
    protected int smkt;

    // Constructor
    public SVCDCQ() {
        super();
        this.maSV = 0;
        this.tdkt = 0;
        this.smkt = 0;
    }

    public SVCDCQ(int maSV, int tdkt, int smkt, String hoTen, int ngaySinh, String diaChi) {
        super(hoTen, ngaySinh, diaChi);
        this.maSV = maSV;
        this.tdkt = tdkt;
        this.smkt = smkt;
    }

    // Setter
    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public void setTdkt(int tdkt) {
        this.tdkt = tdkt;
    }

    public void setSmkt(int smkt) {
        this.smkt = smkt;
    }

    // Getter
    public int getmaSV() {
        return maSV;
    }

    public int getTdkt() {
        return tdkt;
    }

    public int getSmkt() {
        return smkt;
    }

    // tinhDiem method
    @Override
    public double tinhDiem() throws ArithmeticException {
        if (smkt == 0) {
            throw new ArithmeticException("Khong the chia cho 0 (so mon kiem tra = 0)");
        }
        return (double) tdkt / smkt;
    }

    // nhapThongTin method
    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.println("Nhap ma sinh vien: ");
        setMaSV(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap tong diem kiem tra: ");
        setTdkt(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap so mon kiem tra: ");
        setSmkt(Integer.parseInt(sc.nextLine()));
    }

    // inThongTin method
    @Override
    public String inThongTin() {
        String thongTin = super.inThongTin() + "\nMa sinh vien: " + maSV + "\nTong diem kiem tra: " + tdkt
                + "\nSo mon kiem tra: " + smkt;
        try {
            double dtb = tinhDiem();
            thongTin += "\nDiem trung binh: " + dtb;
        } catch (ArithmeticException e) {
            thongTin += "\nKhong the tinh diem trung binh: " + e.getMessage();
        }

        return thongTin;
    }
}
