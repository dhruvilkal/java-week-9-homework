package javahomeworkweek9;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 5. Write a Java program to iterate through all elements in an array list using Iterater.
 */

public class Programme_5_ArrayListIterator {

    // Declare main method
    public static void main(String[] args) {
        ArrayList<String> arrayList =new ArrayList<>();

        //Add element to arrayList
        arrayList.add("Audi");
        arrayList.add("BMW");
        arrayList.add("Range rover");
        arrayList.add("Honda");

        // call method to iterate and display the elements
        iterateArrayList(arrayList);

    }
    //Method to iterate and display element of the ArrayList using iterator
    public static void iterateArrayList(ArrayList<String> list){
        Iterator<String> iterator = list.iterator();
// use while statement
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }
    }

}
