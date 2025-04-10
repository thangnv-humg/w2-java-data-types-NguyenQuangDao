public class NhanVien {
    private String maNV;
    private String hoTen;
    private double luongCoBan;

    // Constructor
    public NhanVien(String maNV, String hoTen, double luongCoBan) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
    }

    // Getters
    public String getMaNV() {
        return maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    // Setters 
    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setLuongCoBan(double luongCoBan) {
        if (luongCoBan >= 0) {
            this.luongCoBan = luongCoBan;
        } else {
            System.out.println("Lương cơ bản không hợp lệ.");
        }
    }

    // Phương thức tính lương (mặc định)
    public double tinhLuong() {
        return this.luongCoBan;
    }

    // Phương thức hiển thị thông tin cơ bản (tiện lợi cho các lớp con)
    public void hienThiThongTin() {
        System.out.printf("Mã NV: %s, Họ tên: %s", maNV, hoTen);
        // Lương sẽ được hiển thị cụ thể hơn ở lớp Main sau khi gọi tinhLuong()
    }
}