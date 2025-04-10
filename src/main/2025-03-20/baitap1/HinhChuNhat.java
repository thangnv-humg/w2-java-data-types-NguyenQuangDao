public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    void HienThiThongTin(String name) {
        double chuVi = tinhChuVi();
        double dienTich = tinhDienTich();
        System.out.println("Chu vi " + name + ": " + chuVi);
        System.out.println("Dien tich " + name + ": " + dienTich);
    }

    public static void main(String[] args) {
        HinhChuNhat hcn1 = new HinhChuNhat();
        hcn1.chieuDai = 3;
        hcn1.chieuRong = 4;
        HinhChuNhat hcn2 = new HinhChuNhat();
        hcn2.chieuDai = 6;
        hcn2.chieuRong = 8;
        HinhChuNhat hcn3 = new HinhChuNhat();
        hcn3.chieuDai = 16;
        hcn3.chieuRong = 18;
        hcn1.HienThiThongTin("hcn1");
        hcn2.HienThiThongTin("hcn2");
        hcn3.HienThiThongTin("hcn3");
    }
}
