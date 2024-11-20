import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        // Nhập số lượng nhân viên
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter number of employee: ");
            n = sc.nextInt();
        } while (n < 2 || n > 5);

        // Nhập thông tin của từng nhân viên
        Employee[] nhanvien = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee " + i);
            nhanvien[i] = new Employee();
            nhanvien[i].nhap();
            System.out.println(nhanvien[i].toString());
        }

        // //Nhập số lượng nhân viên bán thời gian
        // int m;
        // do {
        // System.out.println("Enter number of part-time employee: ");
        // m = sc.nextInt();
        // } while (m< 2 || m>5);

        // //Nhập thông tin của từng nhân viên bán thời gian
        // PartTimeEmployee[] nhanvienbantg = new PartTimeEmployee[m];
        // for (int i = 0; i < m; i++){
        // System.out.println("\nPart-Time employee " + (i));
        // nhanvienbantg[i] = new PartTimeEmployee();
        // nhanvienbantg[i].nhap();
        // nhanvienbantg[i].toString();
        // }

        // //Sắp xếp nhân viên theo lương giảm dần
        // Employee temp;
        // System.out.println("\nSorted employee");
        // for(int i = 0; i < (n-1); i++){
        // for (int j = (i+1); j < n; j++)
        // if (nhanvien[i].getSalary() < nhanvien[j].getSalary()){
        // temp = nhanvien[i];
        // nhanvien[i] = nhanvien[j];
        // nhanvien[j] = temp;
        // }
        // System.out.println(nhanvien[i].toString());
        // }

        // // Lọc theo giới tính
        // for(int i = 0; i < n; i++)
        // nhanvien[i].sortgender();

        // Tìm đối tượng trong danh sách
        sc.nextLine();
        System.out.println("Nhap ten: ");
        String ten = sc.nextLine();

        for (int i = 0; i < n; i++)
            if (nhanvien[i].findobject(ten)) {
                System.out.println(nhanvien[i].toString());
            } else {
                System.out.println("Khong co trong danh sach");
            }
    }
}
