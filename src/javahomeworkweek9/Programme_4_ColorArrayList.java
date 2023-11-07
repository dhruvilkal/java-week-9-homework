package javahomeworkweek9;
/**
 * Write a Java program to create a new array list, add some colours (string) and print out the collection using for each loop.
 */

import java.util.ArrayList;

public class Programme_4_ColorArrayList {
    //declare main method
    public static void main(String[] args) {
        // Create a new ArrayList to store colors as strings

        ArrayList<String> colourList =new ArrayList<>();

        // Add colour
        colourList.add("Blue");
        colourList.add("Red");
        colourList.add("Yellow");
        colourList.add("Orange");
        colourList.add("Green");

        // print out collection using a for each loop
        System.out.println("Colour in the ArrayList:");
        for(String color : colourList){
            System.out.println(color);
        }

    }
}
