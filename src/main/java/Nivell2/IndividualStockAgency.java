package Nivell2;

public class IndividualStockAgency implements StockAgency {

    private String name;

    public IndividualStockAgency(String name) {
        this.name = name;
    }

    @Override
    public void getNotification(String marketChange) {
        System.out.println("Notifying: " + name + "\n\t- Market has gone " + marketChange);
    }

    public String getName() {
        return name;
    }
}
