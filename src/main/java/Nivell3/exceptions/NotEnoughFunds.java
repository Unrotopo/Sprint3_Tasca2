package Nivell3.exceptions;

import Nivell3.finance.interfaces.Payment;

public class NotEnoughFunds extends RuntimeException {
    public NotEnoughFunds(Payment payment) {
        System.out.println("There are not enough funds to process via " + payment);
    }
}
