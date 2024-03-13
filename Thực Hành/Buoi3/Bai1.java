import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    public ArrayList<Integer> arr = new ArrayList<>();
    public int soluongphantu;

    // Tao ArrayList
    public Bai1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu co trong danh sach: ");
        soluongphantu = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
    }

    // Nhap du lieu
    public void NhapData() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < soluongphantu; i++) {
            System.out.println("Nhap phan tu nhu: " + i);
            int giatri = scanner.nextInt();
            arr.add(giatri);
        }
        System.out.println("Danh sach ban nhap la: " + arr);
    }

    // Hien thi so luong phan tu
    public void HienThiSoLuong() {
        int a = 0;
        for (int i = 0; i < arr.size(); i++) {
            a += 1;
        }
        System.out.println("Danh sach co: " + a + " phan tu");
    }

    // Hien thi so le
    public void HienThiSoLe() {
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 != 0) {
                b.add(arr.get(i));
            }
        }
        System.out.println("Danh sach sau khi loc so le: " + b);
    }

    // Tong chan
    public void TongChan() {
        int c = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i % 2 == 0) {
                c += i;
            }
        }
        System.out.println("Tong chan la: " + c);
    }

    // Hien thi cac phan tu chia het 5
    public void ChiaNam() {
        ArrayList<Integer> chia5 = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 5 != 0) {
                chia5.add(arr.get(i));
            }
        }
        System.out.println("Danh sach sau khi xoa chia 5: " + chia5);
    }

    // Di chuyen cac so nguyen am sang danh sach moi
    public void SoAm() {
        ArrayList<Integer> soam = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                soam.add(arr.get(i));
            }
        }
        System.out.println("Danh sach so nguyen am la: " + soam);
    }

    public static void main(String[] args) {
        Bai1 run = new Bai1();
        run.NhapData();
        run.HienThiSoLuong();
        run.HienThiSoLe();
        run.TongChan();
        run.ChiaNam();
        run.SoAm();
    }
}
