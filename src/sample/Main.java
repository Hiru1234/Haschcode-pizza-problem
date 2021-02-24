package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private final ArrayList<Pizza> pizzaList = new ArrayList<>();

    public static void main(String[] args) {
        File file = new File("dataset/e_many_teams.in");
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
                    sc.nextLine();
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
        System.out.println(pizzaList.size());
    }


}
