package javahomeworkweek9;

import java.util.ArrayList;

/**
 *  Write a Java program to test if an array list is empty or not.
 */
public class Programme_7_ArrayListEmptyOrNot {
    // Declare main method
    public static void main(String[] args) {

        // crete an ArrayList
        ArrayList<String> list =new ArrayList<>();

        //add element to ArrayList
        list.add("Audi");
        list.add("BMW");
        list.add("Honda");

        // Checking if arraylist is empty or not

        if(list.isEmpty()){
            System.out.println("The ArrayList is empty");

        }else {
            System.out.println("The ArrayList is not empty");
        }
    }

}
