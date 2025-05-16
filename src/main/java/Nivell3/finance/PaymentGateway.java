package Nivell3.finance;

import Nivell3.finance.interfaces.CallbackPayment;
import Nivell3.finance.interfaces.Payment;

public class PaymentGateway {

    public void process(Payment payment, double price, CallbackPayment callback) {
        System.out.println("... Processing payment via -- " + payment);

        try {
            payment.processPayment(price);
            callback.onSuccess("Payment successful");
        } catch (Exception e) {
            callback.onFailure(e);
        }
    }
}