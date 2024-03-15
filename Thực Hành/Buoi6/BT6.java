// Bài 1: Cho một chuỗi bất kì
// Bài 2: in ra độ dài của chuỗi
// Bài 3: Kiểm tra chuỗi có rỗng không?
// Bài 4: Kiểm tra chuỗi chỉ chứa khoảng trắng
// Bài 5: Chuyển chuỗi(1) về dạng chữ Hoa và in kết quả
// Bài 6: Chuyển chuỗi(1) về dạng chữ thường và in kết quả
// Bài 7: Cho chuỗi n và kiểm tra xem chuỗi(1) có bằng chuỗi n không?
// Bài 8: Cho chuỗi n và kiểm tra xem chuỗi(1) có bằng chuỗi n không? - equalsIgnoreCase
// Bài 9: Cho chuỗi n1, Kiểm tra chuỗi(1) có chứa chuỗi n1 hay không?
// Bài 10: Cho chuỗi a, cho biết có bao nhiêu kí tự 't' và 'd'. 
// Bài 11: Đảo ngược chuỗi
// Bài 12: Thay thế chuỗi bất kì trong 1 chuỗi khác

import java.util.Scanner;

public class BT6 {
    public String chuoi1;

    public BT6() {
        this.chuoi1 = "";
    }

    public void NhanData(String _chuoi1) {
        this.chuoi1 = _chuoi1;
    }

    public String LayData() {
        return chuoi1;
    }

    public void InChuoi() {
        System.out.println(chuoi1);
    }

    // 2
    public void KTDoDai() {
        int a = 0;
        for (int i = 0; i < chuoi1.length(); i++) {
            a++;
        }
        System.out.println("Do dai cua chuoi la: " + a);
    }

    // 3
    public void KTRong() {
        if (chuoi1.isEmpty()) {
            System.out.println("Chuoi rong");
        } else {
            System.out.println("Chuoi co phan tu la: " + chuoi1);
        }
    }

    // 4
    public void KTKhoangTrang() {
        if (chuoi1.isBlank()) {
            System.out.println("Chuoi " + chuoi1 + " khong chua khoang trang");
        } else {
            System.out.println("Chuoi " + chuoi1 + " co chua khoang trang");
        }
    }

    // 5
    public void ChuyenChuHoa() {
        System.out.println("Chuoi " + chuoi1 + " sau khi chuyen chu hoa: ");
        System.out.println(chuoi1.toUpperCase());
    }

    // 6
    public void ChuyenChuThuong() {
        System.out.println("Chuoi " + chuoi1 + " sau khi chuyen chu thuong: ");
        System.out.println(chuoi1.toLowerCase());
    }

    // 7
    public void KiemtraBang() {
        String chuoi2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi ban muon so sanh: ");
        chuoi2 = scanner.nextLine();
        if (chuoi1.equals(chuoi2)) {
            System.out.println("Chuoi: " + chuoi1 + " va chuoi: " + chuoi2 + " khong bang nhau");
        } else {
            System.out.println("Chuoi: " + chuoi1 + " va chuoi: " + chuoi2 + " bang nhau");
        }
    }

    // 8
    public void KiemtraBang2() {
        String chuoi2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi ban muon so sanh: ");
        chuoi2 = scanner.nextLine();
        if (chuoi1.equalsIgnoreCase(chuoi2)) {
            System.out.println("Do dai chuoi: " + chuoi1 + " va chuoi: " + chuoi2 + " bang nhau");
        } else {
            System.out.println("Do dai chuoi: " + chuoi1 + " va chuoi: " + chuoi2 + " khong bang nhau");
        }
    }

    // 9
    public void KTChuoi() {
        String chuoi2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi ban muon kiem tra: ");
        chuoi2 = scanner.nextLine();
        if (chuoi1.contains(chuoi2)) {
            System.out.println("Chuoi: " + chuoi1 + " co chua chuoi: " + chuoi2);
        } else {
            System.out.println("Chuoi: " + chuoi1 + " khong chua chuoi: " + chuoi2);
        }
    }

    // 10
    public void KTKiTu() {
        int chuaT = 0, chuaD = 0;
        for (int i = 0; i < chuoi1.length(); i++) {
            char KT = chuoi1.charAt(i);
            if (KT == 't') {
                chuaT++;
            } else if (KT == 'd') {
                chuaD++;
            }
        }
        System.out.println("Chuoi " + chuoi1 + " co " + chuaT + " ki tu 't'");
        System.out.println("Chuoi " + chuoi1 + " co " + chuaD + " ki tu 'd'");
    }

    // 11
    public void Daochuoi() {
        String chuoi2 = new String();
        for (int i = chuoi1.length() - 1; i >= 0; i--) {
            chuoi2 += chuoi1.charAt(i);
        }
        System.out.println("Chuoi: " + chuoi1 + " sau khi dao la: " + chuoi2);
    }

    // 12
    public void ThayThe() {
        System.out.println(chuoi1.replace("t", "T"));
    }

    public static void main(String[] args) {
        BT6 run2 = new BT6();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi cua ban: ");
        String input = scanner.nextLine();
        run2.NhanData(input);
        System.out.println("Chuoi ban vua nhap la: ");
        run2.InChuoi();
        // run2.KTDoDai();
        // run2.KTKhoangTrang();
        // run2.ChuyenChuHoa();
        // run2.ChuyenChuThuong();
        // run2.KiemtraBang();
        // run2.KiemtraBang2();
        // run2.KTChuoi();
        // run2.KTKiTu();
        // run2.Daochuoi();
        // run2.ThayThe();
        scanner.close();
    }
}