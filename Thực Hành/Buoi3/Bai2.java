import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai2 {
    private List<Product> productList = new ArrayList<>();

    public static void main(String[] args) {
        Bai2 main = new Bai2();
        main.NhapData();
        main.Kiemtra();
    }

    public void NhapData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong san pham: ");
        int soluong = scanner.nextInt();

        for (int i = 0; i < soluong; i++) {
            System.out.println("Nhap thong tin: " + (i + 1) + ":");
            System.out.print("Ten san pham: ");
            String tensp = scanner.next();

            System.out.print("Nha cung cap: ");
            String nhacungcap = scanner.next();

            System.out.print("So luong: ");
            int soLuong = scanner.nextInt(); // Số lượng sửa từ String thành int

            Product product = new Product(tensp, nhacungcap, soLuong);
            productList.add(product);
        }

        System.out.println("Danh sach ban nhap la: " + productList);
    }

    public void Kiemtra() {
        ArrayList<Product> daynhohon4 = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getSoLuong() <= 4) {
                daynhohon4.add(productList.get(i));
            }
        }
        System.out.println("Danh sach san pham co so luong <= 4: ");
        for (Product product : daynhohon4) {
            System.out.println(product);
        }
    }

    class Product {
        private String tenSanPham;
        private String nhaCungCap;
        private int soLuong; // Thay đổi kiểu dữ liệu từ String thành int

        public Product(String tenSanPham, String nhaCungCap, int soLuong) {
            this.tenSanPham = tenSanPham;
            this.nhaCungCap = nhaCungCap;
            this.soLuong = soLuong;
        }

        public int getSoLuong() {
            return soLuong;
        }

        @Override
        public String toString() {
            return "Danh sach san pham: " + tenSanPham + " tu nha cung cap " + nhaCungCap + " co so luong la: "
                    + soLuong;
        }
    }
}
