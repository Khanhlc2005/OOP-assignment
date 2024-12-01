
import java.util.Scanner;

public class ThuVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so the muon: ");
        int n = sc.nextInt();
        sc.nextLine();
        TheMuon[] theMuons = new TheMuon[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin the muon " + (i + 1) + ":");
            System.out.print("Ho va ten: ");
            String hoTen = sc.nextLine();
            System.out.print("MSV: ");
            String maSV = sc.nextLine();
            System.out.print("Ngay sinh: ");
            String ngaySinh = sc.nextLine();
            System.out.print("Lop: ");
            String lop = sc.nextLine();
            System.out.print("So phieu muon: ");
            String soPhieuMuon = sc.nextLine();
            System.out.print("Ngay muon: ");
            String ngayMuon = sc.nextLine();
            System.out.print("Han tra: ");
            String hanTra = sc.nextLine();
            System.out.print("So hieu sach: ");
            String soHieuSach = sc.nextLine();
            theMuons[i] = new TheMuon(soPhieuMuon, ngayMuon, hanTra, soHieuSach,
                    new SinhVien(hoTen, maSV, ngaySinh, lop));
        }

        System.out.println("\nDanh sach the muon vao cuoi thang:");
        for (TheMuon theMuon : theMuons) {
            if (theMuon.canTraCuoiThang()) {
                System.out.println(theMuon);
            }
        }

        sc.close();
    }
}