package Nivell3.store;

import Nivell3.finance.interfaces.CallbackPayment;
import Nivell3.finance.PaymentGateway;
import Nivell3.finance.interfaces.Payment;

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

    public void buyShoe(String shoeName, Payment payment, CallbackPayment callback) {
        double price = getPriceFromShoeName(shoeName);
        System.out.println("\n... Processing payment for " + shoeName + " with price " + price);
        gateway.process(payment, price, callback);
    }

    public void addShoe(Shoe... shoes) {
        inventory.addAll(Arrays.asList(shoes));
    }

    public String showInventory() {
        return inventory.stream().map(Shoe::toString).collect(Collectors.joining("\n"));
    }
}
