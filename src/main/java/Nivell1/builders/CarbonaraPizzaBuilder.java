package Nivell1.builders;

import Nivell1.pizzeria.Pizza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarbonaraPizzaBuilder implements PizzaBuilder<CarbonaraPizzaBuilder> {

    private int size = 10;
    private String doughType = "Thin";
    private List<String> toppings = new ArrayList<>(Arrays.asList("Guanciale", "Egg", "Truffle"));

    @Override
    public CarbonaraPizzaBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    @Override
    public CarbonaraPizzaBuilder setDoughType(String doughType) {
        this.doughType = doughType;
        return this;
    }

    @Override
    public void setToppings(List<String> extraToppings) {
        this.toppings.addAll(extraToppings);
    }

    @Override
    public Pizza build() {
        String NAME = "Carbonara";
        return new Pizza(NAME, size, doughType, toppings);
    }
}
