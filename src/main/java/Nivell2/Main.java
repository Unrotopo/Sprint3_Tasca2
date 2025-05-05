package Nivell2;

public class Main {
    public static void main(String[] args) {

        Broker broker = new Broker();

        broker.addObserver(new StockAgency("BrokerAssociated"));
        broker.addObserver(new StockAgency("BrokersBreaking"));
        broker.addObserver(new StockAgency("WeLoveMoney"));
        broker.addObserver(new StockAgency("EveryoneHasAPrice"));

        broker.notifyObservers();

        broker.removeObserver("WeLoveMoney");

        System.out.println("\n----");
        broker.notifyObservers();
        System.out.println("\n --- Listed observers ---");
        broker.showObservers();
    }
}
