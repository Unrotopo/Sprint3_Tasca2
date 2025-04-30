package Nivell1.pizzeria;

import Nivell1.builders.PizzaBuilder;

public class Pizzaiolo {

    public Pizza makePizza(PizzaBuilder<?> pizzaBuilder) {
        return pizzaBuilder.build();
    }
}
