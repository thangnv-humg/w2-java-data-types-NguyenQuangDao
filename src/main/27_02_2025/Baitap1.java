import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        // bài 1 nhập 1 mảng số nguyên từ bàn phím và tìm phần tử lớn nhất, nhỏ nhất
        // trong mảng
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử trong mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            while (!scanner.hasNextInt()) {
                System.out.print("Vui lòng nhập một số nguyên: ");
                scanner.next();
            }
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + min);
        scanner.close();
    }
}
