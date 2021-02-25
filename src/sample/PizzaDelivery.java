package sample;


import java.util.ArrayList;

public class PizzaDelivery {

	int noOfTeamMembers;
	ArrayList<Pizza> pizzasAssigned;

	public PizzaDelivery() {

	}


	public int getNoOfTeamMembers() {
		return noOfTeamMembers;
	}

	public void setNoOfTeamMembers(int noOfTeamMembers) {
		this.noOfTeamMembers = noOfTeamMembers;
	}

	public ArrayList<Pizza> getPizzasAssigned() {
		return pizzasAssigned;
	}

	public void setPizzasAssigned(ArrayList<Pizza> pizzasAssigned) {
		this.pizzasAssigned = pizzasAssigned;
	}

	@Override
	public String toString() {
		return "PizzaDelivery{" +
				"noOfTeamMembers=" + noOfTeamMembers +
				", pizzasAssigned=" + pizzasAssigned +
				'}';
	}
}
