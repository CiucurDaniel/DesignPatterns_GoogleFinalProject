package StrategyPattern;

import java.io.FileWriter;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // example data
        ArrayList<Employee> employeesList = new ArrayList<>();
        ArrayList<Food> foodList = new ArrayList<>();

        //create some emplyees
        CEO person1 = new CEO("Mihai");
        Developer person2 = new Developer("Dani");
        TeamLeader person3 = new TeamLeader("Ionut");

        //add them to our employees list
        employeesList.add(person1); employeesList.add(person2); employeesList.add(person3);

        //create food items
        Food supa = new Food("Supa de taitei", 14);
        Food felul2 = new Food("Cartofi prajiti si piept de pui", 18);
        Food desert = new Food("Clatite cu ciocolata", 8);

        try(FileWriter csvWriter = new FileWriter("FoodPayment.csv")) {
            //create header of the CSV file
            csvWriter.append("Name ");
            csvWriter.append(",");
            csvWriter.append("Function ");
            csvWriter.append(",");
            csvWriter.append("Food Ordered ");
            csvWriter.append(",");
            csvWriter.append("Food full price ");
            csvWriter.append(",");
            csvWriter.append("Price to be paid ");
            csvWriter.append("\n");

            /*person1.logPayment(supa);
            person1.orderFood(desert);
            person2.orderFood(felul2);
            person3.orderFood(supa);
            person3.orderFood(supa);*/

            csvWriter.append(person1.performPayment(supa));     csvWriter.append("\n");
            csvWriter.append(person1.performPayment(desert));   csvWriter.append("\n");
            csvWriter.append(person2.performPayment(felul2));   csvWriter.append("\n");
            csvWriter.append(person3.performPayment(supa));     csvWriter.append("\n");
            csvWriter.append(person3.performPayment(supa));     csvWriter.append("\n");


            csvWriter.flush();
            csvWriter.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }//end-main
}//end-class
