import java.util.Scanner;

public class CheckPasswordStrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mật khẩu cần kiểm tra:");
        String password = scanner.nextLine();
        if (isStrongPassword(password)) {
            System.out.println("Đây là mật khẩu mạnh.");
        } else {
            System.out.println("Mật khẩu chưa mạnh.");
        }
        scanner.close();
    }

    public static boolean isStrongPassword(String password) {

        if (password.length() < 8) {
            System.out.println("Mật khẩu phải nhiều hơn 8 kí tự");
            return false;
        }
        boolean checkUppercase = false;
        boolean checkLowercase = false;
        boolean checkNumber = false;
        boolean checkspecialChar = false;
        String specialChar = ":}{<>?|!@#$%ˆ&*()_+";

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                checkUppercase = true;
            } else if (Character.isLowerCase(ch)) {
                checkLowercase = true;
            } else if (Character.isDigit(ch)) {
                checkNumber = true;
            } else if (specialChar.indexOf(ch) != -1) {
                checkspecialChar = true;
            }
        }
        return checkLowercase && checkUppercase && checkNumber && checkspecialChar;
    }
}
