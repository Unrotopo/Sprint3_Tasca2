package Nivell2;

import Nivell2.agencies.IndividualStockAgency;
import Nivell2.intermediary.Broker;

public class Main {
    public static void main(String[] args) {

        Broker broker = new Broker();

        broker.addObserver(new IndividualStockAgency("BrokerAssociated"));
        broker.addObserver(new IndividualStockAgency("BrokersBreaking"));
        broker.addObserver(new IndividualStockAgency("WeLoveMoney"));
        broker.addObserver(new IndividualStockAgency("EveryoneHasAPrice"));

        broker.notifyObservers("up");

        broker.removeObserver("WeLoveMoney");

        System.out.println("\n----");
        broker.notifyObservers("down");

        System.out.println("\n --- Listed observers ---");
        broker.showObservers();
    }
}
