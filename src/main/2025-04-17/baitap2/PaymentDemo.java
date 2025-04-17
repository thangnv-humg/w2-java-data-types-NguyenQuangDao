// 2121050451_Nguyễn Quang Đạo 
interface Payable {
    boolean pay(double amount);
    String getProviderName();
}

class CreditCardPayment implements Payable {
    private String cardNumber;
    public CreditCardPayment(String cardNumber, String cardHolderName, String expiryDate) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Đang xử lý thanh toán thẻ tín dụng với số tiền: " + amount + ", số thẻ: " + cardNumber);
        return true;
    }

    @Override
    public String getProviderName() {
        return "Credit Card";
    }
}

class PayPalPayment implements Payable {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Đang xử lý thanh toán PayPal với số tiền: " + amount + ", email tài khoản: " + email);
        return true;
    }

    @Override
    public String getProviderName() {
        return "PayPal";
    }
}

class PaymentProcessor {
    public void processPayment(Payable paymentMethod, double amount) {
        boolean success = paymentMethod.pay(amount);
        if (success) {
            String providerName = paymentMethod.getProviderName();
            System.out.println("Thanh toán thành công qua " + providerName);
        } else {
            System.out.println("Thanh toán thất bại");
        }
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        CreditCardPayment creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "Nguyen Van A", "12/25");
        PayPalPayment paypalPayment = new PayPalPayment("nguyenvana@example.com");
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        paymentProcessor.processPayment(creditCardPayment, 100.0);
        paymentProcessor.processPayment(paypalPayment, 50.0);
    }
}