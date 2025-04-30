package Nivell1;

import Nivell1.builders.*;
import Nivell1.pizzeria.Pizzaiolo;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pizzaiolo francesco = new Pizzaiolo();

        HawaianPizzaBuilder hawaianPizza = new HawaianPizzaBuilder();
        PepperoniPizzaBuilder pepperoniPizza = new PepperoniPizzaBuilder();
        CarbonaraPizzaBuilder carbonaraPizza = new CarbonaraPizzaBuilder();

        List<String> extraToppingsHawai = List.of("Tabasco");
        List<String> extraToppingsPepperoni = List.of("Extra cheese", "Red onion");

        hawaianPizza.setSize(10)
                .setDoughType("Thin")
                .setToppings(extraToppingsHawai);

        pepperoniPizza.setSize(16)
                .setDoughType("Thick")
                .setToppings(extraToppingsPepperoni);

        carbonaraPizza
                .setSize(20);

        System.out.println(francesco.makePizza(hawaianPizza));
        System.out.println(francesco.makePizza(pepperoniPizza));
        System.out.println(francesco.makePizza(carbonaraPizza));
    }
}
