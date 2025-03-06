import java.util.Scanner;

// kiểm tra xem có phải chuỗi đối xứng không
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine().replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println(input.equals(reversed) ? "Chuỗi đối xứng" : "Chuỗi không đối xứng");
        scanner.close();
    }
}