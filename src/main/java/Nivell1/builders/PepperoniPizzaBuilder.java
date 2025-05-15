package Nivell1.builders;

import Nivell1.interfaces.PizzaBuilder;
import Nivell1.pizzeria.Pizza;

import java.util.Arrays;
import java.util.List;

public class PepperoniPizzaBuilder implements PizzaBuilder {

    private Pizza pizza;
    private String name = "Pepperoni";
    private List<String> pepperoniToppings = Arrays.asList("Tomato", "Mozzarella", "Spicy pepperoni");

    public PepperoniPizzaBuilder() {
        pizza = new Pizza(name);
    }

    @Override
    public void buildSize() {
        pizza.setSize(16);
    }

    @Override
    public void buildDoughType() {
        pizza.setDoughType("Crust");
    }

    @Override
    public void buildToppings() {
        pizza.setToppings(pepperoniToppings);
    }

    @Override
    public Pizza bake() {
        return this.pizza;
    }
}

