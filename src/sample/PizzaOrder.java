package sample;


public class PizzaOrder {

    public static void main(String[] args) {

        EvenMorePizzaDes evenMorePizzaDes = new EvenMorePizzaDes(5,1,2,1);
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

        while (true){
            int totalCustomers = evenMorePizzaDes.getNoOfTeamsWith2Members()*2 + evenMorePizzaDes.getNoOfTeamsWith3Members()*3+ evenMorePizzaDes.getNoOfTeamsWith4Members()*4;
            if (evenMorePizzaDes.getTotalNumOfPizza()>1 || totalCustomers>0){

                while (evenMorePizzaDes.getTotalNumOfPizza()>=4 && evenMorePizzaDes.getNoOfTeamsWith4Members()>0){
                    evenMorePizzaDes.setTotalNumOfPizza(evenMorePizzaDes.getTotalNumOfPizza()-4);
                    evenMorePizzaDes.setNoOfTeamsWith4Members(evenMorePizzaDes.getNoOfTeamsWith4Members()-1);
                    System.out.println(evenMorePizzaDes);
                }
                while (evenMorePizzaDes.getTotalNumOfPizza()>=3 && evenMorePizzaDes.getNoOfTeamsWith3Members()>0){
                    evenMorePizzaDes.setTotalNumOfPizza(evenMorePizzaDes.getTotalNumOfPizza()-3);
                    evenMorePizzaDes.setNoOfTeamsWith3Members(evenMorePizzaDes.getNoOfTeamsWith3Members()-1);
                    System.out.println(evenMorePizzaDes);
                }
                while (evenMorePizzaDes.getTotalNumOfPizza()>=2 && evenMorePizzaDes.getNoOfTeamsWith2Members()>0){
                    evenMorePizzaDes.setTotalNumOfPizza(evenMorePizzaDes.getTotalNumOfPizza()-2);
                    evenMorePizzaDes.setNoOfTeamsWith2Members(evenMorePizzaDes.getNoOfTeamsWith2Members()-1);
                    System.out.println(evenMorePizzaDes);
                }

            }else {
                break;
            }
        }

    }
}
