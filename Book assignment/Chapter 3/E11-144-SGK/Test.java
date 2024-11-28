public class Test {
    public static void main(String[] args) {
        // Mang doi tuong
        GiangVienCoHuu giangvien1 = new GiangVienCoHuu();
        GiangVienThinhGiang giangvien2 = new GiangVienThinhGiang();
        giangvien1.nhapThongTin();
        System.out.println(giangvien1.inThongTin());
        giangvien2.nhapThongTin();
        System.out.println(giangvien2.inThongTin());
    }
}
