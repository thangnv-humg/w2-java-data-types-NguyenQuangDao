import java.util.Scanner;

public class TachChuoi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String chuoiNhap = scanner.nextLine();
        String[] mangTu = chuoiNhap.split("\\s+"); 
        System.out.println("Mảng kết quả:");
        for (String tu : mangTu) {
            System.out.println(tu);
        }
        scanner.close(); 
    }
}