package Nivell3.finance;

import Nivell3.exceptions.NotEnoughFunds;
import Nivell3.finance.interfaces.Payment;

public class PayPal implements Payment {

    private double balance = 20;

    @Override
    public void processPayment(double price) {
        if (price > balance) {
            throw new NotEnoughFunds(this);
        } else {
            balance = balance - price;
        }
    }

    @Override
    public String toString() {
        return "PayPal";
    }
}
