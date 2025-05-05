package Nivell2.intermediary;

import Nivell2.agencies.IndividualStockAgency;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    List<IndividualStockAgency> observers = new ArrayList<>();
    List<IndividualStockAgency> subscribers = new ArrayList<>();

    public void addObserver(IndividualStockAgency observer) {
        observers.add(observer);
        subscribers.add(observer);
    }

    public void removeObserver(String observerName) {
        subscribers.removeIf(observer -> observer.getName().equals(observerName));
    }

    public void notifyObservers(String marketChange) {
        for (IndividualStockAgency observer : subscribers) {
            observer.getNotification(marketChange);
        }
    }

    public void showObservers() {
        for (IndividualStockAgency observer : observers) {
            System.out.println(observer.getName());
        }
    }
}
