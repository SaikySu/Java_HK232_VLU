import java.util.Scanner;

public class Buoi5 {

    // Câu 1. Nhập một xâu kí tự (chuỗi), đếm số lượng các từ trong xâu kí tự đó
    // (các từ có thể cách nhau bằng nhiều khoảng trắng ).
    public void Cau1() {
        String str = new String();
        Scanner scanner = new Scanner(System.in);
        int ChieudaiChuoi = 0;
        System.out.println("Nhap chuoi: ");
        str = scanner.nextLine();
        str = str.replaceAll(" ", "");
        for (int i = 0; i < str.length(); i++) {
            ChieudaiChuoi += 1;
        }
        System.out.println("Chieu dai cua chuoi la: " + ChieudaiChuoi);
    }

    // Câu 2. Viết chương trình nhập từ bàn phím một chuỗi và nhập mới một ký tự bất
    // kỳ.
    // Đếm và in ra màn hình số lần xuất hiện của ký tự đó trong chuỗi vừa nhập.

    public void Cau2() {
        String str2 = new String();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi bat ki: ");
        str2 = scanner.nextLine();
        System.out.println("Nhap ki tu bat ki: ");
        int solanlap = 0;
        char a = scanner.next().charAt(0);
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == a) {
                solanlap++;
            }
        }
        System.out.println("Danh sach ban da nhap la: " + str2);
        System.out.println("Ki tu ban da nhap la: " + a + " da lap "
                + solanlap + " lan trong chuoi");
    }

    // Câu 3. Viết chương trình nhập vào một chuỗi bất kỳ bao gồm cả số, ký tự
    // thường và ký tự hoa từ bàn phím. Sau đó đếm và in ra số ký tự thường và ký tự
    // hoa và số có trong chuỗi đó.
    public void Cau3() {
        String str3 = new String();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap mot chuoi bat ki: ");
        str3 = scanner.nextLine();
        int ChuThuong = 0, ChuHoa = 0, KiTuDatBiet = 0;
        for (int i = 0; i < str3.length(); i++) {
            char Kitu = str3.charAt(i);
            if (Character.isLowerCase(Kitu)) {
                ChuThuong++;
            } else if (Character.isUpperCase(Kitu)) {
                ChuHoa++;
            } else if (Character.isDigit(Kitu)) {
                KiTuDatBiet++;
            }
        }
        System.out.println("Chuoi ban nhap la: " + str3);
        System.out.println("Co " + ChuThuong + " ki tu thuong");
        System.out.println("Co " + ChuHoa + " ki tu hoa");
        System.out.println("Co " + KiTuDatBiet + " ki tu dat biet");
    }

    public static void main(String[] args) {
        Buoi5 run = new Buoi5();
        run.Cau1();
        run.Cau2();
        run.Cau3();
    }
}
