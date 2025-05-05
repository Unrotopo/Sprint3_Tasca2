package Nivell3.equity;

public class PaymentGateway {

    public static boolean processOrderPayment(Payment payment, double price) {
        System.out.println("Processing payment via " + payment);
        return payment.processPayment(price);
    }
}
