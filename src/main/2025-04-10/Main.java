import java.util.ArrayList;
import java.util.Locale; // Để định dạng số tiền tệ

public class Main {

    public static void main(String[] args) {

        // 1. Tạo danh sách ArrayList<NhanVien>
        ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();

        // 2. Thêm 1 vài nhân viên văn phòng và nhân viên sản xuất
        NhanVien nv1 = new NhanVienVanPhong("VP001", "Nguyễn Văn An", 7000000, 22);
        NhanVien nv2 = new NhanVienSanXuat("SX001", "Trần Thị Bình", 5000000, 150);
        NhanVien nv3 = new NhanVienVanPhong("VP002", "Lê Minh Cường", 8500000, 20);
        NhanVien nv4 = new NhanVienSanXuat("SX002", "Phạm Thị Dung", 5500000, 185);
        // Thêm nhân viên "thường" (nếu có thể) để kiểm tra phương thức gốc
        NhanVien nv5 = new NhanVien("NV001", "Hoàng Văn Giang", 6000000);

        danhSachNhanVien.add(nv1);
        danhSachNhanVien.add(nv2);
        danhSachNhanVien.add(nv3);
        danhSachNhanVien.add(nv4);
        danhSachNhanVien.add(nv5);


        System.out.println("--- DANH SÁCH THÔNG TIN NHÂN VIÊN ---");
        // 3. Duyệt danh sách và hiển thị thông tin
        for (NhanVien nv : danhSachNhanVien) {
            // Lấy thông tin cơ bản
            String maNV = nv.getMaNV();
            String hoTen = nv.getHoTen();
            // Tính lương thực nhận (sẽ gọi phương thức đúng của lớp con nhờ tính đa hình)
            double luongThucNhan = nv.tinhLuong();

            // Hiển thị thông tin
            // Cách 1: Hiển thị cơ bản
            System.out.printf("Mã NV: %s, Họ tên: %s, Lương thực nhận: %,.0f VND%n",
                              maNV, hoTen, luongThucNhan);

            // Cách 2: Sử dụng phương thức hienThiThongTin() đã override (nếu có)
            // nv.hienThiThongTin(); // Hiển thị mã, tên, và thông tin thêm như số ngày/sản phẩm
            // System.out.printf(", Lương thực nhận: %,.0f VND%n", luongThucNhan); // Hiển thị lương
            // System.out.println("--------------------"); // Thêm dòng phân cách
        }
    }
}