import java.util.Scanner;

public class CNTCN extends CongNhan {
    protected int luongCoBan;
    protected int heSoLuong;
    protected int soNgayCong;

    public CNTCN() {
        super();
        this.heSoLuong = 0;
        this.luongCoBan = 0;
        this.soNgayCong = 0;
    }

    public CNTCN(int heSoLuong, int luongCoBan, int soNgayCong, String diaChi, String hoTen, String loaiLaoDong) {
        super(diaChi, hoTen, loaiLaoDong);
        this.heSoLuong = heSoLuong;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    @Override
    public double tinhLuong() {
        if (soNgayCong < 20)
            return luongCoBan * heSoLuong;
        else
            return luongCoBan * heSoLuong + (double) (1.2 * luongCoBan);
    }

    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.println("Nhap luong co ban: ");
        setLuongCoBan(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap he so luong: ");
        setHeSoLuong(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap so ngay cong: ");
        setSoNgayCong(Integer.parseInt(sc.nextLine()));
    }

    @Override
    public String inThongTin() {
        return super.inThongTin()
                + "\nluong co ban: " + getLuongCoBan()
                + "\nDHe so luong: " + getHeSoLuong()
                + "\nSo ngay cong: " + getSoNgayCong()
                + "\nLuong thang: " + tinhLuong();
    }
}
