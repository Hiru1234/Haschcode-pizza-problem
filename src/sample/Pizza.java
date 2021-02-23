package sample;

public class Pizza {
    private int pizzaIndex;
    private String[] ingredients;

    public Pizza(int pizzaIndex, String[] ingredients) {
        this.pizzaIndex = pizzaIndex;
        this.ingredients = ingredients;
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

}
