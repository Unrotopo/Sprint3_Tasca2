package Nivell3.store;

import Nivell3.equity.Payment;
import Nivell3.equity.PaymentGateway;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ShoeStore {

    private List<Shoe> inventory;
    private PaymentGateway gateway;

    public ShoeStore(PaymentGateway gateway) {
        this.inventory = new ArrayList<>();
        this.gateway = gateway;
    }

    public double getPriceFromShoeName(String shoeName) {
        double price = 0;
        for (Shoe shoe : inventory) {
            if (shoe.getName().equals(shoeName)) {
                price = shoe.getPrice();
            }
        }
        return price;
    }

    public void buyShoe(String shoeName, Payment payment) {
        double price = getPriceFromShoeName(shoeName);
        System.out.println("\nProcessing payment for " + shoeName + " with price " + price);
        boolean paymentSuccess = PaymentGateway.processOrderPayment(payment, price);
        if (paymentSuccess) {
            System.out.println("Payment successful");
        } else {
            System.out.println("Payment failed. Order cancelled");
        }
    }

    public void addShoe(Shoe... shoes) {
        inventory.addAll(Arrays.asList(shoes));
    }

    public List<Shoe> getInventory() {
        return inventory;
    }

    public String showInventory() {
        return inventory.stream().map(Shoe::toString).collect(Collectors.joining("\n"));
    }
}
