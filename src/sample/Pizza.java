package sample;

import java.util.Arrays;

public class Pizza {
    private int pizzaIndex;
    private int noOfIngredients;
    private String[] ingredients;


    public Pizza(int pizzaIndex,int noOfIngredients, String[] ingredients) {
        this.pizzaIndex = pizzaIndex;
        this.noOfIngredients = noOfIngredients;
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

    public int getNoOfIngredients() {
        return noOfIngredients;
    }

    public void setNoOfIngredients(int noOfIngredients) {
        this.noOfIngredients = noOfIngredients;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaIndex=" + pizzaIndex +
                ", ingredients=" + Arrays.toString(ingredients) +
                '}';
    }
}
