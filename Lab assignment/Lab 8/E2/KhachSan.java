
import java.util.Scanner;

public class KhachSan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong khach tro: ");
        int n = sc.nextInt();
        sc.nextLine();
        PhongTro[] phongTros = new PhongTro[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin khach tro " + (i + 1) + ":");
            System.out.print("Ho va ten: ");
            String hoTen = sc.nextLine();
            System.out.print("Ngay sinh: ");
            String ngaySinh = sc.nextLine();
            System.out.print("So CMND: ");
            String soCMND = sc.nextLine();
            System.out.print("So ngay tro: ");
            int soNgayTro = sc.nextInt();
            sc.nextLine();
            System.out.print("Loai phong: ");
            String loaiPhong = sc.nextLine();
            System.out.print("Gia phong: ");
            double giaPhong = sc.nextDouble();
            sc.nextLine();
            phongTros[i] = new PhongTro(new Khach(hoTen, ngaySinh, soCMND), soNgayTro, loaiPhong, giaPhong);
        }

        System.out.println("\nDanh sach phong tro:");
        for (PhongTro phongTro : phongTros) {
            System.out.println(phongTro);
        }

        System.out.print("\nNhap so CMND cua khach muon tinh tien: ");
        String cmnd = sc.nextLine();
        for (PhongTro phongTro : phongTros) {
            if (phongTro.getKhach().getSoCMND().equals(cmnd)) {
                System.out.println("So tien phai tra: " + phongTro.tinhTien());
                break;
            }
        }

        sc.close();
    }
}