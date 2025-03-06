public class Demo {
    public static void main(String[] args) {
        // Khai báo và khởi tạo mảng 2 chiều
        int[][] diemSV = new int[3][4];
        System.out.println("diemSV:");
        for (int i = 0; i < diemSV.length; i++) {
            for (int j = 0; j < diemSV[i].length; j++) {
                System.out.print(diemSV[i][j] + " ");
            }
            System.out.println();
        }
        int[][] mang2D = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // In ra các phần tử của mảng
        System.out.println("Cac phan tu cua mang 2 chieu:");
        for (int i = 0; i < mang2D.length; i++) {
            for (int j = 0; j < mang2D[i].length; j++) {
                System.out.print(mang2D[i][j] + " ");
            }
            System.out.println();
        }

        // Tính tổng các phần tử của mảng
        int tong = 0;
        for (int i = 0; i < mang2D.length; i++) {
            for (int j = 0; j < mang2D[i].length; j++) {
                tong += mang2D[i][j];
            }
        }
        System.out.println("Tong cac phan tu: " + tong);

        // String trong java
        String s1 = "string";
        String s2 = new String("String2");
        System.err.println(s1);
        System.err.println(s2);
        // lấy độ dài chuỗi
        int length = s1.length();
        System.err.println(length);

        // truy cập ký tự tại vị trí cụ thể:
        char character = s1.charAt(2);
        System.err.println(character);

        // so sánh chuỗi
        boolean isEqual = s1.equals("string"); // isEqual = true
        boolean isEqualIgnoreCase = s1.equalsIgnoreCase("STRING"); // isEqualIgnoreCase = true
        int comparison = s1.compareTo(s2);

        // cắt chuỗi
        String sub1 = s1.substring(2); // sub1 = "ring"
        String sub2 = s1.substring(1, 4); // sub2 = "tri"
    }
}