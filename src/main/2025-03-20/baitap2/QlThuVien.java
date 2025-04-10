public class QlThuVien {
    public static void main(String[] args) {
        QlSach sach1 = new QlSach();
        sach1.nhapThongTinSach("S001", "Lập trình Java", "Nguyễn Văn A", 2020, 5);
        QlSach sach2 = new QlSach();
        sach2.nhapThongTinSach("S002", "Cấu trúc dữ liệu", "Trần Thị B", 2019, 3);
        QlBanDoc banDoc1 = new QlBanDoc();
        banDoc1.nhapThongTinBanDoc("BD001", "Nguyễn Văn Đạo", "x@gmail.com", "0123456789");
        QlBanDoc banDoc2 = new QlBanDoc();
        banDoc2.nhapThongTinBanDoc("BD002", "Trần Thị Đạo", "y@gmail.com", "0987654321");
        QlMuonTraSach muon1 = new QlMuonTraSach();
        muon1.nhapThongTinMuonTra(sach1, banDoc1, "20-03-2025", "29-03-2025");

        QlMuonTraSach muon2 = new QlMuonTraSach();
        muon2.nhapThongTinMuonTra(sach2, banDoc2, "20-03-2025", "21-04-2025");

        sach1.muonSach();
        sach2.muonSach();
        System.out.println("\n");
        System.out.println("//////////////////////");

        muon1.hienThiThongTinMuonTra();
        System.out.println("\n");
        muon2.hienThiThongTinMuonTra();
        System.out.println("\n");
        System.out.println("//////////////////////");

        sach1.traSach();
        sach2.traSach();
        System.out.println("\n");
        System.out.println("//////////////////////");

        sach1.hienThiThongTinSach();
        sach2.hienThiThongTinSach();
    }
}