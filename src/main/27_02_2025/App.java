public class App {
    public static void main(String[] args) {
        // mảng 1 chiều
        // 1.1 khai báo
        // c1: khai báo và khởi tạo luôn phần tử
        int[] arr1 = { 1, 2, 3, 6, 8, 5 };

        // c2 khai báo và ccap kích thước mảng
        int[] arr2 = new int[5];

        // c3 khai báo trước khỏi tạo sau
        int[] arr3;
        // 1.2 truy xuất các phần tử mảng
        System.out.println(arr1[0]);

        // 1.3 lấy kích thước mảng
        System.out.println(arr1.length);

        // 1.4 duyệt mảng
        // cách 1:
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        // cách 2:
        for (int x : arr1) {
            System.out.println(x);
        }
        // in ra số chẵn trong mảng
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] % 2 == 0){
                System.out.println("Số chẵn trong mảng là: " + arr1[i]);

            }
        }

        // tìm phần tử lớn nhất trong mảng
        int max = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] > max){
                max = arr1[i];
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là: " + max);

        // sắp xếp mảng tăng dần
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if(arr1[i] > arr1[j]){
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        for (int x : arr1) {
            System.out.println(x);
        }

        // tìm kiếm phần tử trong mảng
        int search = 5; 
        boolean check = false;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] == search){
                check = true;
                break;
            }
        }
        if(check){
            System.out.println("Phần tử " + search + " có trong mảng");
        }else{
            System.out.println("Phần tử " + search + " không có trong mảng");
        }
    }
}
