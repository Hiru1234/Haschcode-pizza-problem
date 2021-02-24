package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private final ArrayList<Pizza> pizzaList = new ArrayList<>();
    private int noOfPizzas;
    private int teamsOf2;
    private int teamsOf3;
    private int teamsOf4;

    public static void main(String[] args) {
        File file = new File("dataset/a_example");
        Main main = new Main();
        main.readFile(file);

    }


    public void readFile(File file){
        Pizza pizzaObj;
        try {
            Scanner sc = new Scanner(file);
            boolean firstLineRead = false;
            int index = 0;
            while(sc.hasNextLine()){
                if (!firstLineRead){
                    String[] firstLine = sc.nextLine().split(" ");

                    noOfPizzas = Integer.parseInt(firstLine[0]);
                    teamsOf2 = Integer.parseInt(firstLine[1]);
                    teamsOf3 = Integer.parseInt(firstLine[2]);
                    teamsOf4 = Integer.parseInt(firstLine[3]);
                    firstLineRead = true;

                }else{
                    String line = sc.nextLine();
                    String[] lineAsArray = line.split(" ");
                    int noOfIngredients = Integer.parseInt(String.valueOf(line.charAt(0)));
                    pizzaObj = new Pizza(index,noOfIngredients);
                    for (int i = 0; i < noOfIngredients; i++) {
                        pizzaObj.getIngredients()[i] = lineAsArray[i + 1];
                    }
                    pizzaList.add(pizzaObj);
                    index++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public int getNoOfPizzas() {
        return noOfPizzas;
    }

    public int getTeamsOf2() {
        return teamsOf2;
    }

    public int getTeamsOf3() {
        return teamsOf3;
    }

    public int getTeamsOf4() {
        return teamsOf4;
    }

}
