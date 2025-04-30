package Nivell1.builders;

import Nivell1.pizzeria.Pizza;

import java.util.List;

public interface PizzaBuilder<T extends PizzaBuilder> {

    T setSize(int size);
    T setDoughType(String doughType);
    void setToppings(List<String> extraToppings);
    Pizza build();
}
