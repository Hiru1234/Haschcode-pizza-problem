package sample;

public class Ingredient {
	private int pizzaIndex;
	private String ingredient;

	public Ingredient(int pizzaIndex, String ingredient) {
		this.pizzaIndex = pizzaIndex;
		this.ingredient = ingredient;
	}

	public int getPizzaIndex() {
		return pizzaIndex;
	}

	public void setPizzaIndex(int pizzaIndex) {
		this.pizzaIndex = pizzaIndex;
	}

	public String getIngredient() {
		return ingredient;
	}

	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}
}
