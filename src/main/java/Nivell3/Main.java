package Nivell3;

import Nivell3.equity.*;
import Nivell3.store.*;

public class Main {
    public static void main(String[] args) {

        PaymentGateway paymentGateway = new PaymentGateway();
        ShoeStore shoeStore = new ShoeStore(paymentGateway);

        Payment payPal = new PayPal();
        Payment creditCard = new CreditCard();
        Payment bankAccount = new BankAccount();

        shoeStore.addShoe(
                new Shoe("Adidas", 120),
                new Shoe("Adidos", 20),
                new Shoe("GoldenFeet", 790),
                new Shoe("PerfectlyGoodBoots", 60)
        );

        shoeStore.buyShoe("Adidas", payPal);
        shoeStore.buyShoe("Adidos", payPal);

        shoeStore.buyShoe("GoldenFeet", creditCard);
        shoeStore.buyShoe("PerfectlyGoodBoots", creditCard);

        shoeStore.buyShoe("GoldenFeet", bankAccount);
    }
}
