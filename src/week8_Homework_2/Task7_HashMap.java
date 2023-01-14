package week8_Homework_2;

import java.util.HashMap;

public class Task7_HashMap {
    /*

    7. Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.

   */

    public static void hash(){
        HashMap<String, Integer> people = new HashMap<>();
        people.put("KRUNAL", 13);
        people.put("PARESH", 9);
        people.put("ANISH", 10);
        people.put("BHAVESH", 40);
        people.put("GUARANG", 50);
        System.out.println(people);
        System.out.println();

        for (HashMap.Entry<String, Integer> set : people.entrySet()) {
            // Printing all elements of a Map
            System.out.println(set.getKey() + " = " + set.getValue());
        }
    }

    //Main method
    public static void main(String[] args) {
        hash(); //call method
    }

}
