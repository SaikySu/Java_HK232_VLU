import java.io.*;

class SinhVien implements Serializable {
    private String ten;
    private int namSinh;
    private double diemTrungBinh;

    public SinhVien(String ten, int namSinh, double diemTrungBinh) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String toString() {
        return "Ten: " + ten + ", Nam sinh: " + namSinh + ", Diem trung binh: " + diemTrungBinh;
    }

    // Ghi đối tượng SinhVien vào file nhị phân
    public static void ghiSinhVien(SinhVien sv, String tenFile) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(tenFile))) {
            oos.writeObject(sv);
            System.out.println("Da ghi doi tuong SinhVien vào file: " + tenFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Đọc đối tượng SinhVien từ file nhị phân
    public static SinhVien docSinhVien(String tenFile) {
        SinhVien sv = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(tenFile))) {
            sv = (SinhVien) ois.readObject();
            System.out.println("Da doc doi tuong sinh vien tu file: " + tenFile);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return sv;
    }
}

public class Buoi4 {
    public static void main(String[] args) {
        // Tạo đối tượng SinhVien
        SinhVien sv1 = new SinhVien("Nguyen Van A", 2000, 8.5);

        // Ghi đối tượng SinhVien vào file nhị phân
        SinhVien.ghiSinhVien(sv1, "sinhvien.bin");

        // Đọc đối tượng SinhVien từ file nhị phân
        SinhVien sv2 = SinhVien.docSinhVien("sinhvien.bin");

        // In thông tin đối tượng SinhVien ra màn hình
        if (sv2 != null) {
            System.out.println("Thong tin SinhVien:");
            System.out.println(sv2);
        }
    }
}
