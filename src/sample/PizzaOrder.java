package sample;


import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PizzaOrder {

    static ArrayList<PizzaDelivery> pizzaDeliveries = new ArrayList<>();

    public static void main(String[] args) {

        File file = new File("dataset/b_little_bit_of_everything.in");
        Main main = new Main();
        main.readFile(file);

//        System.out.println(main.getPizzaList().size());



        while (true){
//            int totalCustomers = main.getTeamsOf2()*2 + main.getTeamsOf3()*3+ main.getTeamsOf4()*4;
            int totalCustomers = main.getTeamsOf3()*3;

            if (totalCustomers>0){

//                while (main.getNoOfPizzas()>=4 && main.getTeamsOf4()>0){
//
//                    ArrayList<Pizza> pizzaFor4 = assignPizzas(main.getPizzaList(),4);
//
//                    if (pizzaFor4.size()==4){
//                        PizzaDelivery pizzaDelivery = new PizzaDelivery();
//                        pizzaDelivery.setNoOfTeamMembers(4);
//                        pizzaDelivery.setPizzasAssigned(pizzaFor4);
//                        pizzaDeliveries.add(pizzaDelivery);
//
//                        main.setNoOfPizzas(main.getNoOfPizzas()-4);
//                        main.setTeamsOf4(main.getTeamsOf4()-1);
//                    }else {
//                        main.getPizzaList().addAll(pizzaFor4);
//
//                    }
//
//
//                }
//                System.out.println(pizzaDeliveries.size());

                while (main.getNoOfPizzas()>=3 && main.getTeamsOf3()>0){

                    ArrayList<Pizza> pizzaFor3 = assignPizzas(main.getPizzaList(),3);

                    if (pizzaFor3.size()==3){
                        PizzaDelivery pizzaDelivery = new PizzaDelivery();
                        pizzaDelivery.setNoOfTeamMembers(3);
                        pizzaDelivery.setPizzasAssigned(pizzaFor3);
                        pizzaDeliveries.add(pizzaDelivery);

                        main.setNoOfPizzas(main.getNoOfPizzas()-3);
                        main.setTeamsOf4(main.getTeamsOf4()-1);
                    }else {
                        main.getPizzaList().addAll(pizzaFor3);

                    }
                    System.out.println("Deliveries "+pizzaDeliveries.size());
                    System.out.println("Pizzas "+main.getPizzaList().size());
                    System.out.println("");


                }
//                while (main.getNoOfPizzas()>=2 && main.getTeamsOf2()>0){
//                    ArrayList<Pizza> pizzaFor2 = assignPizzas(main.getPizzaList(),2);
//                    if (pizzaFor2.size()==2){
//                        PizzaDelivery pizzaDelivery = new PizzaDelivery();
//                        pizzaDelivery.setNoOfTeamMembers(2);
//                        pizzaDelivery.setPizzasAssigned(pizzaFor2);
//                        pizzaDeliveries.add(pizzaDelivery);
//
//                        main.setNoOfPizzas(main.getNoOfPizzas()-2);
//                        main.setTeamsOf4(main.getTeamsOf4()-1);
//                    }else {
//                        main.getPizzaList().addAll(pizzaFor2);
//
//                    }
//
//
//                }
//                System.out.println(pizzaDeliveries.size());


            }else {
                break;
            }
            System.out.println(main.getPizzaList().size());
        }


    }

    public static ArrayList<Pizza> assignPizzas(ArrayList<Pizza> pizzaList, int noOfMembers){

        ArrayList<Pizza> orderedPizzas = new ArrayList<>();
        ArrayList<String> ingredients = new ArrayList<>();

        for (Pizza pizza : pizzaList) {
            ingredients.addAll(Arrays.asList(pizza.getIngredients()));
            if (!isIngredientsDuplicated(ingredients)){
                if (orderedPizzas.size()==noOfMembers){break;}
                orderedPizzas.add(pizza);
            }else {
                for (int i = 0; i < pizza.getIngredients().length; i++) {
                    ingredients.remove(ingredients.size()-1);
                }
            }
        }
        pizzaList.removeAll(orderedPizzas);
        return orderedPizzas;
    }

    public static boolean isIngredientsDuplicated(ArrayList<String> ingredients){
        Set<String> hashSet = new HashSet<>();
        for (String ingredient : ingredients) {
            if (hashSet.add(ingredient) == false){
                return true;
            }
        }
        return false;
    }


    public static boolean findDuplicates(ArrayList<String> names){
        Set<String> store = new HashSet<>();
        for (String name : names) {
            if (store.add(name) == false) {
                return true;
            }
        }
        return false;
    }

}
