package Nivell1.pizzeria;

import java.util.List;

public class Pizza {

    private final String name;
    private final int size;
    private final String doughType;
    private final List<String> toppings;

    public Pizza(String name, int size, String doughType, List<String> toppings) {
        this.name = name;
        this.size = size;
        this.doughType = doughType;
        this.toppings = toppings;
    }

    public int getSize() {
        return size;
    }

    public String getDoughType() {
        return doughType;
    }

    public List<String> getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return "\n--- Pizza " + name + " ---\n\tSize: " + size + "\n\tDough: " + doughType + "\n\tToppings: " + toppings.toString();
    }
}
