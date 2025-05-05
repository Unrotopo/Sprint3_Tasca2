package Nivell3.equity;

public class PayPal implements Payment {

    private double balance = 20;

    @Override
    public boolean processPayment(double price) {
        if (price > balance) {
            return false;
        } else {
            balance = balance - price;
            return true;
        }
    }

    @Override
    public String toString() {
        return "PayPal";
    }
}
