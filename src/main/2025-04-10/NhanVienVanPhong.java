public class NhanVienVanPhong extends NhanVien {
    private int soNgayLamViec;

    // Constructor
    public NhanVienVanPhong(String maNV, String hoTen, double luongCoBan, int soNgayLamViec) {
        super(maNV, hoTen, luongCoBan); // Gọi constructor của lớp cha NhanVien
        this.soNgayLamViec = soNgayLamViec;
    }

    // Getter/Setter cho soNgayLamViec
    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public void setSoNgayLamViec(int soNgayLamViec) {
        if (soNgayLamViec >= 0) {
            this.soNgayLamViec = soNgayLamViec;
        } else {
            System.out.println("Số ngày làm việc không hợp lệ.");
        }
    }

    // Ghi đè (Override) phương thức tính lương
    @Override
    public double tinhLuong() {
        // Lương thực nhận = luongCoBan + soNgayLamViec * 100_000
        return getLuongCoBan() + this.soNgayLamViec * 100_000;
    }

    // Ghi đè phương thức hiển thị để thêm thông tin riêng (tùy chọn)
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin(); // Gọi lại phương thức của lớp cha
        System.out.printf(", Số ngày làm việc: %d", soNgayLamViec);
    }
}