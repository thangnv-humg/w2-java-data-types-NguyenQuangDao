import java.util.Scanner;

public class ChuoiThanhMaTran {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String chuoiNhap = scanner.nextLine();
        System.out.print("Nhập số cột (n): ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Số cột phải lớn hơn 0.");
            scanner.close();
            return;
        }
        int length = chuoiNhap.length();
        int numRows = (int) Math.ceil((double) length / n);
        char[][] maTranKyTu = new char[numRows][n];

        int chuoiIndex = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < n; j++) {
                if (chuoiIndex < length) {
                    maTranKyTu[i][j] = chuoiNhap.charAt(chuoiIndex++);
                } else {
                    maTranKyTu[i][j] = '*';
                }
            }
        }

        // in ma trận
        System.out.println("Ma trận ký tự:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(maTranKyTu[i][j]);
            }
            // xuống dòng
            System.out.println();
        }

        scanner.close();
    }
}
