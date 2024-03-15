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
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi cua ban: ");
        String chuoi1 = scanner.nextLine();
        run2.NhanData(chuoi1);
        System.out.println("Chuoi ban vua nhap la: " + chuoi1);
        System.out.println("1. In chuoi");
        System.out.println("2. In do dai chuoi");
        System.out.println("3. Kiem tra rong cua chuoi");
        System.out.println("4. Kiem tra khoang trang cua chuoi");
        System.out.println("5. Chuyen chuoi sang dang Hoa");
        System.out.println("6. Chuyen chuoi sang dang thuong");
        System.out.println("7. So sanh 2 chuoi");
        System.out.println("8. So sanh 2 chuoi khong chu in");
        System.out.println("9. Kiem tra su ton tai cua chuoi con");
        System.out.println("10. Kiem tra chuoi co bao nhieu ki tu 't' va 'd'");
        System.out.println("11. Dao chuoi");
        System.out.println("12. Thay the chuoi");
        System.out.println("Nhap tuy chon: ");
        x = scanner.nextInt();
        while (x != 0) {
            switch (x) {
                case 1:
                    run2.InChuoi();
                    break;
                case 2:
                    run2.KTDoDai();
                    break;
                case 3:
                    run2.KTRong();
                    break;
                case 4:
                    run2.KTKhoangTrang();
                    break;
                case 5:
                    run2.ChuyenChuHoa();
                    break;
                case 6:
                    run2.ChuyenChuThuong();
                    break;
                case 7:
                    run2.KiemtraBang();
                    break;
                case 8:
                    run2.KiemtraBang2();
                    break;
                case 9:
                    run2.KTChuoi();
                    break;
                case 10:
                    run2.KTKiTu();
                    break;
                case 11:
                    run2.Daochuoi();
                    break;
                case 12:
                    run2.ThayThe();
                    break;
                default:
                    System.out.println("Khong ton tai lua chon cua ban");
                    break;
            }
            System.out.println("Nhap tuy chon: ");
            x = scanner.nextInt();
        }
        scanner.close();
    }
}