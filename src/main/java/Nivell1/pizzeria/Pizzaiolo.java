package Nivell1.pizzeria;

import Nivell1.interfaces.PizzaBuilder;

public class Pizzaiolo {

    public Pizza makePizza(PizzaBuilder pizzaBuilder) {
        pizzaBuilder.buildSize();
        pizzaBuilder.buildDoughType();
        pizzaBuilder.buildToppings();
        return pizzaBuilder.bake();
    }
}
