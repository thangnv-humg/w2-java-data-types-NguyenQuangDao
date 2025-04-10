public class QlBanDoc {
    public String maSo;
    public String hoTen;
    public String email;
    public String soDienThoai;

    public void nhapThongTinBanDoc(String maSo, String hoTen, String email, String soDienThoai) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.email = email;
        this.soDienThoai = soDienThoai;
    }

    public void hienThiThongTinBanDoc() {
        System.out.println("Mã số bạn đọc: " + maSo);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Email: " + email);
        System.out.println("Số điện thoại: " + soDienThoai);
    }
}