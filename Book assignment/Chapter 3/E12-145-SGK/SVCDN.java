import java.util.Scanner;

public class SVCDN extends Nguoi implements SinhVien {
    // Attribute
    protected int dtkthp;
    protected int tdkt;
    protected int smkt;

    // Constructor
    public SVCDN() {
        super();
        this.dtkthp = 0;
        this.tdkt = 0;
        this.smkt = 0;
    }

    public SVCDN(int dtkthp, int tdkt, int smkt, String hoTen, int ngaySinh, String diaChi) {
        super(hoTen, ngaySinh, diaChi);
        this.dtkthp = dtkthp;
        this.tdkt = tdkt;
        this.smkt = smkt;
    }

    // Setter
    public void setDtkthp(int dtkthp) {
        this.dtkthp = dtkthp;
    }

    public void setTdkt(int tdkt) {
        this.tdkt = tdkt;
    }

    public void setSmkt(int smkt) {
        this.smkt = smkt;
    }

    // Getter
    public int getDtkthp() {
        return dtkthp;
    }

    public int getTdkt() {
        return tdkt;
    }

    public int getSmkt() {
        return smkt;
    }

    // tinhDiem method
    @Override
    public double tinhDiem() {
        double dtb;
        try {
            if (smkt == 0)
                throw new ArithmeticException("Cannot divided by zero");
        } catch (ArithmeticException e) {
            System.out.println("Loi: " + e.getMessage());
        }
        return dtb = ((tdkt / smkt) + dtkthp) / 3;
    }

    // nhapThongTin method
    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.println("Nhap diem thi ket thuc hoc phan: ");
        int Dtkthp = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap tong diem kiem tra: ");
        int Tdkt = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so mon kiem tra: ");
        int Smkt = Integer.parseInt(sc.nextLine());
    }

    // inThongTin method
    @Override
    public String inThongTin() {
        return super.inThongTin() + "\ndiem thi ket thuc hoc phan: " + dtkthp + "\nTong diem kiem tra: " + tdkt
                + "\nSo mon kiem tra: "
                + smkt + "\nDiem trung binh: " + tinhDiem();
    }
}
