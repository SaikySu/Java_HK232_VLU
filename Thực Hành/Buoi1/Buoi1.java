public class Buoi1 {

    private String Ma, Ten, DiaChi, DienThoai;
    private double Luong;
    private int DoanhSo;

    // 2

    public Buoi1() {
        this.Ma = "123456";
        this.Ten = "Nguyen Phuoc Dai";
        this.DiaChi = "TP.HCM";
        this.DienThoai = "125486128";
        this.Luong = 22000000;
    }

    // 3

    public Buoi1(String _Ma) {
        this.Ma = _Ma;
    }

    // 4
    public Buoi1(String _Ma, String _Ten, String _DiaChi,
            String _DienThoai, double _Luong) {
        this.Ma = _Ma;
        this.Ten = _Ten;
        this.DiaChi = _DiaChi;
        this.DienThoai = _DienThoai;
        this.Luong = _Luong;
    }

    // 5

    public void Hienthi() {
        System.out.println("Ma Nhan Vien: " + Ma
                + " Ten Nhan Vien: " + Ten
                + " Dia Chi: " + DiaChi
                + " Dien Thoai: " + DienThoai
                + " Luong: " + Luong);
    }

    // 6

    public void InDanhSach(Buoi1[] dsNhanVien) {
        for (int i = 0; i < dsNhanVien.length; i++) {
            System.out.println(dsNhanVien[i].Ma
                    + dsNhanVien[i].Ten
                    + dsNhanVien[i].DiaChi
                    + dsNhanVien[i].DienThoai
                    + dsNhanVien[i].Luong);
        }
    }

    // 7
    // Khởi tạo hàm Protected
    protected void DanhsoThang(int DoanhSo) {
        System.out.println("Nhan vien: " + Ten
                + " dat danh so ban hang trong thang 2 la: "
                + DoanhSo);
    }

    public static void main(String[] args) {
        Buoi1 nv = new Buoi1();
        nv.Hienthi();
        nv.DanhsoThang(3);
    }
}
