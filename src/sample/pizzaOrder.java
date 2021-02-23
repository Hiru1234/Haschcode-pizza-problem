package sample;

import java.util.concurrent.ThreadLocalRandom;

public class pizzaOrder {

    public static void main(String[] args) {
        int numberOfPizzas = 5;
        int noOfTeamsWith2Members = 1;
        int noOfTeamsWith3Members = 2;
        int noOfTeamsWith4Members = 1;

        menu:
        while (numberOfPizzas>0){
            int teamIndex = ThreadLocalRandom.current().nextInt(2,5);
            switch (teamIndex){
                case 2:
                    if(noOfTeamsWith4Members>0 && numberOfPizzas>=4){
                        numberOfPizzas=-4;
                        noOfTeamsWith4Members=-1;
                        break;
                    }
                case 3:
                    if(noOfTeamsWith3Members>0 && numberOfPizzas>=3){
                        numberOfPizzas=-3;
                        noOfTeamsWith3Members=-1;
                        break;
                    }
                case 4:
                    if(noOfTeamsWith2Members>0 && numberOfPizzas>=2){
                        numberOfPizzas=-2;
                        noOfTeamsWith2Members=-1;
                        break;
                    }
            }

            System.out.println("No. of pizza left : "+numberOfPizzas);
            System.out.println("No. of T2 teams left : "+noOfTeamsWith2Members);
            System.out.println("No. of T3 teams left : "+noOfTeamsWith3Members);
            System.out.println("No. of T4 teams left : "+noOfTeamsWith4Members);
        }
    }
}
