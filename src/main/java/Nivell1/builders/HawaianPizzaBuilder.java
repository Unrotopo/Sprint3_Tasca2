package Nivell1.builders;

import Nivell1.interfaces.PizzaBuilder;
import Nivell1.pizzeria.Pizza;

import java.util.Arrays;
import java.util.List;


public class HawaianPizzaBuilder implements PizzaBuilder {

    private Pizza pizza;
    private String name = "Hawaian";
    private List<String> hawaianToppings = Arrays.asList("Tomato", "Mozzarella", "Ham", "Pinnaple");

    public HawaianPizzaBuilder() {
        pizza = new Pizza(name);
    }

    @Override
    public void buildSize() {
        pizza.setSize(18);
    }

    @Override
    public void buildDoughType() {
        pizza.setDoughType("Thick");
    }

    @Override
    public void buildToppings() {
        pizza.setToppings(hawaianToppings);
    }

    @Override
    public Pizza bake() {
        return this.pizza;
    }
}
