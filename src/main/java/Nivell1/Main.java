package Nivell1;

import Nivell1.builders.*;
import Nivell1.interfaces.PizzaBuilder;
import Nivell1.pizzeria.*;

public class Main {
    public static void main(String[] args) {

        PizzaBuilder carbonaraBuilder = new CarbonaraPizzaBuilder();
        PizzaBuilder hawaianBuilder = new HawaianPizzaBuilder();
        PizzaBuilder pepperoniBuilder = new PepperoniPizzaBuilder();

        Pizzaiolo francesco = new Pizzaiolo();

        francesco.makePizza(carbonaraBuilder);
        Pizza carbonara = carbonaraBuilder.bake();
        System.out.println(carbonara);

        francesco.makePizza(hawaianBuilder);
        Pizza hawaian = hawaianBuilder.bake();
        System.out.println(hawaian);

        francesco.makePizza(pepperoniBuilder);
        Pizza pepperoni = pepperoniBuilder.bake();
        System.out.println(pepperoni);
    }
}
