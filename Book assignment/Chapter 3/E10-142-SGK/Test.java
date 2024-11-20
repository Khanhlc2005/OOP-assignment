public class Test {
    public static void main(String[] args) {
        System.out.println("Hoc vien do hoa: ");
        HocVienDH dohoa = new HocVienDH();
        dohoa.nhapThongTin();
        System.out.println(dohoa.inThongTin());
        System.out.println("Hoc vien lap trinh: ");
        HocVienLT laptrinh = new HocVienLT();
        laptrinh.nhapThongTin();
        System.out.println(laptrinh.inThongTin());
    }
}
