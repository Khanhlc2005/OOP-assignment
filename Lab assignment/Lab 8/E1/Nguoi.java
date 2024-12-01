
public class Nguoi {
    private String hoTen;
    private String ngaySinh;
    private String ngheNghiep;

    public Nguoi(String hoTen, String ngaySinh, String ngheNghiep) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.ngheNghiep = ngheNghiep;
    }

    public int getTuoi() {
        int namHienTai = 2024;
        int namSinh = Integer.parseInt(ngaySinh.split("-")[2]);
        return namHienTai - namSinh;
    }

    @Override
    public String toString() {
        return "Ho va ten: " + hoTen + ", Ngay sinh: " + ngaySinh + ", Nghe nghiep: " + ngheNghiep;
    }
}