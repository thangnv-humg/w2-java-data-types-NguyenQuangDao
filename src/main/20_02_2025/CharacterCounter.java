import java.util.Scanner;

// check kí số kí tự có trong chuỗi
public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine().toLowerCase();
        System.out.print("Nhập ký tự cần đếm: ");
        char target = scanner.nextLine().toLowerCase().charAt(0);
        int count = 0;

        for (char c : str.toCharArray()) {
            if (c == target) count++;
        }

        if (count > 0) {
            System.out.printf("Ký tự '%c' xuất hiện %d lần trong chuỗi.\n", target, count);
        } else {
            System.out.println("Ký tự không có trong chuỗi.");
        }
        scanner.close();
    }
}