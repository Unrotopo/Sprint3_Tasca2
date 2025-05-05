package Nivell3.equity;

public class CreditCard implements Payment {

    private double balance = 500;

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
        return "Credit Card";
    }
}
