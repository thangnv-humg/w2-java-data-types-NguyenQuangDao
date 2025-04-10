import java.util.Scanner;

public class FindSecondNumMaxArr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử");
        int n = scanner.nextInt();
        if (n < 2) {
            System.out.println("Mảng cần ít nhất 2 phần tử");
            scanner.close();
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ" + (i + 1) + ":");
            arr[i] = scanner.nextInt();
        }
        int first = arr[0];
        int second = arr[1];
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;
            }
        }

        if (n == 2 && first == second) {
            System.out.println("Không có số lớn thứ 2");
        } else {
            System.out.println("Số lớn thứ 2 là: " + second);
        }
    }
}