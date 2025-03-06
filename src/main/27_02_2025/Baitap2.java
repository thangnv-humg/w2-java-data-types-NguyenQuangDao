import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        // bài 2: viết chương trình kiểm tra xem mảng số nguyên có phải là mảng đối xứng
        // không
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

        boolean isSymmetry = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                isSymmetry = false;
                break;
            }
        }
        if (isSymmetry) {
            System.out.println("Mảng số nguyên trên là mảng đối xứng");
        } else {
            System.out.println("Mảng số nguyên trên không phải là mảng đối xứng");
        }
        scanner.close();
    }

}
