import java.util.Scanner;

public class KiSu extends NguoiLaoDong {
    protected int luongCoBan;
    protected int heSoLuong;

    public KiSu() {
        super();
        this.heSoLuong = 0;
        this.luongCoBan = 0;
    }

    public KiSu(int heSoLuong, int luongCoBan, String diaChi, String hoTen, String loaiLaoDong) {
        super(diaChi, hoTen, loaiLaoDong);
        this.heSoLuong = heSoLuong;
        this.luongCoBan = luongCoBan;
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

    @Override
    public double tinhLuong() {
        if (luongCoBan <= 15)
            return luongCoBan * heSoLuong + 500000;
        else if (luongCoBan < 25)
            return luongCoBan * heSoLuong + 1000000;
        else
            return luongCoBan * heSoLuong + 2000000;
    }

    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.println("Nhap luong co ban: ");
        setLuongCoBan(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap he so luong: ");
        setHeSoLuong(Integer.parseInt(sc.nextLine()));
    }

    @Override
    public String inThongTin() {
        return super.inThongTin()
                + "\nluong co ban: " + getLuongCoBan()
                + "\nDHe so luong: " + getHeSoLuong()
                + "\nLuong thang: " + tinhLuong();
    }
}
