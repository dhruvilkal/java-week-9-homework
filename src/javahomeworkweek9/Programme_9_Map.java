package javahomeworkweek9;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_9_Map {
    // Declare main method
    public static void main(String[] args) {
        // Create a HashMap to store String keys and Integer values
        Map<String,Integer> people =new HashMap<>();

        //Add some key value to map
        people.put("Smith" , 25);
        people.put("John" , 55);
        people.put("Bob" , 57);

        //call the method to iterrate over the values
        iterateOverValues(people);

    }
    public static void iterateOverValues(Map<String,Integer>map){
        //Iterrate over the values usin for each loop
        for (Integer age : map.values()){
            System.out.println("Age:" + age);

        }
    }

}
