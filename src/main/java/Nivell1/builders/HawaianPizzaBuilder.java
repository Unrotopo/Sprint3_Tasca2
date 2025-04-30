package Nivell1.builders;

import Nivell1.pizzeria.Pizza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HawaianPizzaBuilder implements PizzaBuilder<HawaianPizzaBuilder> {

    private int size = 10;
    private String doughType = "Thin";
    private List<String> toppings = new ArrayList<>(Arrays.asList("Sauce", "Ham", "Pineapple", "Cheese"));

    @Override
    public HawaianPizzaBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    @Override
    public HawaianPizzaBuilder setDoughType(String doughType) {
        this.doughType = doughType;
        return this;
    }

    @Override
    public void setToppings(List<String> extraToppings) {
        this.toppings.addAll(extraToppings);
    }

    @Override
    public Pizza build() {
        String NAME = "Hawaian";
        return new Pizza(NAME, size, doughType, toppings);
    }
}
