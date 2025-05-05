package Nivell2;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    List<IndividualStockAgency> observers = new ArrayList<>();
    List<IndividualStockAgency> subscribers = new ArrayList<>();

    void addObserver(IndividualStockAgency observer) {
        observers.add(observer);
        subscribers.add(observer);
    }

    void removeObserver(String observerName) {
        subscribers.removeIf(observer -> observer.getName().equals(observerName));
    }

    void notifyObservers(String marketChange) {
        for (IndividualStockAgency observer : subscribers) {
            observer.getNotification(marketChange);
        }
    }

    void showObservers() {
        for (IndividualStockAgency observer : observers) {
            System.out.println(observer.getName());
        }
    }
}
