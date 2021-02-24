package sample;

public class EvenMorePizzaDes {
    private int totalNumOfPizza;
    private int noOfTeamsWith2Members;
    private int noOfTeamsWith3Members;
    private int noOfTeamsWith4Members;

    public EvenMorePizzaDes(int totalNumOfPizza, int noOfTeamsWith2Members, int noOfTeamsWith3Members, int noOfTeamsWith4Members) {
        this.totalNumOfPizza = totalNumOfPizza;
        this.noOfTeamsWith2Members = noOfTeamsWith2Members;
        this.noOfTeamsWith3Members = noOfTeamsWith3Members;
        this.noOfTeamsWith4Members = noOfTeamsWith4Members;
    }

    @Override
    public String toString() {
        return "EvenMorePizzaDes{" +
                "totalNumOfPizza=" + totalNumOfPizza +
                ", noOfTeamsWith2Members=" + noOfTeamsWith2Members +
                ", noOfTeamsWith3Members=" + noOfTeamsWith3Members +
                ", noOfTeamsWith4Members=" + noOfTeamsWith4Members +
                '}';
    }
}
