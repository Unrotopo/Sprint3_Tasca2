package Nivell3;

import Nivell3.finance.*;
import Nivell3.finance.interfaces.CallbackPayment;
import Nivell3.finance.PaymentGateway;
import Nivell3.finance.interfaces.Payment;
import Nivell3.store.*;

public class Main {
    public static void main(String[] args) {

        ShoeStore shoeStore = new ShoeStore(new PaymentGateway());

        Payment payPal = new PayPal();
        Payment creditCard = new CreditCard();
        Payment bankAccount = new BankAccount();

        CallbackPayment callback = new CallbackPayment() {
            @Override
            public void onSuccess(String message) {
                System.out.println(message);
            }

            @Override
            public void onFailure(Exception e) {}
        };

        shoeStore.addShoe(
                new Shoe("Adidas", 120),
                new Shoe("Adidos", 20),
                new Shoe("GoldenFeet", 790),
                new Shoe("PerfectlyGoodBoots", 60)
        );

        shoeStore.buyShoe("Adidas", payPal, callback);
        shoeStore.buyShoe("Adidos", payPal, callback);

        shoeStore.buyShoe("GoldenFeet", creditCard, callback);
        shoeStore.buyShoe("PerfectlyGoodBoots", creditCard, callback);

        shoeStore.buyShoe("GoldenFeet", bankAccount, callback);
    }
}
