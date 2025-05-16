package Nivell3.finance;

import Nivell3.exceptions.NotEnoughFunds;
import Nivell3.finance.interfaces.Payment;

public class CreditCard implements Payment {

    private double balance = 500;

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
        return "Credit Card";
    }
}
