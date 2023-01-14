package week8_Homework_2;

import java.util.ArrayList;

public class Task3_ColoursArrayList {
   /*
            3.  Write a Java program to create a new array list, add some colours(string) and
    printout the collection using for each loop.
            */

    //Main method
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>(); //create an ArrayList object
        colours.add("Burgundy");
        colours.add("White");
        colours.add("Black");
        colours.add("Blue");
        colours.add("Green");
        colours.add("Orange");
        colours.add("Pink");
        System.out.println("Collection of colours: ");
        System.out.println(colours);
    }
}
