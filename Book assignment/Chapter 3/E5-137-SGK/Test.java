import java.util.Scanner;

public class Test {
    public static void main(String[] args) {   

        //Object
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so sinh vien: ");
        int n = sc.nextInt();
        SinhVien[] sinhvien = new SinhVien[n];
        for (int i = 0; i < n; i++){
            sinhvien[i].nhap();
        }
        sc.close();
        //Print
        System.out.println(sinhvien.toString());
    }
}
  