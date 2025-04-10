public class NhanVienSanXuat extends NhanVien {
    private int soSanPham;

    // Constructor
    public NhanVienSanXuat(String maNV, String hoTen, double luongCoBan, int soSanPham) {
        super(maNV, hoTen, luongCoBan); // Gọi constructor của lớp cha NhanVien
        this.soSanPham = soSanPham;
    }

    // Getter/Setter cho soSanPham
    public int getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(int soSanPham) {
        if (soSanPham >= 0) {
            this.soSanPham = soSanPham;
        } else {
            System.out.println("Số sản phẩm không hợp lệ.");
        }
    }

    // Ghi đè (Override) phương thức tính lương
    @Override
    public double tinhLuong() {
        // Lương thực nhận = luongCoBan + soSanPham * 50_000
        return getLuongCoBan() + this.soSanPham * 50_000;
    }

     // Ghi đè phương thức hiển thị để thêm thông tin riêng (tùy chọn)
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin(); // Gọi lại phương thức của lớp cha
        System.out.printf(", Số sản phẩm: %d", soSanPham);
    }
}