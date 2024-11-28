public class Test {
    public static void main(String[] args) {
        CNKSP congnhan1 = new CNKSP();
        CNTCN congnhan2 = new CNTCN();
        congnhan1.nhapThongTin();
        System.out.println("Thong tin vua nhap: ");
        System.out.println(congnhan1.inThongTin());
        congnhan2.nhapThongTin();
        System.out.println("Thong tin vua nhap: ");
        System.out.println(congnhan2.inThongTin());
    }
}
