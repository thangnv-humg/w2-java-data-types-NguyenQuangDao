public class QlSach {
    public String maSo;
    public String tenSach;
    public String tacGia;
    public int namXuatBan;
    public int soLuong;

    public void nhapThongTinSach(String maSo, String tenSach, String tacGia, int namXuatBan, int soLuong) {
        this.maSo = maSo;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    public void hienThiThongTinSach() {
        System.out.println("Mã số sách: " + maSo);
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Số lượng còn lại: " + soLuong);
    }

    public void muonSach() {
        if (soLuong > 0) {
            soLuong--;
            System.out.println("Đã mượn sách: " + tenSach);
        } else {
            System.out.println("Không còn sách " + tenSach + " để mượn.");
        }
    }

    public void traSach() {
        soLuong++;
        System.out.println("Đã trả sách: " + tenSach);
    }
}