public class QlMuonTraSach {
    public QlSach sach;
    public QlBanDoc banDoc;
    public String ngayMuon;
    public String hanTra;

    public void nhapThongTinMuonTra(QlSach sach, QlBanDoc banDoc, String ngayMuon, String hanTra) {
        this.sach = sach;
        this.banDoc = banDoc;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
    }

    public void hienThiThongTinMuonTra() {
        System.out.println("Thông tin mượn trả sách:");
        banDoc.hienThiThongTinBanDoc();
        sach.hienThiThongTinSach();
        System.out.println("Ngày mượn: " + ngayMuon);
        System.out.println("Hạn trả: " + hanTra);
    }
}