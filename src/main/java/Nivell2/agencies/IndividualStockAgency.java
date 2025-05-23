package Nivell2.agencies;

public class IndividualStockAgency implements Observer {

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
