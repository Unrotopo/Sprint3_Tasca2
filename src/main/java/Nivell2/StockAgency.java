package Nivell2;

public class StockAgency {

    private String name;

    public StockAgency(String name) {
        this.name = name;
    }

    public void notifyObserver() {
        System.out.println("Notifying " + name);
    }

    public String getName() {
        return name;
    }
}
