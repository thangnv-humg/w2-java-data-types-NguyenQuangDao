public class Main {
    public static void main(String[] args) {
       SinhVien sinhVien = new SinhVien();
        sinhVien.msv = "SV001";
        sinhVien.hoTen = "Nguyen Van A";
        sinhVien.diem = 8.5;

        sinhVien.HienThiThongTin("MSV", sinhVien.msv);
        sinhVien.HienThiThongTin("Ho Ten", sinhVien.hoTen);
        sinhVien.HienThiThongTin("Diem", String.valueOf(sinhVien.diem));
    }

}