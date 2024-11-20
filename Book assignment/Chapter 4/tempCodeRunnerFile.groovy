#include <bits/stdc++.h>
using namespace std;

// Khởi tạo các biến hằng
const int maxtp = 100;
const int kichThuocQuanThe = 20;
const int soLuongThehe = 40;

// Tạo lớp class như trong Java
struct caThe
{
    int duongDi[maxtp];
    double doThichNghi;
};

// Biến toàn cục
int soCaThe;
double khoangcach[maxtp][maxtp];
caThe quanThe[kichThuocQuanThe];
caThe quanTheMoi[kichThuocQuanThe];

// Khởi tạo cá thể mới
void khoiTao(caThe &cathe)
{
    for (int i = 0; i < soCaThe; i++)
        cathe.duongDi[i] = i;
    random_shuffle(cathe.duongDi, cathe.duongDi + soCaThe);
}

// Độ thích nghi (độ thích nghi = tổng khoảng cách giữa các thành phố)
double doThichNghi(caThe &cathe)
{
    double quangduong = 0;
    for (int i = 0; i < soCaThe - 1; i++)
        quangduong += khoangcach[cathe.duongDi[i]][cathe.duongDi[i + 1]];
    quangduong += khoangcach[cathe.duongDi[soCaThe - 1]][cathe.duongDi[0]]; // Quay về thành phố đầu tiên
    return quangduong;
}

// Tìm cha mẹ tốt nhất để lai tạo
int chaMeTotNhat()
{
    int soCaTheChonLoc = 5;
    int caTheTotNhat = rand() % kichThuocQuanThe;
    for (int i = 0; i < soCaTheChonLoc; i++)
    {
        int j = rand() % kichThuocQuanThe;
        if (quanThe[j].doThichNghi < quanThe[caTheTotNhat].doThichNghi)
        {
            caTheTotNhat = j;
        }
    }
    return caTheTotNhat;
}

// Lai tạo bằng phương pháp order crossover
void crossover(caThe &cha, caThe &me, caThe &con1, caThe &con2)
{
    bool daCo1[maxtp] = {false};
    bool daCo2[maxtp] = {false};
    for (int i = 0; i < soCaThe; i++)
    {
        con1.duongDi[i] = -1;
        con2.duongDi[i] = -1;
    }
    int start = rand() % soCaThe;
    int end = rand() % soCaThe;
    if (start > end)
        swap(start, end);

    for (int i = start; i <= end; i++)
    {
        con1.duongDi[i] = cha.duongDi[i];
        con2.duongDi[i] = me.duongDi[i];
        daCo1[cha.duongDi[i]] = true;
        daCo2[me.duongDi[i]] = true;
    }

    int o1 = (end + 1) % soCaThe;
    int o2 = (end + 1) % soCaThe;

    for (int i = 0; i < soCaThe; i++)
    {
        int chon1 = me.duongDi[(end + 1 + i) % soCaThe];
        int chon2 = cha.duongDi[(end + 1 + i) % soCaThe];

        if (!daCo1[chon1])
        {
            con1.duongDi[o1] = chon1;
            daCo1[chon1] = true;
            o1 = (o1 + 1) % soCaThe;
        }

        if (!daCo2[chon2])
        {
            con2.duongDi[o2] = chon2;
            daCo2[chon2] = true;
            o2 = (o2 + 1) % soCaThe;
        }
    }

    for (int i = 0; i < soCaThe; i++)
    {
        if (con1.duongDi[i] == -1 || con2.duongDi[i] == -1)
        {
            cerr << "Lai tao that bai o vi tri " << i << "\n";
            exit(1); // Dừng chương trình nếu xảy ra lỗi nghiêm trọng
        }
    }
}

// Đột biến swap với tỉ lệ 5%
void dotBien(caThe &cathe)
{
    if ((rand() % 100) < 5)
    {
        int i = rand() % soCaThe;
        int j = rand() % soCaThe;
        while (i == j)
            j = rand() % soCaThe;
        swap(cathe.duongDi[i], cathe.duongDi[j]);
    }
}

// Thay thế quần thể
void thaythe()
{
    for (int i = 0; i < kichThuocQuanThe; i++)
        quanThe[i] = quanTheMoi[i];
}

// Giải TSP bằng genetic algorithm
void geneticAlgorithm()
{
    // Khởi tạo quần thể ban đầu
    for (int i = 0; i < kichThuocQuanThe; i++)
    {
        khoiTao(quanThe[i]);
        quanThe[i].doThichNghi = doThichNghi(quanThe[i]);
    }

    for (int theHe = 0; theHe < soLuongThehe; theHe++)
    {
        for (int i = 0; i < kichThuocQuanThe; i += 2)
        {
            // Chọn cha mẹ
            int cha = chaMeTotNhat();
            int me = chaMeTotNhat();

            // Lai tạo bằng order crossover
            crossover(quanThe[cha], quanThe[me], quanTheMoi[i], quanTheMoi[i + 1]);

            // Đột biến
            dotBien(quanTheMoi[i]);
            dotBien(quanTheMoi[i + 1]);

            // Tính độ thích nghi
            quanTheMoi[i].doThichNghi = doThichNghi(quanTheMoi[i]);
            quanTheMoi[i + 1].doThichNghi = doThichNghi(quanTheMoi[i + 1]);
        }

        // Thay thế quần thể
        thaythe();

        // Tìm cá thể tốt nhất
        int minIndex = 0;
        for (int i = 1; i < kichThuocQuanThe; i++)
        {
            if (quanThe[i].doThichNghi < quanThe[minIndex].doThichNghi)
                minIndex = i;
        }

        if (theHe % 10 == 0 || theHe == soLuongThehe - 1)
        {
            cout << "The he " << theHe << " - Khoang cach ngan nhat: " << quanThe[minIndex].doThichNghi << "\n";
        }
    }
}

// Chạy hàm main
int main()
{
    cout << "Nhap so thanh pho: ";
    cin >> soCaThe;

    if (soCaThe < 2 || soCaThe > maxtp)
    {
        cout << "So thanh pho khong hop le!";
        return 0;
    }

    cout << "Nhap ma tran khoang cach:\n";
    for (int i = 0; i < soCaThe; i++)
    {
        for (int j = 0; j < soCaThe; j++)
        {
            cin >> khoangcach[i][j];
        }
    }

    srand(time(0)); // Đảm bảo kết quả ngẫu nhiên khác nhau
    geneticAlgorithm();

    return 0;
}
