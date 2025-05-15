package Nivell1.interfaces;

import Nivell1.pizzeria.Pizza;

public interface PizzaBuilder {

    void buildSize();
    void buildDoughType();
    void buildToppings();
    Pizza bake();
}
