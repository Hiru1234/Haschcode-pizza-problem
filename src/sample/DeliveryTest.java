package sample;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class DeliveryTest {

    public static void main(String[] args) {
        ArrayList<PizzaDelivery> pizzaDeliveries = new ArrayList<>();

        String[] ing1 = {"onion","pepper","olive"};
        String[] ing2 = {"mushroom","tomato","basil"};
        String[] ing3 = {"chicken","mushroom","pepper"};
        String[] ing4 = {"tomato","mushroom","basil"};
        String[] ing5 = {"chicken","basil"};

        Pizza pizza1 = new Pizza(0,3,ing1);
        Pizza pizza2 = new Pizza(1,3,ing2);
        Pizza pizza3 = new Pizza(2,3,ing3);
        Pizza pizza4 = new Pizza(3,3,ing4);
        Pizza pizza5 = new Pizza(4,2,ing5);

        ArrayList<Pizza> pizzaDelivered1 = new ArrayList<>(Arrays.asList(pizza2,pizza5));
        ArrayList<Pizza> pizzaDelivered2 = new ArrayList<>(Arrays.asList(pizza1,pizza3,pizza4));

        PizzaDelivery pizzaDelivery1 = new PizzaDelivery(pizzaDelivered1.size(),pizzaDelivered1);
        PizzaDelivery pizzaDelivery2 = new PizzaDelivery(pizzaDelivered2.size(),pizzaDelivered2);

        pizzaDeliveries.add(pizzaDelivery1);
        pizzaDeliveries.add(pizzaDelivery2);

        File outputFile = new File("outputFiles/a_outputFile.txt");

        Main main = new Main();
        main.writeFile(outputFile,pizzaDeliveries);


    }
}

