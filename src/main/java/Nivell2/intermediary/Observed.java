package Nivell2.intermediary;

import Nivell2.agencies.IndividualStockAgency;

public interface Observed {
    void addObserver(IndividualStockAgency observer);
    void removeObserver(String observerName);
    void notifyObservers(String message);
}
