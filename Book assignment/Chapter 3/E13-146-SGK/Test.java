public class Test {
    public static void main(String[] args) {
        LaoDongPhoThong laodong = new LaoDongPhoThong();
        KiSu kisu = new KiSu();
        laodong.nhapThongTin();
        System.out.println("Thong tin vua nhap: ");
        System.out.println(laodong.inThongTin());
        kisu.nhapThongTin();
        System.out.println("Thong tin vua nhap: ");
        System.out.println(kisu.inThongTin());
    }
}
