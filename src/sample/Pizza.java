package sample;

import java.util.Arrays;

public class Pizza {
    private int pizzaIndex;
    private String[] ingredients;
    private int noOfIngredients;

    public Pizza(int pizzaIndex, String[] ingredients) {
        this.pizzaIndex = pizzaIndex;
        this.ingredients = ingredients;
    }

    public Pizza(int pizzaIndex, int noOfIngredients) {
        this.pizzaIndex = pizzaIndex;
        ingredients = new String[noOfIngredients];
    }

    public int getPizzaIndex() {
        return pizzaIndex;
    }

    public void setPizzaIndex(int pizzaIndex) {
        this.pizzaIndex = pizzaIndex;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaIndex=" + pizzaIndex +
                ", ingredients=" + Arrays.toString(ingredients) +
                '}';
    }
}
