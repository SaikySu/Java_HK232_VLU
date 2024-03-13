import java.util.Scanner;
import java.util.Arrays;

public class Buoi3 {

    public int m, n;
    public int matrix[][];

    // Tao ma tran
    public Buoi3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap m so dong: ");
        m = scanner.nextInt();
        System.out.print("Nhap n so dong: ");
        n = scanner.nextInt();
        matrix = new int[m][n];
    }

    // Nhap du lieu
    public void NhapDuLieu() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhap phan tu thu [" + i + "]" + "[" + j + "] : ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Xuat ma tran
    public void XuatMaTran() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(matrix[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    // Tinh tong cac phan tu trong ma tran
    public void TinhTong() {
        int Tong = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Tong += matrix[i][j];
            }
        }
        System.out.println("Tong cua ma tran la: " + Tong);
    }

    // Tinh Trung binh cong cac phan tu trong Ma Tran
    public void TinhTBCong() {
        int Tong2 = 0;
        double TBCong;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Tong2 += matrix[i][j];
            }
        }
        TBCong = (double) Tong2 / (m * n);
        System.out.println("Trung binh cong cua ma tran la: " + TBCong);
    }

    // Tong cac phan tu trong duong cheo chinh
    public void TongDuongCheoChinh() {
        int TongCheoChinh = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i] == matrix[j]) {
                    TongCheoChinh += matrix[i][j];
                }
            }
        }
        System.out.print("Tong duong cheo chinh la: " + TongCheoChinh + "\n");
    }

    // Tong cac phan tu duong cheo phu:
    public void TongCheoPhu() {
        int TongCheoPhu = 0;
        for (int i = 0; i < m; i++) {
            TongCheoPhu += matrix[i][m - 1 - i];
        }
        System.out.println("Tong cheo phu bang: " + TongCheoPhu);
    }

    // Sap xep mang
    public void SapXepMang() {
        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i]);
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println();
    }

    // Tim X
    public void TimX() {
        int x;
        boolean found = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so X muon tim: ");
        x = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (x == matrix[i][j]) {
                    System.out.println("Da tim thay X = " + x + " tai phan tu phan tu thu [" + i + "]" + "[" + j + "]");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Khong tim thay gia tri X = " + x);
        }
    }

    // Main
    public static void main(String[] args) {
        Buoi3 m2c = new Buoi3();
        m2c.NhapDuLieu();
        m2c.XuatMaTran();
        m2c.TinhTong();
        m2c.TinhTBCong();
        m2c.TongDuongCheoChinh();
        m2c.TongCheoPhu();
        m2c.SapXepMang();
        m2c.TimX();
    }
}
