package Nivell3.equity;

public class BankAccount implements Payment {

    private double balance = 12_000;

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
        return "Bank Account";
    }
}
