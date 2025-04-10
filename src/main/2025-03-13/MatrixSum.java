import java.util.Scanner;
public class MatrixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int m = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        int n = scanner.nextInt();
        if (m <= 0 || n <= 0) {
            System.out.println("Số hàng và số cột phải lớn hơn 0");
        }
        int[][] matrix = new int[m][n];
        System.out.println("Nhập phần tử ma trận:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập phần tử [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[] rowSums = new int[m];
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += matrix[i][j];
            }
            rowSums[i] = sum;
        }

        int[] colSums = new int[n];
        for (int j = 0; j < n; j++) {
            int sum = 0;
            for (int i = 0; i < m; i++) {
                sum += matrix[i][j];
            }
            colSums[j] = sum;
        }

        // In tổng các hàng
        System.out.print("Tổng các hàng: [");
        for (int i = 0; i < m; i++) {
            System.out.print(rowSums[i]);
            if (i < m - 1) System.out.print(", ");
        }
        System.out.println("]");

        // In tổng các cột
        System.out.print("Tổng các cột: [");
        for (int j = 0; j < n; j++) {
            System.out.print(colSums[j]);
            if (j < n - 1) System.out.print(", ");
        }
        System.out.println("]");

         // Tìm tổng lớn nhất của hàng
         int maxRowSum = rowSums[0];
         int maxRowIndex = 0;
         for (int i = 1; i < m; i++) {
             if (rowSums[i] > maxRowSum) {
                 maxRowSum = rowSums[i];
                 maxRowIndex = i;
             }
         }
 
         // Tìm tổng lớn nhất của cột
         int maxColSum = colSums[0];
         int maxColIndex = 0;
         for (int j = 1; j < n; j++) {
             if (colSums[j] > maxColSum) {
                 maxColSum = colSums[j];
                 maxColIndex = j;
             }
         }
 
         //kết quả
         if (maxRowSum > maxColSum) {
             System.out.println("Hàng có tổng lớn nhất là hàng " + (maxRowIndex + 1) + " với tổng " + maxRowSum + ".");
         } else if (maxColSum > maxRowSum) {
             System.out.println("Cột có tổng lớn nhất là cột " + (maxColIndex + 1) + " với tổng " + maxColSum + ".");
         } else {
             System.out.println("Hàng " + (maxRowIndex + 1) + " và cột " + (maxColIndex + 1) + " có tổng bằng nhau và lớn nhất: " + maxRowSum + ".");
         }
 
         scanner.close();
    }
}
