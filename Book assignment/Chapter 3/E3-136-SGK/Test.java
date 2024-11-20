public class Test {
    public static void main(String[] args) {
        NhanVien nhanvien = new NhanVien();
        DiaChi diachi = new DiaChi("1", "1", "1", "1");
        nhanvien.setName("a");
        nhanvien.setAddress(diachi);
        nhanvien.setDob("b");
        nhanvien.setGender('M');
        System.out.println(nhanvien.toString());
    }
}
