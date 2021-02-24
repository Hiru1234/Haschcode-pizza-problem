package sample;


public class pizzaOrder {

    public static void main(String[] args) {

        EvenMorePizzaDes evenMorePizzaDes = new EvenMorePizzaDes(5,1,2,1);
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
