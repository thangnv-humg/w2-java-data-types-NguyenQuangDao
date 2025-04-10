import java.util.Scanner;

public class SoNguyenTo {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        int a, b;

        do {
            System.out.print("Nhập số nguyên a: ");
            a = scanner.nextInt();
            System.out.print("Nhập số nguyên b (lớn hơn a): ");
            b = scanner.nextInt();

            if (b <= a) {
                System.out.println("b phải lớn hơn a. Vui lòng nhập lại.");
            }
        } while (b <= a);

        System.out.println("Các số nguyên tố trong khoảng từ " + a + " đến " + b + " là:");

        for (int i = a; i <= b; i++) {
            if (laSoNguyenTo(i)) {
                System.out.print(i + ", ");
            }
        }
    }

    public static boolean laSoNguyenTo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}