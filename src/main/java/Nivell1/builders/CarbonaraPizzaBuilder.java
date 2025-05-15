package Nivell1.builders;

import Nivell1.interfaces.PizzaBuilder;
import Nivell1.pizzeria.Pizza;

import java.util.Arrays;
import java.util.List;

public class CarbonaraPizzaBuilder implements PizzaBuilder {

    private Pizza pizza;
    private final String name = "Carbonara";
    private final List<String> carbonaraToppings = Arrays.asList("Mozzarella", "Guanciale", "Egg");

    public CarbonaraPizzaBuilder() {
        this.pizza = new Pizza(name);
    }

    @Override
    public void buildSize() {
        pizza.setSize(20);
    }

    @Override
    public void buildDoughType() {
        pizza.setDoughType("Thin");
    }

    @Override
    public void buildToppings() {
        pizza.setToppings(carbonaraToppings);
    }

    @Override
    public Pizza bake() {
        return this.pizza;
    }
}
