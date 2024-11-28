public class Test {
    public static void main(String[] args) throws Exception {
        // Nhap thong tin sinh vien
        SVCDCQ sinhvien1 = new SVCDCQ();
        SVCDN sinhvien2 = new SVCDN();
        sinhvien1.nhapThongTin();
        System.out.println("Thong tin vua nhap:");
        System.out.println(sinhvien1.inThongTin());
        sinhvien2.nhapThongTin();
        System.out.println("Thong tin vua nhap:");
        System.out.println(sinhvien2.inThongTin());
    }
}
