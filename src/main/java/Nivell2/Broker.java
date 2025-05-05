package Nivell2;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    List<StockAgency> observers = new ArrayList<>();
    List<StockAgency> subscribers = new ArrayList<>();

    void addObserver(StockAgency observer) {
        observers.add(observer);
        subscribers.add(observer);
    }

    void removeObserver(String observerName) {
        subscribers.removeIf(observer -> observer.getName().equals(observerName));
    }

    void notifyObservers() {
        for (StockAgency observer : subscribers) {
            observer.notifyObserver();
        }
    }

    void showObservers() {
        for (StockAgency observer : observers) {
            System.out.println(observer.getName());
        }
    }
}
