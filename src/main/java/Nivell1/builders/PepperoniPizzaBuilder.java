package Nivell1.builders;

import Nivell1.pizzeria.Pizza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PepperoniPizzaBuilder implements PizzaBuilder<PepperoniPizzaBuilder> {

    private int size = 10;
    private String doughType = "Thin";
    private List<String> toppings = new ArrayList<>(Arrays.asList("Sauce", "Pepperoni", "Cheese"));

    @Override
    public PepperoniPizzaBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    @Override
    public PepperoniPizzaBuilder setDoughType(String doughType) {
        this.doughType = doughType;
        return this;
    }

    @Override
    public void setToppings(List<String> extraToppings) {
        this.toppings.addAll(extraToppings);
    }

    @Override
    public Pizza build() {
        String NAME = "Pepperoni";
        return new Pizza(NAME, size, doughType, toppings);
    }
}

