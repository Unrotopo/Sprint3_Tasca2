package Nivell1.pizzeria;

import java.util.List;

public class Pizza {

    private String name;
    private int size;
    private String doughType;
    private List<String> toppings;

    public Pizza(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setDoughType(String doughType) {
        this.doughType = doughType;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "\n--- Pizza " + name +
                " ---\n\tSize: " + size +
                "\n\tDough: " + doughType +
                "\n\tToppings: " + toppings.toString();
    }
}
